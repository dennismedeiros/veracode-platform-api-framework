package com.dennismedeiros.veracode.platform.api.xml.parsers.jaxb;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;

import org.xml.sax.InputSource;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

public abstract class JaxbBaseXmlParser<T> {

	private Class<T> typeArgumentClass;
	
	public JaxbBaseXmlParser(Class<T> type){
		this.typeArgumentClass = type;
	}
	
	private SAXParserFactory getSAXParserFactory() {
		SAXParserFactory factory = null;
		try {
			factory = SAXParserFactory.newInstance();
			factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
			factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
			factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
			
		} catch (SAXNotRecognizedException | SAXNotSupportedException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return factory;
	}
	
	public T parseContent(char[] content) {

		T rtnclass = null;
		
		if(content != null){
			try{
				//rtnclass = typeArgumentClass.newInstance();
			
				//Configure to prevent XXE
				SAXParserFactory spf = this.getSAXParserFactory();
				Source source = new SAXSource(spf.newSAXParser().getXMLReader(), new InputSource(String.copyValueOf(content)));
				
				//Parse stream into class object
				JAXBContext jaxbContext = JAXBContext.newInstance(typeArgumentClass);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
				//Create class object
				rtnclass = typeArgumentClass.cast(unmarshaller.unmarshal(source));
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				
			}
		}
		return rtnclass;
	}
	
	public T parseContent(String content) {

		T rtnclass = null;
		
		if(content != null){
			try{
				//rtnclass = typeArgumentClass.newInstance();
			
				//Configure to prevent XXE
				SAXParserFactory spf = this.getSAXParserFactory();
				Source source = new SAXSource(spf.newSAXParser().getXMLReader(), new InputSource(new StringReader(content)));
				
				//Parse stream into class object
				JAXBContext jaxbContext = JAXBContext.newInstance(typeArgumentClass);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
				//Create class object
				rtnclass = typeArgumentClass.cast(unmarshaller.unmarshal(source));
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				
			}
		}
		return rtnclass;
	}
	
	public T parseContent(InputStream stream) throws IOException {
		
		T rtnclass = null;
		
		if(stream != null){
			try{
				//rtnclass = typeArgumentClass.newInstance();
			
				//Configure to prevent XXE
				SAXParserFactory spf = this.getSAXParserFactory();
				Source source = new SAXSource(spf.newSAXParser().getXMLReader(), new InputSource(stream));
				
				//Parse stream into class object
				JAXBContext jaxbContext = JAXBContext.newInstance(typeArgumentClass);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
				//Create class object
				rtnclass = typeArgumentClass.cast(unmarshaller.unmarshal(source));
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(stream != null) {
					stream.close();	
				}
			}
		}
		return rtnclass;
	}
	
	public T parseContent(Reader reader) throws IOException {
	
		T rtnclass = null;
		
		if(reader != null){
			try{
				//rtnclass = typeArgumentClass.newInstance();
			
				//Configure to prevent XXE
				SAXParserFactory spf = this.getSAXParserFactory();
				Source source = new SAXSource(spf.newSAXParser().getXMLReader(), new InputSource(reader));
				
				//Parse stream into class object
				JAXBContext jaxbContext = JAXBContext.newInstance(typeArgumentClass);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
				//Create class object
				rtnclass = typeArgumentClass.cast(unmarshaller.unmarshal(source));
			
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(reader != null) {
					reader.close();	
				}
			}
		}
		return rtnclass;
	}

	public void serializeContent(T object, Writer writer) {
		try{
			//Parse class object into stream
			JAXBContext jaxbContext = JAXBContext.newInstance(typeArgumentClass);
			Marshaller marshaller = jaxbContext.createMarshaller();
	
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(object, writer);
			
		}catch(JAXBException e){
			e.printStackTrace();
		}
	}
	
	public void serializeContent(T object, OutputStream outputstream) {
		
		try{
			//Parse class object into stream
			JAXBContext jaxbContext = JAXBContext.newInstance(typeArgumentClass);
			Marshaller marshaller = jaxbContext.createMarshaller();
	
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(object, outputstream);
		
		}catch(JAXBException e){
			e.printStackTrace();
		}
	}
}
