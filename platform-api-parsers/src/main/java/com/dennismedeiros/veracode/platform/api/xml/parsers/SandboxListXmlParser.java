package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.sandboxes.SandboxList;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class SandboxListXmlParser extends JaxbBaseXmlParser<SandboxList> {

	public SandboxListXmlParser() {
		super(SandboxList.class);
	}
}
