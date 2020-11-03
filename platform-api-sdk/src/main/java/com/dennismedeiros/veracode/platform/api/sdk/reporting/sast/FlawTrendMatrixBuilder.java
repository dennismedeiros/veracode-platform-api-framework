package com.dennismedeiros.veracode.platform.api.sdk.reporting.sast;

import java.time.Instant;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.pojos.analyses.Find;
import com.dennismedeiros.veracode.platform.api.sdk.reporting.AnalysisData;
import com.dennismedeiros.veracode.platform.api.sdk.reporting.TrendRecordSet;
import com.dennismedeiros.veracode.platform.api.sdk.reporting.TrendRecordState;

public class FlawTrendMatrixBuilder {
	final static Logger logger = LoggerFactory.getLogger(FlawTrendMatrixBuilder.class);
	
	private SortedSet<Integer> flawIds = new TreeSet<Integer>();
	//private List<Long> flawIds = new ArrayList<Long>();
	
	private Map<Instant,AnalysisData> analysisData = new TreeMap<Instant,AnalysisData>();
	
	public boolean addAnalysisData(AnalysisData data) {
		boolean result = false;
		
		if(data != null && !analysisData.containsValue(data)) {
			
			logger.debug(String.format("Analysis Data for '%s' was not previously submitted.", data.getScanName()));
			this.analysisData.put(data.getPublished(), data);
			
			Set<Integer> flawKeys = data.keySet();
			
			if(!flawIds.addAll(flawKeys))
				logger.debug("Failed to add keys.");
		}
		
		return result; 
	}
	
	public void printFlawIds() {
		this.flawIds.forEach(f -> {
			logger.debug(String.format("%d", f));
		});
	}
	
	public Map<Integer, TrendRecordSet> buildMatrix() {
		
		//TrendRecordSet ==
		Map<Integer, TrendRecordSet> trendRecords = new TreeMap<Integer, TrendRecordSet>();
		
		flawIds.forEach(f -> {
			TrendRecordSet trendRecordSet = new TrendRecordSet(f); //Using Flaw ID
			logger.debug(String.format("Building Trend Matrix for flaw ID: %d", f));
			Set<Instant> dateKeys = analysisData.keySet();
			Iterator<Instant> itr = dateKeys.iterator();
		
			while(itr.hasNext()) {
				Instant dateKey = itr.next();
				logger.debug(String.format("DateKey: %s", dateKey.toString()));
			
				TrendRecordState trendRecordState = new TrendRecordState();
				AnalysisData data = analysisData.get(dateKey);
				if(data != null) {
					Find finding = data.get(f);
					logger.debug(String.format("Looing up: %s::%d in analysis data", dateKey, f));
			
//					if(finding != null) {
//						trendRecordState.sourceFile = finding.getSourceFile();
//						trendRecordState.lineNUmber = Integer.valueOf(finding.getLine().toString());
//						trendRecordState.remedaitionStatus = finding.getRemediationStatus();
//						trendRecordState.cweId = Integer.valueOf(finding.getCweid().toString());
//						logger.debug(String.format("FlawId: %d, CWEID:%d, RS:%s", f, trendRecordState.cweId, trendRecordState.remedaitionStatus));
//					}
				}
				//logger.debug(String.format("Recording %d::%s status: %s", f, dateKey, lastState));
				trendRecordSet.put(dateKey, trendRecordState); //Add Key and data to Record
			}
			
			trendRecords.put(f, trendRecordSet);
		});
		
		return trendRecords;
	}
	
	public void printMatrix() {
		
	}
}
