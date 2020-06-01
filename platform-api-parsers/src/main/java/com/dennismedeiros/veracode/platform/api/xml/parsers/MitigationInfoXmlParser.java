package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.mitigations.MitigationInfo;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class MitigationInfoXmlParser extends JaxbBaseXmlParser<MitigationInfo>{
	
	public MitigationInfoXmlParser(){
		super(MitigationInfo.class);
	}
}
