package com.dennismedeiros.veracode.platform.api.sdk.reporting.sast;

import java.util.ArrayList;

import com.dennismedeiros.veracode.platform.api.sdk.reporting.TrendRecordSet;

public class FlawTrend extends ArrayList<TrendRecordSet> {

	private static final long serialVersionUID = 1L;
	
	private long _flawid = 0;
	
	public FlawTrend(long flawid) {
		this._flawid = flawid;
	}
}
