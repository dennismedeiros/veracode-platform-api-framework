package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojo.portfolio.sandboxInfo.SandboxInformation;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class SandboxInformationXmlParser extends JaxbBaseXmlParser<SandboxInformation> {

	public SandboxInformationXmlParser() {
		super(SandboxInformation.class);
	}

}
