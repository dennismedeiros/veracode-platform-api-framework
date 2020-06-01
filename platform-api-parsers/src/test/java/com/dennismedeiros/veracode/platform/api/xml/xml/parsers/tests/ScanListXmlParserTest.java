package com.dennismedeiros.veracode.platform.api.xml.xml.parsers.tests;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dennismedeiros.veracode.platform.api.pojo.Scan;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.scanlist.ScanList;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ScanListXmlParser;

public class ScanListXmlParserTest {

	String filename = "/xml/ScanList.xml";
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

	@Test
	public void testParseContent() {
		ScanListXmlParser parser = new ScanListXmlParser();
		try{
			ScanList scanlist = parser.parseContent(new InputStreamReader(stream));
				
			assertNotNull(scanlist);
			assertEquals(scanlist.getAccountId(), Long.valueOf(32818));
			assertEquals(scanlist.getAppId(), Long.valueOf(112029));
			
			List<Scan> scans = scanlist.getScans();
			assertTrue("", scans.size() > 0);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
