package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sca;

import java.math.BigInteger;

public interface Component {

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getFileName();

	/**
	 * Sets the value of the fileName property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setFileName(String value);

	/**
	 * Gets the value of the sha1 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getSha1();

	/**
	 * Sets the value of the sha1 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setSha1(String value);

	/**
	 * Gets the value of the vulnerabilities property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getVulnerabilities();

	/**
	 * Sets the value of the vulnerabilities property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setVulnerabilities(BigInteger value);

	/**
	 * Gets the value of the maxCvssScore property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getMaxCvssScore();

	/**
	 * Sets the value of the maxCvssScore property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setMaxCvssScore(String value);

	/**
	 * Gets the value of the library property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getLibrary();

	/**
	 * Sets the value of the library property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setLibrary(String value);

	/**
	 * Gets the value of the version property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getVersion();

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setVersion(String value);

	/**
	 * Gets the value of the vendor property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getVendor();

	/**
	 * Sets the value of the vendor property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setVendor(String value);

	/**
	 * Gets the value of the description property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getDescription();

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setDescription(String value);

}