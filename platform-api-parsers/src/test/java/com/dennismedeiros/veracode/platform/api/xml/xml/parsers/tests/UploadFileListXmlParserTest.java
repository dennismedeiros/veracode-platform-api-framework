package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.filelist.UploadFileContent;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.DetailedReport;
import com.dennismedeiros.veracode.platform.api.xml.parsers.UploadFileListXmlParser;

public class UploadFileListXmlParserTest {


    String filename = "/xml/filelist.xml";
    InputStream stream = null;
	DetailedReport report = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
        stream = this.getClass().getResourceAsStream(filename);
	}
  
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (stream != null)
	        {
	            stream.close();
	        }
	
	        stream = null;
	}

	/**
	 * Test method for {@link com.dennismedeiros.veracode.platform.api.xml.parsers.DetailedReportXmlParser#Test()}.
	 */
	@Test
	public void testParseContent() {
		UploadFileListXmlParser parser = new UploadFileListXmlParser();
		try{
			UploadFileContent uploadFileList = parser.parseContent(new InputStreamReader(stream));
				
			assertNotNull(uploadFileList);
			assertEquals(uploadFileList.getAccountId(), Long.valueOf("1"));
			assertTrue(uploadFileList.getUploadedFiles().size() > 0);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
