package com.dennismedeiros.veracode.platform.api.sdk.reporting;

import java.time.Instant;
import java.util.TreeMap;

public class TrendRecordSet extends TreeMap<Instant, TrendRecordState>{

	private static final long serialVersionUID = -3654526495384303632L;

	public Integer flawId;
	
	public TrendRecordSet(Integer f) {
		this.flawId = f;
	}	
}