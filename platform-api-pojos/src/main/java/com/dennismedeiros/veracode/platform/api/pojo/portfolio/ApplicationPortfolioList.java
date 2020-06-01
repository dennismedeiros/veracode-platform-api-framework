//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.25 at 04:09:55 PM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.portfolio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.ApplicationPortfolio;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "", propOrder = {
    "app",
    "user"
})
@XmlRootElement(name = "applist")
public class ApplicationPortfolioList implements ApplicationPortfolios {

	@XmlElement(name="app", type = ApplicationPortfolioListItem.class)
    protected List<ApplicationPortfolio> app;
	
	@XmlElement(name = "user",type=UserAccount.class)
    protected User user;
    
    @XmlAttribute(name = "applist_version", required = true)
    protected String applistVersion;
    @XmlAttribute(name = "account_id", required = true)
    protected long accountId;

	public List<ApplicationPortfolio> getApplicationPortfolios() {
        if (app == null) {
            app = new ArrayList<ApplicationPortfolio>();
        }
        return this.app;
    }

    @Override
	public User getUser() {
        return user;
    }

    @Override
	public String getListContainerVersion() {
        return applistVersion;
    }

    @Override
	public Long getAccountId() {
        return accountId;
    }
}
