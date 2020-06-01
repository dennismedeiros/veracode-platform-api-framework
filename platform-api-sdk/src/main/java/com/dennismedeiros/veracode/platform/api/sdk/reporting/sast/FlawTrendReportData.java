package com.dennismedeiros.veracode.platform.api.sdk.reporting.sast;

import java.util.Map;

import com.dennismedeiros.veracode.platform.api.sdk.reporting.AnalysisData;

public class FlawTrendReportData {
	public String _appName;
	public long _appId;
	
	public Map<Long, AnalysisData> _scans;

	public FlawTrendReportData() {
	}
}