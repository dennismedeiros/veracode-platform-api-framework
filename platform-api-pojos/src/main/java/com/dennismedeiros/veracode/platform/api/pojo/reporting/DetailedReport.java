package com.dennismedeiros.veracode.platform.api.pojo.reporting;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.analyses.AnalysisReportType;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.dast.DynamicAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.mast.ManualAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.sast.StaticAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.analyses.sca.SoftwareCompositionAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.CustomFieldsList;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.FlawStatus;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.Severity;


/**
 * Common interface for Detailed Report document types.
 * 
 * @author Dennis Medeiros
 * @since 1.0.0
 * @version 1.0.0 
 */
public interface DetailedReport {

	/**
	 * Returns the Account unique identifier of the customer within the system who owns the Application Portfolio. 
	 * 
	 * @return {@link Long}
	 */
	Long getAccountId();
	/**
	 * Returns the unique identifier of the first analysis that was created by the system. 
	 * 
	 * @return {@link String}
	 */
	String getOriginAnalysisId();
	/**
	 * Returns the date and time of any scans that are do by policy. 
	 * 
	 * @return {@link String}
	 */
	String getAnyTypeScanDue();
	/**
	 * Returns the unique identifier of the Application Portfolio.
	 * @return {@link Long}
	 */
	Long getApplicationPortfolioId();
	/**
	 * Returns the name of the Application Portfolio.
	 * @return {@link String}
	 */
	String getApplicationPortfolioName();
	/**
	 * Returns the Assurance Level.
	 * @return {@link Long}
	 */
	Long getAssuranceLevel();
	/**
	 * Returns that static analysis un
	 * @return the buildId
	 */
	Long getBuildId();
	/**
	 * Returns the Business Criticality Level assigned to the Application Portfolio.
	 * @return {@link Long}
	 */
	Long getBusinessCriticality();
	/**
	 * Returns the name of the individual that is the Business Owner of the Application Portfolio.
	 * @return {@link String}
	 */
	String getBusinessOwner();
	/**
	 * Returns the name of the Business Unit within the organization that owns the Application Portfolio.
	 * @return {@link String}
	 */
	String getBusinessUnit();
	/**
	 * Returns a list of customer fields and their values.
	 * @return {@link CustomFieldsList}
	 */
	CustomFieldsList getCustomFields();
	/**
	 * Returns the Dynamic Analysis Security Testing (DAST) related report of the detailed report, if conducted.
	 * <P>
	 * If Dynamic Analysis Security Testing (DAST) was conducted during Detailed Report period. The 
	 * method returns an object with the {@link DynamicAnalysis} interface. Else method returns null 
	 * if there was no DAST performed. 
	 * 
	 * @return Returns a object with interface of {@link DynamicAnalysis}.
	 */
	DynamicAnalysis getDynamicAnalysisSecurityTestingReport();
	/**
	 * @deprecated
	 * Returns the date that the first static analysis was submitted to the application portfolio.
	 * @return {@link String}
	 */
	String getFirstBuildSubmittedDate();
	
	/**
	 * Returns the total number of findings from the report that are not mitigated.
	 * @return {@link Long} 
	 */
	Long getFlawsNotMitigated();
	
	FlawStatus getFlawStatus();
	
	/**
	 * Returns the date that the Detailed Report was generated.
	 * @return {@link String}
	 */
	String getGenerationDate();
	String getLastUpdateTime();
	/**
	 * Returns the LifeCycle State that the application is within based on the application portfolio settings.
	 * @return {@link String}
	 */
	String getLifeCycleStage();
	/**
	 * Returns the report of Manual Penetration Analysis related to the application portfolio, if conducted.
	 * @return {@link ManualAnalysis}
	 */
	ManualAnalysis getManualAnalysisSecurityTestingReport();
	
	String getPlannedDeploymentDate();
	String getPlatform();
	String getPolicyComplianceStatus();
	
	String getPolicyName();
	String getPolicyRulesStatus();

	Long getPolicyVersion();
	String getReportFormatVersion();
	/**
	 * Returns the unique identifier that represents that sandbox.
	 * @return {@link Long}
	 */
	Long getSandboxId();
	/**
	 * Returns the name of the sandbox that contains that static analysis result. 
	 * @return Returns x y z
	 */
	String getSandboxName();

	/**
	 * @deprecated
	 * Returns the unique identifier used to represent that analysis that was performed.
	 * @return {@link Long}
	 */
	Long getScanId();
	/**
	 * @deprecated
	 * Returns the name used to represent that analysis that was performed.
	 * @return {@link String}
	 */
	String getScanName();
	String getScanOverdue();
	/**
	 * Returns the list of severities levels containing the categories, CWE and findings that was produced for the detailed report. 
	 * @return Returns a list of {@link Severity } objects
	 */
	List<Severity> getSeverities();
	/**
	 * Returns the Software Composition Analysis (SCA) related related report of the application portfolio, if conducted.
	 * <P>
	 * If Software Composition Analysis (SCA)  was conducted during Detailed Report period. The 
	 * method returns an object with the {@link SoftwareCompositionAnalysis} interface. Else method returns null 
	 * if there was no SCA performed. 
	 * 
	 * @return Returns a object with interface of {@link SoftwareCompositionAnalysis}.
	 */
	SoftwareCompositionAnalysis getSoftwareCompositionAnalysisReport();
	/**
	 * Returns the Static Analysis Security Testing (SAST) related report of the detailed report, if conducted.
	 * <P>
	 * If Static Analysis Security Testing (SAST) was conducted during Detailed Report period. The 
	 * method returns an object with the {@link StaticAnalysis} interface. Else method returns null 
	 * if there was no SAST performed. 
	 * 
	 * @return Returns a object with interface of {@link StaticAnalysis}.
	 */
	StaticAnalysis getStaticAnalysisSecurityTestingReport();

	/**
	 * Returns the submitter of the report analysis used to produce the detailed report.
	 * @return {@link String}
	 */
	String getSubmitter();
	/**
	 * Returns tags as a comma delimited string.
	 * @return {@link String}
	 */
	String getTags();
	/**
	 * Returns a comma delimited string containing the names of the teams that have access to the application portfolio
	 * @return {@link String}
	 */
	String getTeams();
	/**
	 * Returns the total number fo flaws being reported by all analyses represented within the report.
	 * @return {@link Long}
	 */
	Long getTotalFlaws();
	/**
	 * Returns the name of the vendor that owns the application portfolio.
	 * @return {@link String}
	 */
	String getVendor();
	/**
	 * Returns the Veracode Level that the application meets for the report.
	 * @return {@link String}
	 */
	String getVeracodeLevel();
	/**
	 * Returns flase if the application portfolio is not passing policy grace period.
	 * @return {@link Boolean}
	 */
	Boolean hasGracePeriodExpired();
	/**
	 * Return true if the requested analysis report type is contained within the detailed report document.
	 * Otherwise the method will return false.
	 * 
	 * @param analysisReportType the analysis report type to search if the document contains.
	 * @return {@link Boolean}
	 */
	Boolean hasAnalysisType(AnalysisReportType analysisReportType);
    /**
	 * @deprecated
	 * Returns true if the report contains the most recent static analysis conducted. 
	 * @return {@link Boolean}
	 */
	Boolean isLatestBuild();
	/**
     * @deprecated
     * Indicates if the scanning engine being used is a legacyScanEngine.
     * 
     * @return {@link Boolean }
     */
	Boolean isLegacyScanEngine();
	/**
     * @deprecated
     * Returns true if the Static Analysis report is from the Policy Level. 
     * @return {@link Boolean}
     */
	Boolean isPolicyLevelAnalysis();
}