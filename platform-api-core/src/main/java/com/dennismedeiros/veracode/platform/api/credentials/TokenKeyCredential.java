package com.dennismedeiros.veracode.platform.api.credentials;

public class TokenKeyCredential implements Credential{

	private char[] id;
	private char[] key;
	
	public TokenKeyCredential(char[] id, char[] key) {
		this.id = id;
		this.key = key;
	}
		
	public String getKey() {
		return String.valueOf(this.key);
	}
	
	public String getID() {
		return String.valueOf(this.id);
	}

	@Override
	public char[] getCredential() {
		return String.format("\"id\" : \"%s\" , \"key\" : \"%s\"", this.id, this.key).toCharArray();
	}

}
