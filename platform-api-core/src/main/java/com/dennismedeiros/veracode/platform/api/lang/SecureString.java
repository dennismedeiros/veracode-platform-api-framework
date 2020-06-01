package com.dennismedeiros.veracode.platform.api.lang;

import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureString implements Serializable, CharSequence, Comparable<SecureString>  {

	private static final Logger logger = LoggerFactory.getLogger(SecureString.class);
	
	private static final long serialVersionUID = 7657838334507519999L;
	private static final String cipherprotocol = "AES"; //TODO://"AES/CBC/PKCS5Padding";
	
	private static transient SecretKey _genkey = SecureString.generateKey();
	
	private int _length = 0;
	private byte[] _securestring = null;
	
	public SecureString(){
	}
	
	public SecureString(char[] chars){
		try {
			this._length = chars.length;
			this._securestring = this.encrypt(this.toBytes(chars));
		} catch (Exception e) {
			logger.error(e.getMessage());
		} 
	}
	
	public char[] toArray(){
		char[] result = new char[1];
		
		try {
			result = this.toChars(this.decrypt(_securestring));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return result;
	}
	
	@Override
	public boolean equals(Object o) 
	{
		boolean result = false;
		
	    if (o instanceof SecureString) 
	    {
	      SecureString s = (SecureString) o;
	      if ( Arrays.equals(this._securestring, s._securestring) ) 
	         result = true;
	    }
	    return result;
	}
	
	public String toString(){
		
		String rtn = null;
		try {
			rtn = String.copyValueOf(this.toChars(this.decrypt(this._securestring)));
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return rtn; 
	}
	
	public void append(char[] string){
		//char[] hold = new char[(string.length + this.securestring.length)];
		//System.arraycopy(this.securestring, 0, hold, 0, this.securestring.length);
		//System.arraycopy(string, 0, hold, this.securestring.length + 1, string.length);
		
		//this.securestring = hold;
	}

	public int compareTo(SecureString o) {
		//boolean bResult = false;
		
		if(this._securestring.equals(o._securestring)) {
			//bResult = true;
		}
		
		return 0;
	}
	
	public int length() {
		return this._length;
	}

	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static SecretKey generateKey() {
		SecretKey key = null; 
		try {
			KeyGenerator KeyGen = KeyGenerator.getInstance("AES");
			KeyGen.init(128);
			
			key = KeyGen.generateKey();
		} catch (NoSuchAlgorithmException e) {
			logger.error(e.getMessage());
		}

	    return key;
	}
	
	private char[] toChars(byte[] bytes) {
		char[] content = new char[bytes.length/2];
		for(int i=0, j=0; j < bytes.length; i++, j++) {
			content[i] = (char) ((bytes[j] << 8) + bytes[++j]);
		}
		
		return content;
	}
	
	private byte[] toBytes(char[] data) {
		byte[] toRet = new byte[(data.length*2)];
		
		for(int i = 0, j = 0; i < data.length; i++, j++) {
			toRet[j]   = (byte) (data[i] >> 8);
			toRet[++j] = (byte) data[i];
		}
		
		return toRet;
	}
	
	private byte[] encrypt(byte[] plainText) throws IllegalBlockSizeException, 
		BadPaddingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException{
		Cipher cipher = Cipher.getInstance(cipherprotocol);
		cipher.init(Cipher.ENCRYPT_MODE, SecureString._genkey);
		
		return cipher.doFinal(plainText);
	}
	
	private byte[] decrypt(byte[] cipherText) throws InvalidKeyException, 
		IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException{
		Cipher cipher = Cipher.getInstance(cipherprotocol);
		cipher.init(Cipher.DECRYPT_MODE, SecureString._genkey);
		
		return cipher.doFinal(cipherText);
	}
	
	/*
	private void test() {
		String FileName = "encryptedtext.txt";
	    String FileName2 = "decryptedtext.txt";
		try {
		    KeyGenerator KeyGen = KeyGenerator.getInstance("AES");
		    KeyGen.init(128);
		
		    SecretKey SecKey = KeyGen.generateKey();
		
		    //Cipher AesCipher = Cipher.getInstance("AES");
		    Cipher AesCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		    byte[] byteText = "Your Plain Text Here".getBytes();
		
		    AesCipher.init(Cipher.ENCRYPT_MODE, SecKey);
		    byte[] byteCipherText = AesCipher.doFinal(byteText);
		    Files.write(Paths.get(FileName), byteCipherText);
		
		
		    byte[] cipherText = Files.readAllBytes(Paths.get(FileName));
		
		    AesCipher.init(Cipher.DECRYPT_MODE, SecKey);
		    byte[] bytePlainText = AesCipher.doFinal(cipherText);
		    Files.write(Paths.get(FileName2), bytePlainText);
		}catch(Exception e) {
		}
	}
	*/
	/*
	public static void main(String[] args) {
		    
		   // initializing three byte arrays
		   byte[] arr1 = new byte[] { 12, 31, 22 , 44 };
		   byte[] arr2 = new byte[] { 12, 31, 22 , 44 };
		   byte[] arr3 = new byte[] { 31, 44, 12 , 22 };
		    
		   // comparing arr1 and arr2
		   boolean retval=Arrays.equals(arr1, arr2);
		   System.out.println("arr1 and arr2 equal: " + retval);

		   // comparing arr1 and arr3
		   boolean retval2=Arrays.equals(arr1, arr3);
		   System.out.println("arr1 and arr3 equal: " + retval2);
	}
	*/
	/*
	public static void main(String[] args) {
		String value1 = "Test123";
		String value2 = "Test12";
		String value3 = "Test1";
		//SecureString secureString = new SecureString();
		SecureString secureString1 = new SecureString(value1.toCharArray());		
		SecureString secureString2 = new SecureString(value2.toCharArray());
		SecureString secureString3 = new SecureString(value3.toCharArray());
		
		System.out.println(String.format("Result1: %s", secureString1.toString()));
		System.out.println(String.format("Result3: %s", secureString3.toString()));
		System.out.println(String.format("Result2: %s", secureString2.toString()));
	}
	*/
	//public void run() {
		//ByteBuffer b = ByteBuffer.wrap(value.getBytes());
		//Integer.toBinaryString(i);
		//System.out.println(String.format("Buffer content %s", Integer.toBinaryString(value.getBytes())));
		//System.out.println(value.getBytes().toString());
		/*
		byte[] output = this.toBytes(value.toCharArray());
		for(int i = 0; i < output.length; i++) {
			System.out.println(String.format("output[%d]='%s'", i, Integer.toBinaryString(output[i])));
		}
		
		char[] charArray = this.toChars(output);
		for(int i = 0; i < charArray.length; i++) {
			System.out.println(String.format("charArray[%d]='%s'", i, Integer.toBinaryString(charArray[i])));
		}
		
		System.out.println(String.format("Resutl: %s", String.copyValueOf(charArray)));
		*/
	//}
	/*
	private byte[] toBytes(char[] chars) {
	    CharBuffer charBuffer = CharBuffer.wrap(chars);
	    ByteBuffer byteBuffer = Charset.forName("UTF-8").encode(charBuffer);
	    byte[] bytes = Arrays.copyOfRange(byteBuffer.array(),
	            byteBuffer.position(), byteBuffer.limit());
	    Arrays.fill(charBuffer.array(), '\u0000'); // clear sensitive data
	    Arrays.fill(byteBuffer.array(), (byte) 0); // clear sensitive data
	    return bytes;
	}
	*/
}
