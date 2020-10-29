package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.sast.datapath.DataPaths;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class StaticAnalysisDataPathXmlParser extends JaxbBaseXmlParser<DataPaths> {

	public StaticAnalysisDataPathXmlParser() {
		super(DataPaths.class);
	}
}
