package com.dennismedeiros.veracode.platform.api.credentials;

import com.dennismedeiros.veracode.platform.api.lang.SecureString;

@Deprecated
public class UserPasswordCredential implements Credential {

	private SecureString username = null;
	private SecureString password = null;
	
	public UserPasswordCredential(char[] username, char[] password){
		this.username = new SecureString(username);
		this.password = new SecureString(password);
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return this.username.toString();
	}

	public String getPassword(){
		return this.password.toString();
	}

	@Override
	public char[] getCredential() {
		// TODO Auto-generated method stub
		return null;
	}

}
