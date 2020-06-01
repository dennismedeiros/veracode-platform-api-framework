package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojo.ScanInformation;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ScanInfoXmlParser;

public class ScanInfoXmlParserTest {

	String filename = "/xml/scaninfo.xml";
	InputStream stream = null;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		stream = this.getClass().getResourceAsStream(filename);
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void testParseContent() {
		ScanInfoXmlParser parser = new ScanInfoXmlParser();
		try{
			ScanInformation scaninfo = parser.parseContent(new InputStreamReader(stream));
				
			assertNotNull(scaninfo);
			assertEquals(scaninfo.getAccountId(), 10869);
			assertEquals(scaninfo.getAppId(), 16218);

			assertEquals(scaninfo.getScanId(),321279);
			
			assertEquals(scaninfo.getScan().getScanId(), Long.valueOf(321279));
			assertEquals(scaninfo.getScan().getName(), "9 Sep 2014 Static_Final");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
