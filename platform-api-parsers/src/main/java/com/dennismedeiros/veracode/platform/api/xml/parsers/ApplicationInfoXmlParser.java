package com.dennismedeiros.veracode.platform.api.xml.parsers;


import com.dennismedeiros.veracode.platform.api.pojos.portfolio.ApplicationPortfolioInformationEntity;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class ApplicationInfoXmlParser extends JaxbBaseXmlParser<ApplicationPortfolioInformationEntity> {
	
	public ApplicationInfoXmlParser() {
		super(ApplicationPortfolioInformationEntity.class);
	}
}
