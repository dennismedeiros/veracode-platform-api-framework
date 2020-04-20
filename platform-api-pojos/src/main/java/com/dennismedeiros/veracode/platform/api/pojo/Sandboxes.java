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
	 * 
	 */
	long getAccountId();

	/**
	 * Sets the value of the accountId property.
	 * 
	 */
	void setAccountId(Long value);

	/**
	 * Gets the value of the appId property.
	 * 
	 */
	long getAppId();

	/**
	 * Sets the value of the appId property.
	 * 
	 */
	void setAppId(Long value);

}