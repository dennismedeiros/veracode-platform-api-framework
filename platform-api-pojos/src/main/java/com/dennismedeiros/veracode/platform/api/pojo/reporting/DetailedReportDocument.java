/**
 * Represents a Detailed Report document within the Veracode Platform.
 * 
 * @author Dennis Medeiros
 * 
 * @see DetailedReport
 */

package com.dennismedeiros.veracode.platform.api.pojo.reporting;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Analysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.AnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.AnalysisReportType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Find;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.dast.DynamicAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.dast.DynamicAnalysisFlawFind;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.dast.DynamicAnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.ManualAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.ManualAnalysisFlawFind;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.ManualAnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.StaticAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.StaticAnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.StaticAnalysisFlaw;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sca.ISoftwareCompositionAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sca.SoftwareCompositionAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.Category;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.CustomFields;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.CustomFieldsList;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.CweCategory;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.FlawStatus;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.FlawStatusSummary;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.Severity;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.SeverityLevel;


@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {
    "staticAnalysis",
    "dynamicAnalysis",
    "manualAnalysis",
    "severity",
    "flawStatus",
    //"customfields",
    "softwareCompositionAnalysis"
})
@XmlRootElement(name = "detailedreport")
public class DetailedReportDocument implements DetailedReport {
	
    @XmlElement(name = "static-analysis", type = StaticAnalysisReport.class)
    protected StaticAnalysis staticAnalysis;
    
    @XmlElement(name = "dynamic-analysis", type = DynamicAnalysisReport.class)
    protected DynamicAnalysis dynamicAnalysis;
    
    @XmlElement(name = "manual-analysis", type = ManualAnalysisReport.class)
    protected ManualAnalysis manualAnalysis;
    
    @XmlElement(required = true, type = SeverityLevel.class)
    protected List<Severity> severity;
    
    @XmlElement(name = "flaw-status", type=FlawStatusSummary.class, required = true)
    protected FlawStatus flawStatus;
    protected CustomFieldsList customfields;
    
    @XmlElement(name = "software_composition_analysis", type=SoftwareCompositionAnalysis.class)
    protected ISoftwareCompositionAnalysis softwareCompositionAnalysis;
    
    @XmlAttribute(name = "account_id", required = true)
    protected Long accountid;
	
    @XmlAttribute(name = "report_format_version", required = true)
    protected String reportFormatVersion;
    
    @XmlAttribute(name = "app_name", required = true)
    protected String appName;
    
    @XmlAttribute(name = "app_id", required = true)
    protected long appId;
    
    @XmlAttribute(name="analysis_id")
    protected String analysisid;
    
