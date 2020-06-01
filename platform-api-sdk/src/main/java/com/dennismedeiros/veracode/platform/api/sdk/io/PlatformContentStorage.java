package com.dennismedeiros.veracode.platform.api.sdk.io;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;

public interface PlatformContentStorage {

	boolean verifyStorageAccessable();
	
	void saveDetailedReportContent(DetailedReport report);

}
