package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.datapath;

import java.util.List;

public interface DataPath {

	/**
	 * Gets the value of the call property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the call property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getCall().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CallType }
	 * 
	 * @return Returns a list of CallType
	 */
	List<CallType> getCall();

	/**
	 * Gets the value of the moduleName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getModuleName();

	/**
	 * Gets the value of the steps property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	Integer getSteps();

	/**
	 * Gets the value of the localPath property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getLocalPath();

	/**
	 * Gets the value of the functionName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getFunctionName();

	/**
	 * Gets the value of the lineNumber property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getLineNumber();

}