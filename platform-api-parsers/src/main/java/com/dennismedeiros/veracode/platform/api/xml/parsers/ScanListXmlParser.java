package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.scanlist.ScanList;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class ScanListXmlParser extends JaxbBaseXmlParser<ScanList> {

	public ScanListXmlParser() {
		super(ScanList.class);
	}
}
