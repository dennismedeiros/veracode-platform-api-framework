package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.prescan.PrescanResults;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class PrescanResultXmlParser extends JaxbBaseXmlParser<PrescanResults> {

	public PrescanResultXmlParser() {
		super(PrescanResults.class);
		// TODO Auto-generated constructor stub
	}
}
