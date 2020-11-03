package com.dennismedeiros.veracode.platform.api.pojos;

import java.util.List;

public interface Scans {

	List<Scan> getScans();
	String getScanListVersion();

	Long getAccountId();
	Long getAppId();
	String getAppName();

}