package com.dennismedeiros.veracode.platform.api.providers.modules;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dennismedeiros.veracode.platform.api.credentials.Credential;
import com.dennismedeiros.veracode.platform.api.pojo.Scan;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.Find;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.sast.datapath.DataPaths;
import com.dennismedeiros.veracode.platform.api.xml.parsers.StaticAnalysisDataPathXmlParser;

public class PlatformAPIVospStaticAnalysisModule extends PlatformAPIXmlContentModule {

	private static final Logger logger = LoggerFactory.getLogger(PlatformAPIVospStaticAnalysisModule.class);
	
	public PlatformAPIVospStaticAnalysisModule(Credential credential) throws Throwable {
		super(credential);
	}
	
	//TODO: limit finding to static finding
	public DataPaths getDataPath(Scan scan, Find finding) {
		DataPaths datapaths = null;
		
		StaticAnalysisDataPathXmlParser parser = new StaticAnalysisDataPathXmlParser();
		try {
			String rtn = this.m_resultWrapper.getCallStacks(scan.getId().toString(), finding.getId().toString());
			datapaths = parser.parseContent(rtn); 
			
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}
		
		return datapaths;
	}

}
