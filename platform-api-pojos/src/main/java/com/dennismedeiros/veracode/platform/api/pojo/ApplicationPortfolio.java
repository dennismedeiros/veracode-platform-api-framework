package com.dennismedeiros.veracode.platform.api.pojo;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.common.IndustryVerticalType;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.ApplicationType;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.BusinessCriticalityType;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.CustomField;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.DeploymentMethodType;

/**
 * Interface representing an Application Portfolio within the Veracode Platform.
 * 
 * @author Dennis Medeiros
 *
 */
public interface ApplicationPortfolio {

	List<CustomField> getCustomfield();

	/**
	 * Gets the value of the Application Portfolio ID property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getId();

	/**
	 * Sets the value of the Application Portfolio ID property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Long }
	 *     
	 */
	void setId(Long value);

	/**
	 * Gets the value of the Application Portfolio Name property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getName();

	/**
	 * Sets the value of the Application Portfolio property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setName(String value);

	/**
	 * Gets the value of the vendor property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getVendorName();

	/**
	 * Sets the value of the vendor property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setVendorName(String value);

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

	/**
	 * Gets the value of the businessCriticality property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BusinessCriticalityType }
	 *     
	 */
	BusinessCriticalityType getBusinessCriticality();

	/**
	 * Sets the value of the businessCriticality property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BusinessCriticalityType }
	 *     
	 */
	void setBusinessCriticality(BusinessCriticalityType value);

	/**
	 * Gets the value of the policy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getPolicy();

	/**
	 * Sets the value of the policy property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setPolicy(String value);

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
	 * Gets the value of the teams property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getTeams();

	/**
	 * Sets the value of the teams property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setTeams(String value);

	/**
	 * Gets the value of the origin property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getOrigin();

	/**
	 * Sets the value of the origin property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setOrigin(String value);

	/**
	 * Gets the value of the industryVertical property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link IndustryVerticalType }
	 *     
	 */
	IndustryVerticalType getIndustryVertical();

	/**
	 * Sets the value of the industryVertical property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link IndustryVerticalType }
	 *     
	 */
	void setIndustryVertical(IndustryVerticalType value);

	/**
	 * Gets the value of the appType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ApplicationType }
	 *     
	 */
	ApplicationType getAppType();

	/**
	 * Sets the value of the appType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ApplicationType }
	 *     
	 */
	void setAppType(ApplicationType value);

	/**
	 * Gets the value of the deploymentMethod property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link DeploymentMethodType }
	 *     
	 */
	DeploymentMethodType getDeploymentMethod();

	/**
	 * Sets the value of the deploymentMethod property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link DeploymentMethodType }
	 *     
	 */
	void setDeploymentMethod(DeploymentMethodType value);

	/**
	 * Gets the value of the isWebApplication property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isIsWebApplication();

	/**
	 * Sets the value of the isWebApplication property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	void setIsWebApplication(Boolean value);

	/**
	 * Gets the value of the archerAppName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getArcherAppName();

	/**
	 * Sets the value of the archerAppName property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setArcherAppName(String value);

	/**
	 * Gets the value of the modifiedDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getModifiedDate();

	/**
	 * Sets the value of the modifiedDate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setModifiedDate(String value);

	/**
	 * Gets the value of the cots property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isCots();

	/**
	 * Sets the value of the cots property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	void setCots(Boolean value);

	/**
	 * Gets the value of the vast property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	Boolean isVast();

	/**
	 * Sets the value of the vast property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	void setVast(Boolean value);

	/**
	 * Gets the value of the vendorId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getVendorId();

	/**
	 * Sets the value of the vendorId property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Long }
	 *     
	 */
	void setVendorId(Long value);

	/**
	 * Gets the value of the businessUnit property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getBusinessUnit();

	/**
	 * Sets the value of the businessUnit property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setBusinessUnit(String value);

	/**
	 * Gets the value of the businessOwner property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getBusinessOwner();

	/**
	 * Sets the value of the businessOwner property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setBusinessOwner(String value);

	/**
	 * Gets the value of the businessOwnerEmail property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getBusinessOwnerEmail();

	/**
	 * Sets the value of the businessOwnerEmail property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setBusinessOwnerEmail(String value);

	/**
	 * Gets the value of the tags property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getTags();

	/**
	 * Sets the value of the tags property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setTags(String value);

}