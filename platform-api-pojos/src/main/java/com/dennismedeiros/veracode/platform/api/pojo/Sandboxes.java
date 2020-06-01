package com.dennismedeiros.veracode.platform.api.pojo;

import java.util.List;

public interface Sandboxes {

	List<Sandbox> getSandboxes();

	/**
	 * Gets the value of the sandboxlistVersion property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 * 
	 */
	String getSandboxlistVersion();

	/**
	 * Sets the value of the sandboxlistVersion property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setSandboxlistVersion(String value);

	/**
	 * Gets the value of the accountId property.
	 * @return Account identifier
	 */
	long getAccountId();

	/**
	 * Sets the value of the accountId property.
	 * @param value Sets the value for the account id
	 */
	void setAccountId(Long value);

	/**
	 * Gets the value of the appId property.
	 * @return Returns Application Id
	 */
	long getAppId();

	/**
	 * Sets the value of the appId property.
	 * @param value value of appid
	 */
	void setAppId(Long value);

}