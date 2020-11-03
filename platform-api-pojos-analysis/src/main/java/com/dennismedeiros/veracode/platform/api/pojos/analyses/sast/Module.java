package com.dennismedeiros.veracode.platform.api.pojos.analyses.sast;

import java.math.BigInteger;

public interface Module {

	/**
	 * Gets the value of the name property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getName();

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setName(String value);

	/**
	 * Gets the value of the compiler property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getCompiler();

	/**
	 * Sets the value of the compiler property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setCompiler(String value);

	/**
	 * Gets the value of the os property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getOs();

	/**
	 * Sets the value of the os property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setOs(String value);

	/**
	 * Gets the value of the architecture property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getArchitecture();

	/**
	 * Sets the value of the architecture property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setArchitecture(String value);

	/**
	 * Gets the value of the loc property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getLoc();

	/**
	 * Sets the value of the loc property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setLoc(BigInteger value);

	/**
	 * Gets the value of the score property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getScore();

	/**
	 * Sets the value of the score property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setScore(BigInteger value);

	/**
	 * Gets the value of the numflawssev0 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNumflawssev0();

	/**
	 * Sets the value of the numflawssev0 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNumflawssev0(BigInteger value);

	/**
	 * Gets the value of the numflawssev1 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNumflawssev1();

	/**
	 * Sets the value of the numflawssev1 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNumflawssev1(BigInteger value);

	/**
	 * Gets the value of the numflawssev2 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNumflawssev2();

	/**
	 * Sets the value of the numflawssev2 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNumflawssev2(BigInteger value);

	/**
	 * Gets the value of the numflawssev3 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNumflawssev3();

	/**
	 * Sets the value of the numflawssev3 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNumflawssev3(BigInteger value);

	/**
	 * Gets the value of the numflawssev4 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNumflawssev4();

	/**
	 * Sets the value of the numflawssev4 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNumflawssev4(BigInteger value);

	/**
	 * Gets the value of the numflawssev5 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getNumflawssev5();

	/**
	 * Sets the value of the numflawssev5 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setNumflawssev5(BigInteger value);

	/**
	 * Gets the value of the targetUrl property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getTargetUrl();

	/**
	 * Sets the value of the targetUrl property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setTargetUrl(String value);

	/**
	 * Gets the value of the domain property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getDomain();

	/**
	 * Sets the value of the domain property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setDomain(String value);

	/**
	 * Gets the value of the approxlinecount property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getApproxlinecount();

	/**
	 * Sets the value of the approxlinecount property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setApproxlinecount(BigInteger value);

}