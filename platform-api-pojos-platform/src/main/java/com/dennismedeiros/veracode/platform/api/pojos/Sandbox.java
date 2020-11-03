package com.dennismedeiros.veracode.platform.api.pojos;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.CustomField;

public interface Sandbox extends Scan {

	List<CustomField> getCustomfield();

	/**
	 * Gets the value of the sandboxId property.
	 * @return
	 *     possible object is
	 *     {@link long }
	 */
	long getSandboxId();

	/**
	 * Sets the value of the sandboxId property.
	 * @param value
	 *     allowed object is
	 *     {@link long } 
	 */
	void setSandboxId(long value);

	/**
	 * Gets the value of the sandboxName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getSandboxName();

	/**
	 * Sets the value of the sandboxName property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setSandboxName(String value);

	/**
	 * Gets the value of the owner property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getOwner();

	/**
	 * Sets the value of the owner property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setOwner(String value);

	/**
	 * Gets the value of the lastModified property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getLastModified();

	/**
	 * Sets the value of the lastModified property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setLastModified(String value);

}