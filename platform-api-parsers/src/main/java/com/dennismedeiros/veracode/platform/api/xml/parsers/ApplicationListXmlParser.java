package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.ApplicationPortfolioList;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class ApplicationListXmlParser extends JaxbBaseXmlParser<ApplicationPortfolioList> {
	public ApplicationListXmlParser() {
		super(ApplicationPortfolioList.class);
	}
}
