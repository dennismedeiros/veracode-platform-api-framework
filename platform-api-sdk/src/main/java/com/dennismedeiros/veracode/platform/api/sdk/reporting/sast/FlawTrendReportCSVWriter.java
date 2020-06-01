package com.dennismedeiros.veracode.platform.api.sdk.reporting.sast;

import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.sdk.reporting.TrendRecordSet;
import com.dennismedeiros.veracode.platform.api.sdk.reporting.TrendRecordState;

public class FlawTrendReportCSVWriter {
	final static Logger logger = LoggerFactory.getLogger(FlawTrendReportCSVWriter.class);

	private final String publishedDateFormat = "yyyy-MM-dd";
	
	private Map<Integer, TrendRecordSet> trendMatrix = null;
	private Writer writer = null;
	
	public FlawTrendReportCSVWriter(Writer writer){
		this.writer = writer;
	}
	public void write(Map<Integer, TrendRecordSet> trendMatrix) {
		
		if(trendMatrix != null) {
			this.trendMatrix = trendMatrix;
			
			try {
				if(this.writer != null) {
					this.writeHeaders(this.writer);
					
					Set<Integer> flawids = this.trendMatrix.keySet();
					flawids.forEach(flawid -> {
						this.writeFlawTrend(this.writer, flawid);
					});
					
					this.writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			//throw exception
		}
	}	
	private String writeRowStarter(Integer flawid) {
		StringBuilder sb = new StringBuilder();
		
		TrendRecordSet recordSet = this.trendMatrix.get(flawid);
		
		Collection<TrendRecordState> recordEntries = recordSet.values();
		Optional<TrendRecordState> a = recordEntries.stream()
				.filter( (f) -> { return !f.sourceFile.isEmpty() && !f.cweId.equals(0); 
		}).findFirst();
		
		if(a.isPresent()) {
			TrendRecordState trendRecordState = a.get();
			sb.append(String.format("%d,%d,%s,%d,", flawid, 
					trendRecordState.cweId, 
					trendRecordState.sourceFile, 
					trendRecordState.lineNUmber));	
		} else {
			sb.append(String.format("%d,%s,%s,%s,", flawid, 
					"unknown", 
					"unknown", 
					"unknown"));
		}
		
		return sb.toString();
	}
	private void writeFlawTrend(Writer writer, Integer flawid) {
		
		try {
			StringBuilder sb = new StringBuilder();	
			sb.append(this.writeRowStarter(flawid));
			
			if(this.trendMatrix.containsKey(flawid)) {
				Map<Instant, TrendRecordState> trend = this.trendMatrix.get(flawid);
				
				Set<Instant> dateKeys = trend.keySet();
				Iterator<Instant> dateKeysItr = dateKeys.iterator();
		
				int indexCount = 0;
				while(dateKeysItr.hasNext()) {
					Instant dateKey = dateKeysItr.next();			
					if(trend.containsKey(dateKey)) {
						TrendRecordState trendRecordState = trend.get(dateKey);
						
						if(indexCount > 0) {
							sb.append(",");
						}
						
						if(trendRecordState != null) {
							sb.append(String.format("%s", trendRecordState.remedaitionStatus.trim()));
						}
						indexCount++;
					}	
				}
				
				logger.debug(sb.toString());
				writer.write(sb.toString());
				writer.append("\r\n");	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void writeHeaders(Writer writer) {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("FlawId , CWEID, Source, Line Number,");
			
			Set<Integer> keys = this.trendMatrix.keySet();
			if(!keys.isEmpty()) {
				Integer key = keys.iterator().next();
				
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(publishedDateFormat);
				//simpleDateFormat.parse(source);
				
				Map<?, ?> publishedDates = this.trendMatrix.get(key);
				
				Set<?> dateKeys = publishedDates.keySet();
				Iterator<?> itr = dateKeys.iterator();
				
				//Insert Trend
				int indexCount = 0;
				while(itr.hasNext()) {
					Object date = itr.next();
					if(indexCount > 0) {
						sb.append(",");
					}
					sb.append(String.format("%s", simpleDateFormat.format(date)));
					indexCount++;
				}
			}
			logger.debug(sb.toString());
			writer.write(sb.toString());
			writer.append("\r\n");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
