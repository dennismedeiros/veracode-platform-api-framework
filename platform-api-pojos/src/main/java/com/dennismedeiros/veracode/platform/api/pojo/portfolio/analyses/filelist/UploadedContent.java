package com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.filelist;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.common.UploadedFile;

public interface UploadedContent {

	List<UploadedFile> getUploadedFiles();

	/**
	 * Gets the value of the filelistVersion property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getFileListVersion();

	/**
	 * Gets the value of the accountId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getAccountId();

	/**
	 * Gets the value of the appId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getApplicationPortfolioId();

	/**
	 * Gets the value of the sandboxId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getSandboxId();

	/**
	 * Gets the value of the buildId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	Long getAnalysisdId();

}