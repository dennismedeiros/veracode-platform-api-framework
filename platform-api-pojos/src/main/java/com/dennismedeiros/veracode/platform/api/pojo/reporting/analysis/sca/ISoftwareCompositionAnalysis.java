package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sca;

import java.math.BigInteger;

public interface ISoftwareCompositionAnalysis {

	/**
	 * Gets the value of the vulnerableComponents property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link VulnerableComponentList }
	 *     
	 */
	IVulnerableComponentList getVulnerableComponents();

	/**
	 * Sets the value of the vulnerableComponents property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link VulnerableComponentList }
	 *     
	 */
	void setVulnerableComponents(IVulnerableComponentList value);

	/**
	 * Gets the value of the thirdPartyComponents property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getThirdPartyComponents();

	/**
	 * Sets the value of the thirdPartyComponents property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setThirdPartyComponents(BigInteger value);

	/**
	 * Gets the value of the violatePolicy property.
	 * 
	 */
	boolean isViolatePolicy();

	/**
	 * Sets the value of the violatePolicy property.
	 * 
	 */
	void setViolatePolicy(boolean value);

	/**
	 * Gets the value of the componentsViolatedPolicy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getComponentsViolatedPolicy();

	/**
	 * Sets the value of the componentsViolatedPolicy property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setComponentsViolatedPolicy(BigInteger value);

}