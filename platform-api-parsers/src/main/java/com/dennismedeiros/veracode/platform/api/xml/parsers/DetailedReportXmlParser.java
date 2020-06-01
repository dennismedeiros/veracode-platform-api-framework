package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReportDocument;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;


public class DetailedReportXmlParser extends JaxbBaseXmlParser<DetailedReportDocument>{
	
	public DetailedReportXmlParser(){
		super(DetailedReportDocument.class);
	}
	
}
