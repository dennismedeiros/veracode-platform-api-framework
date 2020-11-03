package com.dennismedeiros.veracode.platform.api.sdk.io;

import com.dennismedeiros.veracode.platform.api.pojos.reporting.DetailedReport;

public interface PlatformContentStorage {

	boolean verifyStorageAccessable();
	
	void saveDetailedReportContent(DetailedReport report);

}
