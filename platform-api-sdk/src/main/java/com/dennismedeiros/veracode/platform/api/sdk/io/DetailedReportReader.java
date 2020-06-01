package com.dennismedeiros.veracode.platform.api.sdk.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.xml.parsers.DetailedReportXmlParser;


public class DetailedReportReader {

	public DetailedReport readDetailedReport(Reader reader) throws IOException {
		DetailedReport report = null;

		try {
			DetailedReportXmlParser parser = new DetailedReportXmlParser();
			report = parser.parseContent(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				reader.close();
			}
		}
		
		return report;	
	}
	
	public DetailedReport readDetailedReport(File file) throws IOException {
		DetailedReport report = null;

		try {
			DetailedReportXmlParser parser = new DetailedReportXmlParser();
			report = parser.parseContent(new FileReader(file));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		
		return report;
	}
	
	public DetailedReport readDetailedReport(InputStream in) throws IOException {
		DetailedReport report = null;

		try {
			DetailedReportXmlParser parser = new DetailedReportXmlParser();
			report = parser.parseContent(in);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				in.close();
			}
		}
		
		return report;
	}
}