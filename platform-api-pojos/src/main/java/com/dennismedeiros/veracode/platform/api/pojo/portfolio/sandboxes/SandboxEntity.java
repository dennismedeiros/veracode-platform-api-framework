//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:11:35 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.portfolio.sandboxes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.Sandbox;
import com.dennismedeiros.veracode.platform.api.pojo.portfolio.CustomField;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SandboxType", propOrder = {
    "customfield"
})
public class SandboxEntity implements Sandbox {

	@XmlElement(name="customfield", type=CustomFieldType.class)
    protected List<CustomField> customfield;
    @XmlAttribute(name = "sandbox_id", required = true)
    protected long sandboxId;
    @XmlAttribute(name = "sandbox_name", required = true)
    protected String sandboxName;
    @XmlAttribute(name = "owner", required = true)
    protected String owner;
    @XmlAttribute(name = "last_modified", required = true)
    protected String lastModified;

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#getCustomfield()
	 */
    @Override
	public List<CustomField> getCustomfield() {
        if (customfield == null) {
            customfield = new ArrayList<CustomField>();
        }
        return this.customfield;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#getSandboxId()
	 */
    @Override
	public long getSandboxId() {
        return sandboxId;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#setSandboxId(long)
	 */
    @Override
	public void setSandboxId(long value) {
        this.sandboxId = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#getSandboxName()
	 */
    @Override
	public String getSandboxName() {
        return sandboxName;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#setSandboxName(java.lang.String)
	 */
    @Override
	public void setSandboxName(String value) {
        this.sandboxName = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#getOwner()
	 */
    @Override
	public String getOwner() {
        return owner;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#setOwner(java.lang.String)
	 */
    @Override
	public void setOwner(String value) {
        this.owner = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#getLastModified()
	 */
    @Override
	public String getLastModified() {
        return lastModified;
    }

    /* (non-Javadoc)
	 * @see com.veracode.api.parsers.jaxb.templates.sandboxlist.ISandbox#setLastModified(java.lang.String)
	 */
    @Override
	public void setLastModified(String value) {
        this.lastModified = value;
    }

    /*******************************************/
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this.sandboxId;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.sandboxName;
	}

	@Override
	public void setId(Long scanid) {
		this.sandboxId = scanid;
		
	}

	@Override
	public void setName(String name) {
		this.sandboxName = name;
	}

}
