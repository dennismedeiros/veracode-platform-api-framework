package com.dennismedeiros.veracode.platform.api.pojo.common;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.dennismedeiros.veracode.platform.api.pojo.portfolio.PolicyComplianceType;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.PlatformType;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.sast.LifecycleStageType;

public interface IBuildType {

	List<IAnalysisUnitType> getAnalysisUnit();

	/**
	 * Gets the value of the version property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getName();

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setName(String value);

	/**
	 * Gets the value of the buildId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getScanId();

	/**
	 * Sets the value of the buildId property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Long }
	 *     
	 */
	void setScanId(Long value);

	/**
	 * Gets the value of the submitter property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getSubmitter();

	/**
	 * Sets the value of the submitter property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setSubmitter(String value);

	/**
	 * Gets the value of the platform property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link PlatformType }
	 *     
	 */
	PlatformType getPlatform();

	/**
	 * Sets the value of the platform property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link PlatformType }
	 *     
	 */
	void setPlatform(PlatformType value);

	/**
	 * Gets the value of the lifecycleStage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link LifecycleStageType }
	 *     
	 */
	LifecycleStageType getLifecycleStage();

	/**
	 * Sets the value of the lifecycleStage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link LifecycleStageType }
	 *     
	 */
	void setLifecycleStage(LifecycleStageType value);

	/**
	 * Gets the value of the resultsReady property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isResultsReady();

	/**
	 * Sets the value of the resultsReady property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	void setResultsReady(Boolean value);

	/**
	 * Gets the value of the policyName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getPolicyName();

	/**
	 * Sets the value of the policyName property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setPolicyName(String value);

	/**
	 * Gets the value of the policyVersion property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getPolicyVersion();

	/**
	 * Sets the value of the policyVersion property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setPolicyVersion(BigInteger value);

	/**
	 * Gets the value of the policyComplianceStatus property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link PolicyComplianceType }
	 *     
	 */
	PolicyComplianceType getPolicyComplianceStatus();

	/**
	 * Sets the value of the policyComplianceStatus property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link PolicyComplianceType }
	 *     
	 */
	void setPolicyComplianceStatus(PolicyComplianceType value);

	/**
	 * Gets the value of the policyUpdatedDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getPolicyUpdatedDate();

	/**
	 * Sets the value of the policyUpdatedDate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setPolicyUpdatedDate(String value);

	/**
	 * Gets the value of the rulesStatus property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link PolicyComplianceType }
	 *     
	 */
	PolicyComplianceType getRulesStatus();

	/**
	 * Sets the value of the rulesStatus property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link PolicyComplianceType }
	 *     
	 */
	void setRulesStatus(PolicyComplianceType value);

	/**
	 * Gets the value of the gracePeriodExpired property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isGracePeriodExpired();

	/**
	 * Sets the value of the gracePeriodExpired property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	void setGracePeriodExpired(Boolean value);

	/**
	 * Gets the value of the scanOverdue property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isScanOverdue();

	/**
	 * Sets the value of the scanOverdue property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	void setScanOverdue(Boolean value);

	/**
	 * Gets the value of the legacyScanEngine property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isLegacyScanEngine();

	/**
	 * Sets the value of the legacyScanEngine property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	void setLegacyScanEngine(Boolean value);

	/**
	 * Gets the value of the launchDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	XMLGregorianCalendar getLaunchDate();

	/**
	 * Sets the value of the launchDate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	void setLaunchDate(XMLGregorianCalendar value);

}