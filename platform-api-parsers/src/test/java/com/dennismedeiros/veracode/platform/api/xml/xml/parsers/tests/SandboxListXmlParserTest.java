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

import com.dennismedeiros.veracode.platform.api.pojos.Sandbox;
import com.dennismedeiros.veracode.platform.api.pojos.portfolio.sandboxes.SandboxList;
import com.dennismedeiros.veracode.platform.api.xml.parsers.SandboxListXmlParser;

public class SandboxListXmlParserTest {

	String filename = "/xml/SandboxList.xml";
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
		SandboxListXmlParser parser = new SandboxListXmlParser();
		try{
			SandboxList sandboxlist = parser.parseContent(new InputStreamReader(stream));
				
			assertNotNull(sandboxlist);
			assertEquals(sandboxlist.getAccountId(), 32818);
			assertEquals(sandboxlist.getAppId(), 456436);
			
			List<Sandbox> scans = sandboxlist.getSandboxes();
			assertTrue("", scans.size() > 0);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
