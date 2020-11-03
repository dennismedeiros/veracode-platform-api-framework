package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.scaninfo.ScanInformationEntity;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class ScanInfoXmlParser extends JaxbBaseXmlParser<ScanInformationEntity> {

	public ScanInfoXmlParser() {
		super(ScanInformationEntity.class);
	}
}
