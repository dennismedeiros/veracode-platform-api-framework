package com.dennismedeiros.veracode.platform.api.pojo.analyses.mast;

import java.math.BigInteger;
import java.util.List;

public interface ManualAnalysis {

	/**
	 * Gets the value of the ciaAdjustment property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	Integer getCiaAdjustment();

	/**
	 * Sets the value of the ciaAdjustment property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	void setCiaAdjustment(Integer value);

	/**
	 * Gets the value of the deliveryConsultant property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the deliveryConsultant property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getDeliveryConsultant().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link String }
	 * 
	 * @return Returns a list of String objects.
	 */
	List<String> getDeliveryConsultant();

	/**
	 * Gets the value of the modules property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ManualAnalysisType.Modules }
	 *     
	 */
	//ManualAnalysisType.Modules getModules();

	/**
	 * Sets the value of the modules property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ManualAnalysisType.Modules }
	 *     
	 */
	//void setModules(ManualAnalysisType.Modules value);

	/**
	 * Gets the value of the rating property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getRating();

	/**
	 * Sets the value of the rating property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setRating(String value);

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
	 * Gets the value of the mitigatedRating property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getMitigatedRating();

	/**
	 * Sets the value of the mitigatedRating property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setMitigatedRating(String value);

	/**
	 * Gets the value of the mitigatedScore property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getMitigatedScore();

	/**
	 * Sets the value of the mitigatedScore property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setMitigatedScore(BigInteger value);

	/**
	 * Gets the value of the submittedDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getSubmittedDate();

	/**
	 * Sets the value of the submittedDate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setSubmittedDate(String value);

	/**
	 * Gets the value of the publishedDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getPublishedDate();

	/**
	 * Sets the value of the publishedDate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setPublishedDate(String value);

	/**
	 * Gets the value of the nextScanDue property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getNextScanDue();

	/**
	 * Sets the value of the nextScanDue property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setNextScanDue(String value);

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

}