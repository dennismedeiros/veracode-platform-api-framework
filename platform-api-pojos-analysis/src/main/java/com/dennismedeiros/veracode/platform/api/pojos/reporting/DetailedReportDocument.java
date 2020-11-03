package com.dennismedeiros.veracode.platform.api.pojos.reporting;

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

import com.dennismedeiros.veracode.platform.api.pojos.analyses.AnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.AnalysisReportType;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.Find;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.dast.DynamicAnalysis;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.dast.DynamicAnalysisFlawFind;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.dast.DynamicAnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.mast.ManualAnalysis;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.mast.ManualAnalysisFlawFind;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.mast.ManualAnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.sast.StaticAnalysis;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.sast.StaticAnalysisFlaw;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.sast.StaticAnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.sca.SoftwareCompositionAnalysis;
import com.dennismedeiros.veracode.platform.api.pojos.analyses.sca.SoftwareCompositionAnalysisReport;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.Category;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.CustomFields;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.CustomFieldsList;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.CweCategory;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.FlawStatus;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.FlawStatusSummary;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.Severity;
import com.dennismedeiros.veracode.platform.api.pojos.reporting.common.SeverityLevel;

/**
 * Represents a Document of a Detailed Report within the Veracode Platform.
 * <p>
 * The Detailed Report is a container document that presents    
 * the results of most recent scans conducted. The report includes information regarding the current policy of the application portfolio standing.  
 * As well as result information on each available analysis conducted up to the period of the reports creation. 
 * 
 * @author Dennis Medeiros
 * @since 1.0.0
 * @version 1.0.0
 */
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
	
    @XmlTransient protected List<Find> _dyanmicflaws;
    
    @XmlTransient protected List<Find> _manualflaws;
    
    @XmlTransient protected List<Find> _staticflaws;
    
    @XmlAttribute(name = "account_id", required = true)
    protected Long accountid;
    
    @XmlAttribute(name="analysis_id")
    protected String analysisid;
    
    @XmlAttribute(name = "any_type_scan_due")
    protected String anyTypeScanDue;
    
    @XmlAttribute(name = "app_id", required = true)
    protected long appId;
    
    @XmlAttribute(name = "app_name", required = true)
    protected String appName;
	
    @XmlAttribute(name = "assurance_level")
    protected BigInteger assuranceLevel;
    
    @XmlAttribute(name = "build_id", required = true)
    protected long buildId;
    
    @XmlAttribute(name = "business_criticality")
    protected BigInteger businessCriticality;

	@XmlAttribute(name = "business_owner")
    protected String businessOwner;
    
    @XmlAttribute(name = "business_unit")
    protected String businessUnit;
    
    protected CustomFieldsList customfields;
    @XmlElement(name = "dynamic-analysis", type = DynamicAnalysisReport.class)
    protected DynamicAnalysis dynamicAnalysis;
    @XmlAttribute(name = "first_build_submitted_date")
    protected String firstBuildSubmittedDate;
    @XmlAttribute(name = "flaws_not_mitigated")
    protected BigInteger flawsNotMitigated;
    @XmlElement(name = "flaw-status", type=FlawStatusSummary.class, required = true)
    protected FlawStatus flawStatus;
    @XmlAttribute(name = "generation_date", required = true)
    protected String generationDate;
    @XmlAttribute(name = "grace_period_expired", required = true)
    protected boolean gracePeriodExpired;
    @XmlAttribute(name = "is_latest_build", required = true)
    protected boolean isLatestBuild;
    @XmlAttribute(name = "last_update_time", required = true)
    protected String lastUpdateTime;
    @XmlAttribute(name = "legacy_scan_engine")
    protected boolean legacyScanEngine;
    @XmlAttribute(name = "life_cycle_stage", required = true)
    protected String lifeCycleStage;
    @XmlElement(name = "manual-analysis", type = ManualAnalysisReport.class)
    protected ManualAnalysis manualAnalysis;
    @XmlAttribute(name = "planned_deployment_date")
    protected String plannedDeploymentDate;
    @XmlAttribute(name = "platform", required = true)
    protected String platform;
    @XmlAttribute(name = "policy_compliance_status", required = true)
    protected String policyComplianceStatus;
    @XmlAttribute(name = "policy_name", required = true)
    protected String policyName;
    @XmlAttribute(name = "policy_rules_status", required = true)
    protected String policyRulesStatus;
    @XmlAttribute(name = "policy_version", required = true)
    protected BigInteger policyVersion;
    @XmlAttribute(name = "report_format_version", required = true)
    protected String reportFormatVersion;
    @XmlAttribute(name = "sandbox_id")
    protected long sandboxId;
    @XmlAttribute(name = "sandbox_name")
    protected String sandboxName;
    @XmlAttribute(name = "scan_overdue", required = true)
    protected String scanOverdue;
    @XmlElement(required = true, type = SeverityLevel.class)
    protected List<Severity> severity;
    @XmlElement(name = "software_composition_analysis", type=SoftwareCompositionAnalysisReport.class)
    protected SoftwareCompositionAnalysis softwareCompositionAnalysis;
    @XmlElement(name = "static-analysis", type = StaticAnalysisReport.class)
    protected StaticAnalysis staticAnalysis;
    @XmlAttribute(name = "submitter", required = true)
    protected String submitter;
    @XmlAttribute(name = "tags")
    protected String tags;
    @XmlAttribute(name = "teams", required = true)
    protected String teams;
    @XmlAttribute(name = "total_flaws")
    protected BigInteger totalFlaws;
    @XmlAttribute(name = "vendor")
    protected String vendor;
    
    @XmlAttribute(name = "veracode_level", required = true)
    protected String veracodeLevel;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    /**
     * {@inheritDoc}
     */
    @Override
	public Long getAccountId() {
		return accountid;
	}
   
    /**
     * {@inheritDoc}
     */
    public String getOriginAnalysisId() {
		return this.analysisid;
	}
    /**
     * {@inheritDoc}
     */
    @Override
	public String getAnyTypeScanDue() {
        return anyTypeScanDue;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public Long getApplicationPortfolioId() {
        return appId;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getApplicationPortfolioName() {
        return appName;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public Long getAssuranceLevel() {
        return assuranceLevel.longValue();
    }
    /**
     * {@inheritDoc}
     */
	@Override
	public Long getBuildId() {
		return buildId;
	}
    /**
     * {@inheritDoc}
     */
    @Override
	public Long getBusinessCriticality() {
        return businessCriticality.longValue();
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getBusinessOwner() {
        return businessOwner;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getBusinessUnit() {
        return businessUnit;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public CustomFieldsList getCustomFields() {
        return customfields;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public DynamicAnalysis getDynamicAnalysisSecurityTestingReport() {
    	
    	if(this.dynamicAnalysis != null) {
    	
	    	DynamicAnalysisReport dynamicanalysisreport = (DynamicAnalysisReport)this.dynamicAnalysis;
	    	List<Find> finds = this.getDynamicAnalysisFindings();
	    	
	    	try {
	    		//Class<?> staticanalysisclass = dynamicanalysisreport.getClass();
		    	Class[] cArgs = new Class[1];
	    		cArgs[0] = List.class;
		    	Method privateListMethod = DynamicAnalysisReport.class.getSuperclass().getDeclaredMethod("setFindings", cArgs);
		    	privateListMethod.setAccessible(true);
		    	privateListMethod.invoke(dynamicanalysisreport, finds);
		    	
		    }catch(Exception e) {
		    	e.printStackTrace();
	    	}
    	}
    	return dynamicAnalysis;
    }

	/**
     * {@inheritDoc}
     */
    @Override
	public String getFirstBuildSubmittedDate() {
        return firstBuildSubmittedDate;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public Long getFlawsNotMitigated() {
        return flawsNotMitigated.longValue();
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public FlawStatus getFlawStatus() {
        return flawStatus;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getGenerationDate() {
        return generationDate;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getLastUpdateTime() {
        return lastUpdateTime;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getLifeCycleStage() {
        return lifeCycleStage;
    }

	/**
     * {@inheritDoc}
     */
    @Override
	public ManualAnalysis getManualAnalysisSecurityTestingReport() {
        return manualAnalysis;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getPlannedDeploymentDate() {
        return plannedDeploymentDate;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getPlatform() {
        return platform;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getPolicyComplianceStatus() {
        return policyComplianceStatus;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getPolicyName() {
        return policyName;
    }
    /**	
     * {@inheritDoc}
     */
    @Override
	public String getPolicyRulesStatus() {
        return policyRulesStatus;
    }  
    /**
     * {@inheritDoc}
     */
    @Override
	public Long getPolicyVersion() {
        return policyVersion.longValue();
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getReportFormatVersion() {
        return reportFormatVersion;
    }
    /**
      * {@inheritDoc}
      */
    @Override
	public Long getSandboxId() {
        return sandboxId;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getSandboxName() {
        return sandboxName;
    }
     /**
     * {@inheritDoc}
     */
    @Override
	public Long getScanId() {
        return buildId;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getScanName() {
        return version;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getScanOverdue() {
        return scanOverdue;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public List<Severity> getSeverities() {
        if (severity == null) {
            severity = new ArrayList<Severity>();
        }
        return this.severity;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public SoftwareCompositionAnalysis getSoftwareCompositionAnalysisReport() {
        return softwareCompositionAnalysis;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public StaticAnalysis getStaticAnalysisSecurityTestingReport() {
    	
    	if(this.staticAnalysis != null) {
	    	
	    	StaticAnalysisReport staticanalysisreport = (StaticAnalysisReport)this.staticAnalysis;
	    	List<Find> finds = this.getStaticAnalysisFindings();
	    	
	    	try {
	    		//Class<?> staticanalysisclass = staticanalysisreport.getClass().getSuperclass();
		    	Class[] cArgs = new Class[1];
	    		cArgs[0] = List.class;
		    	Method privateListMethod = StaticAnalysisReport.class.getSuperclass().getDeclaredMethod("setFindings", cArgs);
		    	privateListMethod.setAccessible(true);
		    	privateListMethod.invoke(staticanalysisreport, finds);
		    	
		    }catch(Exception e) {
		    	e.printStackTrace();
	    	}
    	}
    	return staticAnalysis;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getSubmitter() {
        return submitter;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getTags() {
        return tags;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getTeams() {
        return teams;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public Long getTotalFlaws() {
        return totalFlaws.longValue();
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getVendor() {
        return vendor;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public String getVeracodeLevel() {
        return veracodeLevel;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public Boolean hasGracePeriodExpired() {
        return gracePeriodExpired;
    }
    /**
     * {@inheritDoc}
     */
	@Override
	public Boolean hasAnalysisType(AnalysisReportType analysisReportType) {
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
     * {@inheritDoc}
     */
    @Override
	public Boolean isLatestBuild() {
        return isLatestBuild;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public Boolean isLegacyScanEngine() {
        return legacyScanEngine;
    }
    /**
     * {@inheritDoc}
     */
    @Override
	public Boolean isPolicyLevelAnalysis() {
    	boolean result = false;
    	
    	if(this.sandboxName == null || this.sandboxName.equals("")) {
    		result = true;
    	}
    	
    	return result;
    }
    private List<Find> getDynamicAnalysisFindings() {
    	
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
    private void setAccountId(Long accountid) {
		this.accountid = accountid;
	}
    private void setAnalysisId(String analysisid) {
		this.analysisid = analysisid;
	}

    /**
     * {@inheritDoc}
     */
    private void setAnyTypeScanDue(String value) {
        this.anyTypeScanDue = value;
    }

    /**
     * {@inheritDoc}
     */
    private void setApplicationPortfolioId(Long value) {
        this.appId = value;
    }
    /**
     * {@inheritDoc}
     */
    private void setApplicationPortfolioName(String value) {
        this.appName = value;
    }
    /**
     * {@inheritDoc}
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
     *     {@link SoftwareCompositionAnalysisReport }
     *     
     */
    private void setSoftwareCompositionAnalysis(SoftwareCompositionAnalysis value) {
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

    protected List<Find> getManualAnalysisFindings() {
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
     * {@inheritDoc}
     */
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
}
