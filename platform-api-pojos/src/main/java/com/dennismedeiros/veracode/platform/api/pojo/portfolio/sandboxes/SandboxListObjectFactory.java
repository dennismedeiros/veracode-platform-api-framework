//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:11:35 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.portfolio.sandboxes;

import javax.xml.bind.annotation.XmlRegistry;

import com.dennismedeiros.veracode.platform.api.pojo.Sandbox;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.veracode.platform.parsers.jaxb.templates.sandboxlist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class SandboxListObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.veracode.platform.parsers.jaxb.templates.sandboxlist
     * 
     */
    public SandboxListObjectFactory() {
    }

    /**
     * Create an instance of {@link SandboxList }
     * @return SandboxList object
     */
    public SandboxList createSandboxlist() {
        return new SandboxList();
    }

    /**
     * Create an instance of {@link SandboxEntity }
     * @return Sandbox object
     */
    public Sandbox createSandboxType() {
        return new SandboxEntity();
    }

    /**
     * Create an instance of {@link CustomFieldType }
     * @return CustomFieldType object
     */
    public CustomFieldType createCustomFieldType() {
        return new CustomFieldType();
    }

}
