package com.dennismedeiros.veracode.platform.api.credentials;

public class TokenKeyCredential implements Credentials{

	//TODO: replace with SecureString
	private char[] id;
	private char[] key;
	
	public static Credentials create(char[] id, char[] key) {
		return new TokenKeyCredential(id, key);
	}
	
	private TokenKeyCredential(char[] id, char[] key) {
		this.id = id;
		this.key = key;
	}
		
	public char[] getKey() {
		return this.key;
	}
	
	public char[] getID() {
		return this.id;
	}

	@Override
	public char[] getCredentials() {
		return String.format("\"id\" : \"%s\" , \"key\" : \"%s\"", this.id, this.key).toCharArray();
	}

}
