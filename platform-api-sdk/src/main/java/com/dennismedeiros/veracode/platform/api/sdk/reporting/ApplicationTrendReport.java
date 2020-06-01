package com.dennismedeiros.veracode.platform.api.sdk.reporting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.sdk.reporting.sast.IFlawTrendReport;

public class ApplicationTrendReport implements IFlawTrendReport {
	
	final static Logger logger = LoggerFactory.getLogger(ApplicationTrendReport.class);
	
	private Map<Integer, TrendRecordSet> trendRecordSets = new TreeMap<Integer, TrendRecordSet>();
	
	private Integer highId = 0;
	private Integer lowId = 0;
	
	private long _appid;
	private String _appname;
	
	//Constructor
	public ApplicationTrendReport(long appid, String appname) {
		this._appid = appid;
		this._appname = appname;
	}
	
	public long getAppId() {
		return _appid;
	}
	
	public String getAppName() {
		return _appname;
	}
	
	public Collection<Integer> getKeys(){
		return trendRecordSets.keySet();
	}
	
	public TrendRecordSet getValue(Integer key){
		return trendRecordSets.get(key);
	}

	public void addTrendRecord(Integer flawid, TrendRecordSet record) {
		
		if(!trendRecordSets.containsKey(flawid)) {
			trendRecordSets.put(flawid, record);
		} else {
			trendRecordSets.replace(flawid, record);
		}
	}
}
