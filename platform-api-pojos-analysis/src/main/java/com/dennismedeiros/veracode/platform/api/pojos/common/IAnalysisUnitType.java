package com.dennismedeiros.veracode.platform.api.pojos.common;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;


public interface IAnalysisUnitType {

	/**
	 * Gets the value of the analysisType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link AnalysisType }
	 *     
	 */
	AnalysisType getAnalysisType();

	/**
	 * Sets the value of the analysisType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link AnalysisType }
	 *     
	 */
	void setAnalysisType(AnalysisType value);

	/**
	 * Gets the value of the publishedDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	XMLGregorianCalendar getPublishedDate();

	/**
	 * Sets the value of the publishedDate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	void setPublishedDate(XMLGregorianCalendar value);

	/**
	 * Gets the value of the publishedDateSec property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getPublishedDateSec();

	/**
	 * Sets the value of the publishedDateSec property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setPublishedDateSec(BigInteger value);

	/**
	 * Gets the value of the status property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link AnalysisStatusType }
	 *     
	 */
	AnalysisStatusType getStatus();

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link AnalysisStatusType }
	 *     
	 */
	void setStatus(AnalysisStatusType value);

	/**
	 * Gets the value of the estimatedScanHours property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getEstimatedScanHours();

	/**
	 * Sets the value of the estimatedScanHours property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *     
	 */
	void setEstimatedScanHours(BigInteger value);

	/**
	 * Gets the value of the estimatedDeliveryDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	XMLGregorianCalendar getEstimatedDeliveryDate();

	/**
	 * Sets the value of the estimatedDeliveryDate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link XMLGregorianCalendar }
	 *     
	 */
	void setEstimatedDeliveryDate(XMLGregorianCalendar value);

	/**
	 * Gets the value of the engineVersion property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getEngineVersion();

	/**
	 * Sets the value of the engineVersion property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	void setEngineVersion(String value);

}