//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 11:12:48 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.reporting.findings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Find;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Finding;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FlawListType", namespace="default", 
	propOrder = {
    "flaw"
})
public class FlawArrayList implements FlawList {

	@XmlElement(name="flaw", type=Finding.class)
    protected List<Find> flaw;

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawListType#getFlaws()
	 */
    @Override
 	public List<Find> getFinds() {
        if (flaw == null) {
            flaw = new ArrayList<Find>();
        }
        return this.flaw;
    }

}
