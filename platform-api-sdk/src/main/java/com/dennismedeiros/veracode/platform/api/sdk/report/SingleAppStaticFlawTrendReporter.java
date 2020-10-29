package com.dennismedeiros.veracode.platform.api.sdk.report;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.Find;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.sdk.reporting.AnalysisData;
import com.dennismedeiros.veracode.platform.api.sdk.reporting.TrendRecordSet;
import com.dennismedeiros.veracode.platform.api.sdk.reporting.sast.FlawTrendMatrixBuilder;

public class SingleAppStaticFlawTrendReporter {
	
	final static Logger logger = LoggerFactory.getLogger(SingleAppStaticFlawTrendReporter.class);
	
	private static final String datetimeformat = "yyyy-MM-dd HH:mm:ss 'UTC'";
	
	private static final String timezone = "GMT";

	private Long appid = -1L;
	private Long countOfReports = 0L;
	
	private FlawTrendMatrixBuilder builder = new FlawTrendMatrixBuilder();
	
	public Map<Long, Map<Integer, TrendRecordSet>> generate(List<DetailedReport> detailedreports) {
		
		logger.debug(String.format("DetailedReports Submitted: %d", detailedreports.size()));
		
		//Long appid, <Integer, Map<Date, String>> 
		Map<Long, Map<Integer, TrendRecordSet>> trendReports = new TreeMap<Long, Map<Integer, TrendRecordSet>>();
		
		//Process each of the Detailed Reports
		detailedreports.forEach( detailedreport -> {
			
			if(this.appid < 0) {
				this.appid = detailedreport.getApplicationPortfolioId();
				logger.debug(String.format("Setting ApplicationId: %d", this.appid));
			}
			
			if(Long.valueOf(detailedreport.getApplicationPortfolioId()).equals(appid)) {
				logger.debug(String.format("Processing: %s", detailedreport.getScanName()));
				if(this.processDetailedReport(detailedreport)) {
					this.countOfReports++;
				}
			}
		});
		
		logger.debug(String.format("Processed Reports: %d", this.countOfReports));
		
		Map<Integer, TrendRecordSet> trendMatrix = this.buildMatrix();
		trendReports.put(this.appid, trendMatrix);	
		
		return trendReports;
	}
	private Map<Integer, TrendRecordSet> buildMatrix() {
		Map<Integer, TrendRecordSet> matrix = new TreeMap<Integer, TrendRecordSet>();
		
		//Build Trend Report Content Matrix
		logger.info(String.format("Building Report Matrix"));
		matrix = builder.buildMatrix();
		
		return matrix;
	}
	private List<Integer> getListOfFlawIds(List<Find> findings) {
		List<Integer> flawids = new ArrayList<Integer>();
		
		if(!findings.isEmpty()) {
			findings.forEach(f-> { flawids.add(f.getId()); });
		}
		
		return flawids;
	}	
	private boolean processDetailedReport(DetailedReport detailedreport) {
		boolean rtnResult = false;
		
		try {
			long appid = detailedreport.getApplicationPortfolioId();
			String appname = detailedreport.getApplicationPortfolioName();
			
			long scanid = detailedreport.getScanId();
			String scanname = detailedreport.getScanName();
			Instant publishedDate = detailedreport.getStaticAnalysisSecurityTestingReport().getPublishedDate();
			
			String engineVersion = detailedreport.getStaticAnalysisSecurityTestingReport().getEngineVersion();
			
			List<Find> findings = null; //detailedreport.getStaticAnalysisFindings();
		
			AnalysisData analysisData = new AnalysisData(scanid, scanname, publishedDate);
			findings.forEach(f -> {
				analysisData.put(f.getId(), f);
			});
			
			builder.addAnalysisData(analysisData);
			
			rtnResult = true;	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rtnResult;
	}
	
//	private ApplicationTrendReport getFlawTrendReport(Long appid, String appname) {
//		ApplicationTrendReport trendreport = null;
//		
//		if(!this.trendReports.containsKey(appid)) {
//			trendreport = this.trendReports.put(appid, new ApplicationTrendReport(appid, appname));
//		} else {
//			trendreport = trendReports.get(appid);
//		}
//		
//		return trendreport;
//	}
	
}
