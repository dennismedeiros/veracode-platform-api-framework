package com.dennismedeiros.veracode.platform.api.xml.xml.parsers;

//import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.ApplicationPortfolio;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.ApplicationPortfolios;
import com.dennismedeiros.veracode.platform.api.xml.parsers.ApplicationListXmlParser;

/**
 * @author dmedeiros
 *
 */
public class ParserTest {

	public void testParseContent() {
		ApplicationListXmlParser parser = new ApplicationListXmlParser();
		try{	
			File file = new File("C:\\Users\\dmedeiros\\workspaces\\Security Consultant Applicaiton Project\\platform-parsers\\src\\main\\resources\\AppList.xml");
			if(file.exists()){
				ApplicationPortfolios applist = parser.parseContent(new FileReader(file));
				
				System.out.println(String.format("Account ID: (%d)", applist.getAccountId()));
				
				
				List<ApplicationPortfolio> applications = applist.getApplicationPortfolios();
				
				Iterator<ApplicationPortfolio> appsit = applications.iterator();
				while(appsit.hasNext()){
					
					ApplicationPortfolio app = appsit.next();
					System.out.println(String.format("Application: (%d): %s", app.getId(), app.getName()));	
				}
				
				//assertNotNull(applist);
				//assertEquals(applist.getAccountId(), 108399);
				//assertEquals(applist.getApp();)
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String file = "detailedreport_GEI021-ICLIQ-CUSTOMER_120120161155_20161211892993.xml";
		//String file = "DetailedReport.xml";
		//Path path = Paths.get(System.getProperty("user.dir"), file);
	
		
		//DetailedReportXmlParser detailedreportparser = new DetailedReportXmlParser();
		//detailedreportparser.Test();
		ParserTest test = new ParserTest();
		test.testParseContent();
	}

	/*
	public void Test(){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			File file = new File(System.getProperty("user.dir") + "/detailedreport_GEI021-ICLIQ-CUSTOMER_120120161155_20161211892993.xml");
			if(file.exists()){
				InputStream in = new FileInputStream(file);
			
//				StringBuilder xmlStringBuilder = new StringBuilder();
//				xmlStringBuilder.append("<?xml version="1.0"?> <class> </class>");
//				
				//ByteArrayInputStream input =  new ByteArrayInputStream(in);
				
				//ByteArrayInputStream input =  new ByteArrayInputStream(
				//   xmlStringBuilder.toString().getBytes("UTF-8"));
				
				Document doc = builder.parse(in);
				System.out.println(doc.getDocumentElement());
				Element parentElement = doc.getDocumentElement(); 
				
				Element elCurrent = parentElement;
				if(doc.hasChildNodes()){
					NodeList nodes = doc.getChildNodes();
					int childnodelength = nodes.getLength();
					for(int i = 0; i < childnodelength; i++){
						this.ParseNode(nodes.item(i));
					}
				}
					
//				Element el = parentElement;
//				if(el.hasAttributes()){
//					Map<String, String> result = this.ParseElementAttributes(doc.getDocumentElement());
//					System.out.println(result.toString());
//				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	*/
	/*
	public void ParseNode(Node node){
		System.out.println(node.getNodeName());
		
		if(node.hasAttributes()){
			Map<String, String> attributemap = this.parseAttributes(node.getAttributes());	
			System.out.println(attributemap.toString());
		}
		
		if(node.hasChildNodes()){
			NodeList nodes = node.getChildNodes();
			int nodelength = nodes.getLength();
			for(int i = 0; i < nodelength; i++){
				this.ParseNode(nodes.item(i));
			}
		}
	}

	
	public Map<String, String> parseAttributes(NamedNodeMap attributes){
		Map<String, String> map = new TreeMap<String, String>();
		
		//Get Attributes of Element
		int attributelenght = attributes.getLength();
		for(int i = 0; i < attributelenght; i++){
			Node node = attributes.item(i);
			map.put(node.getNodeName(),node.getNodeValue());
		}
		
		return map;
	}
	
	public Map<String, String> ParseElementAttributes(Element el){
		Map<String, String> map = new TreeMap<String, String>();
		
		NamedNodeMap attributes = el.getAttributes();
		
		//Get Attributes of Element
		int attributelenght = attributes.getLength();
		for(int i = 0; i < attributelenght; i++){
			Node node = attributes.item(i);
			System.out.println(node.getNodeName());
			System.out.println(node.getNodeValue());
			
			map.put(node.getNodeName(),node.getNodeValue());
		}
		
		return map;
	}
	*/
}
