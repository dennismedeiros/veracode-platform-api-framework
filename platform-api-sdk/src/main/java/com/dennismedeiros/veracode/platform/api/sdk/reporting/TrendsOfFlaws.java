package com.dennismedeiros.veracode.platform.api.sdk.reporting;

import java.util.HashMap;

import com.dennismedeiros.veracode.platform.api.sdk.reporting.sast.FlawTrend;

//flaw id, Array<Trend>
public class TrendsOfFlaws extends HashMap<Long, FlawTrend> {
	
	private static final long serialVersionUID = 1L;
	/*
	boolean containsFlawId(IFlaw flaw) {
		return this.containsKey(Long.valueOf(flaw.getId()));
	}
	
	boolean containsFlawId(long flawid) {
		return this.containsKey(flawid);
	}
	
	FlawTrend getFlawTrend(long flawid) {
		FlawTrend ft = null;
		if(this.containsKey(flawid)) {
			ft = this.get(flawid);	
		}
		
		return ft;
	}
	*/
}