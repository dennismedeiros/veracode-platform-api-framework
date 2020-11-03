package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.scaninfo.ScanInformationEntity;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class BuildInformationXmlParser extends JaxbBaseXmlParser<ScanInformationEntity> {

	public BuildInformationXmlParser() {
		super(ScanInformationEntity.class);
		// TODO Auto-generated constructor stub
	}

}
