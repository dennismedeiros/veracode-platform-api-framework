package com.dennismedeiros.veracode.platform.api.xml.parsers;

import com.dennismedeiros.veracode.platform.api.pojos.portfolio.analyses.filelist.UploadFileContent;
import com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb.JaxbBaseXmlParser;

public class UploadFileListXmlParser extends JaxbBaseXmlParser<UploadFileContent> {

	public UploadFileListXmlParser() {
		super(UploadFileContent.class);
	}

}
