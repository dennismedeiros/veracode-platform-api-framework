package com.dennismedeiros.veracode.platform.api.sdk.io;

import java.io.File;
import java.io.FileReader;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.ApplicationPortfolios;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ApplicationListXmlParser;

public class ApplicationListReader {
	
	public String generateApplicationListFileName(String accountNumber, String appName) {
		return "32818 - ApplicationList.xml";
	}
	
	public ApplicationPortfolios readApplicationList(File file){
		ApplicationPortfolios appList = null;
		
		try {
			ApplicationListXmlParser parser = new ApplicationListXmlParser();
			appList = parser.parseContent(new FileReader(file));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
		}
	
		return appList;
	}
}
