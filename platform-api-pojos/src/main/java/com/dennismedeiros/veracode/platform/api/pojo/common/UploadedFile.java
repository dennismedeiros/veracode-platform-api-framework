package com.dennismedeiros.veracode.platform.api.pojo.common;

public interface UploadedFile extends Comparable<UploadedFile> {

	Long getFileId();
	String getFileName();

	//IStatusType getFileStatus();

	/**
	 * Gets the value of the fileMd5 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	String getFileMd5();
}