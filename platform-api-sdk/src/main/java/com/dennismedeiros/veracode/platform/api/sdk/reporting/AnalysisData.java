package com.dennismedeiros.veracode.platform.api.sdk.reporting;

import java.time.Instant;
import java.util.TreeMap;

import com.dennismedeiros.veracode.platform.api.pojos.analyses.Find;

public class AnalysisData extends TreeMap<Integer, Find> {

	private static final long serialVersionUID = -2288506615534011228L;

	private Instant published;
	private long scanId;
	private String scanName;
	
	public AnalysisData(long scanid, String scanname, Instant published) {
		this.scanId = scanid;
		this.scanName = scanname;
		this.published = published;
	}

	public Instant getPublished() {
		return published;
	}
	public long getAnalysisId() {
		return scanId;
	}
	
	public String getScanName() {
		return scanName;
	}
}