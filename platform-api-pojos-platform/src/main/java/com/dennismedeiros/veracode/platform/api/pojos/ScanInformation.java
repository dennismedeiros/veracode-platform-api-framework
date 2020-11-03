package com.dennismedeiros.veracode.platform.api.pojos;

import com.dennismedeiros.veracode.platform.api.pojos.analyses.dast.DynamicScanType;
import com.dennismedeiros.veracode.platform.api.pojos.common.IBuildType;

public interface ScanInformation {
	// Long getScanId();
	// String getName();

	long getAccountId();
	long getAppId();
	long getScanId();
	Long getSandboxId();

	String getBuildinfoVersion();

	DynamicScanType getDynamicScanType();
	IBuildType getScan();
}