    @XmlAttribute(name = "sandbox_name")
    protected String sandboxName;
    @XmlAttribute(name = "sandbox_id")
    protected long sandboxId;
    @XmlAttribute(name = "first_build_submitted_date")
    protected String firstBuildSubmittedDate;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "build_id", required = true)
    protected long buildId;
    @XmlAttribute(name = "vendor")
    protected String vendor;
    @XmlAttribute(name = "submitter", required = true)
    protected String submitter;
    @XmlAttribute(name = "platform", required = true)
    protected String platform;
    @XmlAttribute(name = "assurance_level")
    protected BigInteger assuranceLevel;
    @XmlAttribute(name = "business_criticality")
    protected BigInteger businessCriticality;
    @XmlAttribute(name = "generation_date", required = true)
    protected String generationDate;
    @XmlAttribute(name = "veracode_level", required = true)
    protected String veracodeLevel;
    @XmlAttribute(name = "total_flaws")
    protected BigInteger totalFlaws;
    @XmlAttribute(name = "flaws_not_mitigated")
    protected BigInteger flawsNotMitigated;
    @XmlAttribute(name = "teams", required = true)
    protected String teams;
    @XmlAttribute(name = "life_cycle_stage", required = true)
    protected String lifeCycleStage;
    @XmlAttribute(name = "planned_deployment_date")
    protected String plannedDeploymentDate;
    @XmlAttribute(name = "last_update_time", required = true)
    protected String lastUpdateTime;
    @XmlAttribute(name = "is_latest_build", required = true)
    protected boolean isLatestBuild;
    @XmlAttribute(name = "policy_name", required = true)
    protected String policyName;
    @XmlAttribute(name = "policy_version", required = true)
    protected BigInteger policyVersion;
    @XmlAttribute(name = "policy_compliance_status", required = true)
    protected String policyComplianceStatus;
    @XmlAttribute(name = "policy_rules_status", required = true)
    protected String policyRulesStatus;
    @XmlAttribute(name = "grace_period_expired", required = true)
    protected boolean gracePeriodExpired;
    @XmlAttribute(name = "scan_overdue", required = true)
    protected String scanOverdue;
    @XmlAttribute(name = "any_type_scan_due")
    protected String anyTypeScanDue;
    @XmlAttribute(name = "business_owner")
    protected String businessOwner;
    @XmlAttribute(name = "business_unit")
    protected String businessUnit;
    @XmlAttribute(name = "tags")
    protected String tags;
    @XmlAttribute(name = "legacy_scan_engine")
    protected boolean legacyScanEngine;
    
    @XmlTransient protected List<Find> _staticflaws;
    @XmlTransient protected List<Find> _dyanmicflaws;
    @XmlTransient protected List<Find> _manualflaws;
    
    @Override
	public Long getAccountId() {
		return accountid;
	}
    
    public String getAnalysisId() {
		return this.analysisid;
	}
    /**
     * Gets the value of the anyTypeScanDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getAnyTypeScanDue() {
        return anyTypeScanDue;
    }
	/**
     * Gets the value of the appId property.
     * 
     */
    @Override
	public Long getAppId() {
        return appId;
    }
   
	/**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getAppName() {
        return appName;
    }
	/**
     * Gets the value of the assuranceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Override
	public Long getAssuranceLevel() {
        return assuranceLevel.longValue();
    }
	
	/**
     * Gets the value of the businessCriticality property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Override
	public Long getBusinessCriticality() {
        return businessCriticality.longValue();
    }
	/**
     * Gets the value of the businessOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getBusinessOwner() {
        return businessOwner;
    }
    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Gets the value of the customfields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFields }
     *     
     */
    @Override
	public CustomFieldsList getCustomFields() {
        return customfields;
    }

    /**
     * Gets the value of the dynamicAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisReport }
     *     
     */
    @Override
	public Analysis getDynamicAnalysis() {
        return null; //dynamicAnalysis;
    }

    @Override
	public List<Find> getDynamicAnalysisFindings() {
    	
    	if(this._dyanmicflaws == null) {
	    	List<Find> dynamicflaws = new ArrayList<Find>();
	    	
	    	List<Severity> severities = this.severity;
	    	Iterator<Severity> itsev = severities.iterator();
	    	while(itsev.hasNext()) {
	    		Severity severity = itsev.next();
	    		
	    		List<Category> cats = severity.getCategories();
	    		if(cats != null) {
		    		Iterator<Category> itcat = cats.iterator(); 
		    		while(itcat.hasNext()) {
		    			Category cat = itcat.next();
		    			
		    			List<CweCategory> cwes = cat.getCWEs();
		    			Iterator<CweCategory> itcwe = cwes.iterator();
		    			while(itcwe.hasNext()) {
		        			CweCategory cweSubject = itcwe.next();
		        			if(cweSubject != null) {
			        			List<DynamicAnalysisFlawFind> flawlist = cweSubject.getDynamicAnalysisFlaws();
			        			if(flawlist != null && flawlist.size() > 0) {
				        			dynamicflaws.addAll(flawlist);
			        			}
		        			}
		        		}
		    		}
	    		}
	    	}
	    	this._dyanmicflaws = dynamicflaws;
    	} 
    	
    	return this._dyanmicflaws;
	}

    /**
     * Gets the value of the firstBuildSubmittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getFirstBuildSubmittedDate() {
        return firstBuildSubmittedDate;
    }

    /**
     * Gets the value of the flawsNotMitigated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Override
	public Long getFlawsNotMitigated() {
        return flawsNotMitigated.longValue();
    }

    /**
     * Gets the value of the flawStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlawStatusSummary }
     *     
     */
    @Override
	public FlawStatus getFlawStatus() {
        return flawStatus;
    }

    /**
     * Gets the value of the generationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getGenerationDate() {
        return generationDate;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Gets the value of the lifeCycleStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getLifeCycleStage() {
        return lifeCycleStage;
    }

    /**
     * Gets the value of the manualAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link ManualAnalysisReport }
     *     
     */
    @Override
	public ManualAnalysis ManualPenetrationTestingAnalysis() {
        return manualAnalysis;
    }

    @Override
	public List<Find> getManualAnalysisFindings() {
    	if(this._manualflaws == null) {
	    	List<Find> manualflaws = new ArrayList<Find>();
	    	
	    	List<Severity> severities = this.severity;
	    	Iterator<Severity> itsev = severities.iterator();
	    	while(itsev.hasNext()) {
	    		Severity severity = itsev.next();
	    		
	    		List<Category> cats = severity.getCategories();
	    		if(cats != null) {
		    		Iterator<Category> itcat = cats.iterator(); 
		    		while(itcat.hasNext()) {
		    			Category cat = itcat.next();
		    			
		    			List<CweCategory> cwes = cat.getCWEs();
		    			Iterator<CweCategory> itcwe = cwes.iterator();
		    			while(itcwe.hasNext()) {
		        			CweCategory cweSubject = itcwe.next();
		        			if(cweSubject != null) {
			        			List<ManualAnalysisFlawFind> flawlist = cweSubject.getManualAnalysisFlaws();
			        			if(flawlist != null) {
				        			manualflaws.addAll(flawlist);
			        			}
		        			}
		        		}
		    		}
	    		}
	    	}
	    	this._manualflaws = manualflaws;
    	} 
    	
    	return this._manualflaws;
	}

    /**
     * Gets the value of the plannedDeploymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getPlannedDeploymentDate() {
        return plannedDeploymentDate;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getPlatform() {
        return platform;
    }

    /**
     * Gets the value of the policyComplianceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getPolicyComplianceStatus() {
        return policyComplianceStatus;
    }

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getPolicyName() {
        return policyName;
    }

    /**
     * Gets the value of the policyRulesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getPolicyRulesStatus() {
        return policyRulesStatus;
    }

    /**
     * Gets the value of the policyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Override
	public Long getPolicyVersion() {
        return policyVersion.longValue();
    }

    /**
     * Gets the value of the reportFormatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getReportFormatVersion() {
        return reportFormatVersion;
    }

    /**
     * Gets the value of the sandboxId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Override
	public Long getSandboxId() {
        return sandboxId;
    }

    /**
     * Gets the value of the sandboxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getSandboxName() {
        return sandboxName;
    }

    /**
     * Gets the value of the buildId property.
     * 
     */
    @Override
	public Long getScanId() {
        return buildId;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getScanName() {
        return version;
    }

    /**
     * Gets the value of the scanOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getScanOverdue() {
        return scanOverdue;
    }

    @Override
	public List<Severity> getSeverities() {
        if (severity == null) {
            severity = new ArrayList<Severity>();
        }
        return this.severity;
    }

    /**
     * Gets the value of the softwareCompositionAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareCompositionAnalysis }
     *     
     */
    @Override
	public ISoftwareCompositionAnalysis getSoftwareCompositionAnalysis() {
        return softwareCompositionAnalysis;
    }

    /**
     * Gets the value of the staticAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisReport }
     *     
     */
    @Override
	public StaticAnalysis getStaticAnalysis() {
    	
    	StaticAnalysisReport staticanalysisreport = (StaticAnalysisReport)this.staticAnalysis;
    	List<Find> finds = this.getStaticAnalysisFindings();
    	
    	try {
    		Class<?> staticanalysisclass = staticanalysisreport.getClass();
	    	Class[] cArgs = new Class[1];
    		cArgs[0] = List.class;
	    	Method privateListMethod = StaticAnalysisReport.class.getDeclaredMethod("setFindings", cArgs);
	    	privateListMethod.setAccessible(true);
	    	privateListMethod.invoke(staticanalysisreport, finds);
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
    	}
    	
    	return staticAnalysis;
    }

    protected List<Find> getStaticAnalysisFindings() {
    	
    	if(this._staticflaws == null) {
	    	List<Find> staticflaws = new ArrayList<Find>();
	    	
	    	List<Severity> severities = this.severity;
	    	Iterator<Severity> itsev = severities.iterator();
	    	while(itsev.hasNext()) {
	    		Severity severity = itsev.next();
	    		
	    		List<Category> cats = severity.getCategories();
	    		if(cats != null) {
		    		Iterator<Category> itcat = cats.iterator(); 
		    		while(itcat.hasNext()) {
		    			Category cat = itcat.next();
		    			
		    			List<CweCategory> cwes = cat.getCWEs();
		    			Iterator<CweCategory> itcwe = cwes.iterator();
		    			while(itcwe.hasNext()) {
		        			CweCategory cweSubject = itcwe.next();
		        			if(cweSubject != null) {
			        			List<StaticAnalysisFlaw> flawlist = cweSubject.getStaticAnalysisFlaws();
			        			if(flawlist != null && flawlist.size() > 0) {
			        				staticflaws.addAll(flawlist);
			        			}
		        			}
		        		}
		    		}
	    		}
	    	}
	    	this._staticflaws = staticflaws;
    	} 
    	
    	return this._staticflaws;
    }

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getSubmitter() {
        return submitter;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getTags() {
        return tags;
    }

    /**
     * Gets the value of the teams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getTeams() {
        return teams;
    }

    /**
     * Gets the value of the totalFlaws property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Override
	public Long getTotalFlaws() {
        return totalFlaws.longValue();
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getVendor() {
        return vendor;
    }

    /**
     * Gets the value of the veracodeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getVeracodeLevel() {
        return veracodeLevel;
    }

    /**
     * Gets the value of the gracePeriodExpired property.
     * 
     */
    @Override
	public Boolean hasGracePeriodExpired() {
        return gracePeriodExpired;
    }

    /**
     * Checks to see if the Detailed Report contains the requested analysis report type.
     * Returns true is requested analysis report type type is part of the Detailed Report. 
     * Otherwise the method will return false.  
     * 
     * @param analysisReportType
     *    allowed object is {@link AnalysisReportType}}
     * 
     * @return {@link Boolean}
     */
	@Override
	public Boolean hasScan(AnalysisReportType analysisReportType) {
		boolean bResult = false;
		
		switch(analysisReportType) {
			case STATIC: 
				if(this.staticAnalysis != null) {
					bResult = true;
				}				
				break;
			case DYNAMIC:
				if(this.dynamicAnalysis != null) { 
					bResult = true;
				}				
				break;
			case MANUAL:
				if(this.manualAnalysis != null) {
					bResult = true;
				}				
				break;
			default: break;
		}
		
		return bResult;
	}

    /**
     * Gets the value of the isLatestBuild property.
     * 
     */
    @Override
	public Boolean isLatestBuild() {
        return isLatestBuild;
    }

    /**
     * Indicates if the scanning engine being used is a legacyScanEngine.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     * @deprecated
     */
    @Override
	public Boolean isLegacyScanEngine() {
        return legacyScanEngine;
    }

    @Override
	public Boolean isPolicyLevelAnalysis() {
    	boolean result = false;
    	
    	if(this.sandboxName == null || this.sandboxName.equals("")) {
    		result = true;
    	}
    	
    	return result;
    }

    private void setAccountId(Long accountid) {
		this.accountid = accountid;
	}

    private void setAnalysisId(String analysisid) {
		this.analysisid = analysisid;
	}

    /**
     * Sets the value of the anyTypeScanDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setAnyTypeScanDue(String value) {
        this.anyTypeScanDue = value;
    }

    /**
     * Sets the value of the appId property.
     * 
     */
    private void setAppId(Long value) {
        this.appId = value;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Sets the value of the assuranceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    private void setAssuranceLevel(Long value) {
        this.assuranceLevel = BigInteger.valueOf(value);
    }

    /**
     * Sets the value of the buildId property.
     * 
     */
    private void setBuildId(Long value) {
        this.buildId = value;
    }

    /**
     * Sets the value of the businessCriticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    private void setBusinessCriticality(BigInteger value) {
        this.businessCriticality = value;
    }

    /**
     * Sets the value of the businessOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setBusinessOwner(String value) {
        this.businessOwner = value;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Sets the value of the customfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFields }
     *     
     */
    private void setCustomFields(CustomFieldsList value) {
        this.customfields = value;
    }

    /**
     * Sets the value of the dynamicAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisReport }
     *     
     */
    private void setDynamicAnalysis(DynamicAnalysis value) {
        //this.dynamicAnalysis = value;
    }

    /**
     * Sets the value of the firstBuildSubmittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setFirstBuildSubmittedDate(String value) {
        this.firstBuildSubmittedDate = value;
    }

    /**
     * Sets the value of the flawsNotMitigated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    private void setFlawsNotMitigated(Long value) {
        this.flawsNotMitigated = BigInteger.valueOf(value);
    }

    /**
     * Sets the value of the flawStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlawStatusSummary }
     *     
     */
    private void setFlawStatus(FlawStatus value) {
        this.flawStatus = value;
    }

    /**
     * Sets the value of the generationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setGenerationDate(String value) {
        this.generationDate = value;
    }

    /**
     * Sets the value of the gracePeriodExpired property.
     * 
     */
    private void setGracePeriodExpired(boolean value) {
        this.gracePeriodExpired = value;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setLastUpdateTime(String value) {
        this.lastUpdateTime = value;
    }

    /**
     * Sets the value of the isLatestBuild property.
     * 
     */
    private void setLatestBuild(boolean value) {
        this.isLatestBuild = value;
    }

    /**
     * Sets the value of the legacyScanEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    private void setLegacyScanEngine(Boolean value) {
        this.legacyScanEngine = value;
    }

    /**
     * Sets the value of the lifeCycleStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setLifeCycleStage(String value) {
        this.lifeCycleStage = value;
    }

    /**
     * Sets the value of the manualAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualAnalysisReport }
     *     
     */
    private void setManualAnalysis(ManualAnalysis value) {
        this.manualAnalysis = value;
    }

    /**
     * Sets the value of the plannedDeploymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setPlannedDeploymentDate(String value) {
        this.plannedDeploymentDate = value;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Sets the value of the policyComplianceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setPolicyComplianceStatus(String value) {
        this.policyComplianceStatus = value;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Sets the value of the policyRulesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setPolicyRulesStatus(String value) {
        this.policyRulesStatus = value;
    }

    /**
     * Sets the value of the policyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    private void setPolicyVersion(Long value) {
        this.policyVersion = BigInteger.valueOf(value);
    }

    /**
     * Sets the value of the reportFormatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setReportFormatVersion(String value) {
        this.reportFormatVersion = value;
    }

    /**
     * Sets the value of the sandboxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    private void setSandboxId(Long value) {
        this.sandboxId = value;
    }

    /**
     * Sets the value of the sandboxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setSandboxName(String value) {
        this.sandboxName = value;
    }

    /**
     * Sets the value of the scanOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setScanOverdue(String value) {
        this.scanOverdue = value;
    }

    /**
     * Sets the value of the softwareCompositionAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareCompositionAnalysis }
     *     
     */
    private void setSoftwareCompositionAnalysis(ISoftwareCompositionAnalysis value) {
        this.softwareCompositionAnalysis = value;
    }

    /**
     * Sets the value of the staticAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisReport }
     *     
     */
    private void setStaticAnalysis(StaticAnalysis value) {
        this.staticAnalysis = value;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setSubmitter(String value) {
        this.submitter = value;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setTags(String value) {
        this.tags = value;
    }

    /**
     * Sets the value of the teams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setTeams(String value) {
        this.teams = value;
    }

    /**
     * Sets the value of the totalFlaws property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    private void setTotalFlaws(BigInteger value) {
        this.totalFlaws = value;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Sets the value of the veracodeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setVeracodeLevel(String value) {
        this.veracodeLevel = value;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    private void setVersion(String value) {
        this.version = value;
    }
}
