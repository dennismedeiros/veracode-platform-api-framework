package com.dennismedeiros.veracode.platform.api.pojo;

import com.dennismedeiros.veracode.platform.api.pojo.common.IBuildType;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.scaninfo.DynamicScanType;

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