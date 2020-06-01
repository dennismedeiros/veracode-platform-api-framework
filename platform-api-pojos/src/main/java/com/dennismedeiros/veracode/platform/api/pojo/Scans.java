package com.dennismedeiros.veracode.platform.api.pojo;

import java.util.List;

public interface Scans {

	List<Scan> getScans();
	String getScanListVersion();

	Long getAccountId();
	Long getAppId();
	String getAppName();

}