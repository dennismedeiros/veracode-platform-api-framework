package com.dennismedeiros.veracode.platform.api.pojos.analyses;

import java.math.BigInteger;
import java.time.Instant;
import java.util.List;

/**
 * Interface for generalized information from an analysis type report.
 * 
 * 
 * @author Dennis Medeiros
 *
 */
public interface Analysis {
	
	/**
	 * Gets the value of the analysis unique identifier
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getId();
	
	/**
	 * Gets the value of the modules property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link AnalysisType.Modules }
	 *     
	 */
	//IAnalysisType.IModules getModules();

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
	 * Gets the value of the score property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getScore();

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
	 * Gets the value of the mitigatedScore property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getMitigatedScore();

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
	 * Gets the value of the publishedDate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	Instant getPublishedDate();

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
	 * Gets the value of the engineVersion property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getEngineVersion();

	/**
	 * Gets the value of the scanExitStatusId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *     
	 */
	BigInteger getScanExitStatusId();

	/**
	 * Gets the value of the scanExitStatusDesc property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getScanExitStatusDesc();

	/**
	 * Gets the value of the version property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getName();

	List<Find> getFindings();
}