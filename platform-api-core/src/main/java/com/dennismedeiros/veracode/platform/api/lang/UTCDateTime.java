package com.dennismedeiros.veracode.platform.api.lang;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UTCDateTime implements Cloneable, Comparable<UTCDateTime>, Serializable {
	
	private static final Logger logger = LoggerFactory.getLogger(UTCDateTime.class);
	
	private static final long serialVersionUID = 1L;
	private Instant datetime = Instant.now();
	
	public UTCDateTime() {};
	
	public UTCDateTime(String utcDateTime){
		this.datetime = this.StringToUTCDateTime(utcDateTime);
	}
	
	UTCDateTime(Instant instant) {
		this.datetime = instant;
	}
	
	public static UTCDateTime valueOf(String utcDateTime) {
		UTCDateTime utc = new UTCDateTime();
		
		try {
			String time = utcDateTime.substring(0, utcDateTime.indexOf("UTC"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
			
			utc = UTCDateTime.from(sdf.parse(time).toInstant());
		} catch (ParseException e) {
			logger.error(e.getMessage());
		}
		
		return utc;
	}
	
	public static UTCDateTime from(Instant instant) {
		return new UTCDateTime(instant);
	}

	public Instant toInstant() {
		return this.datetime;
	}
	
	@Override
	public String toString() {
		return String.format("%s UTC", Date.from(this.datetime));
	}
	
	@Override
	public int compareTo(UTCDateTime o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private Instant StringToUTCDateTime(String utcDateTime) {
		Instant datetime = null;
		try {
			String time = utcDateTime.substring(0, utcDateTime.indexOf("UTC"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
			
			datetime = sdf.parse(time).toInstant();
		} catch (ParseException e) {
			logger.error(e.getMessage());
		}
	
		return datetime;
	}

}
