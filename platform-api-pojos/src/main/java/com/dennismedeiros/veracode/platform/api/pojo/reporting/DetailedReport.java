package com.dennismedeiros.veracode.platform.api.pojo.reporting;

import java.util.List;

import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Analysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.AnalysisReportType;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.Find;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.mast.ManualAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.StaticAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sast.StaticAnalysisFlaw;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.sca.ISoftwareCompositionAnalysis;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.CustomFieldsList;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.FlawStatus;
import com.dennismedeiros.veracode.platform.api.pojo.reporting.common.Severity;


/**
 * Interface for Detailed Report document types.
 * 
 * 
 * @since 1.0
 * 
 * @version 0.0.0.1
 * 
 * @author Dennis Medeiros
 *
 * 
 *
 */
public interface DetailedReport {

	/**
	 * Returns the Account ID of the customer who owns the Application Portfolio. 
	 * 
	 * @return {@link Long}
	 */
	Long getAccountId();
	String getAnalysisId();
	String getAnyTypeScanDue();

	/**
	 * Returns the identifier of this Application Portfolio.
	 * @return {@link Long}
	 */
	Long getAppId();
	/**
	 * Returns the name of this Application Portfolio.
	 * @return {@link String}
	 */
	String getAppName();

	Long getAssuranceLevel();
	Long getBusinessCriticality();
	String getBusinessOwner();

	String getBusinessUnit();
	CustomFieldsList getCustomFields();
	Analysis getDynamicAnalysis();
	
	List<Find> getDynamicAnalysisFindings();

	String getFirstBuildSubmittedDate();
	Long getFlawsNotMitigated();

	FlawStatus getFlawStatus();
	
	String getGenerationDate();
	String getLastUpdateTime();

	String getLifeCycleStage();
	
	ManualAnalysis ManualPenetrationTestingAnalysis();
	List<Find> getManualAnalysisFindings();
	String getPlannedDeploymentDate();
	
	String getPlatform();
	String getPolicyComplianceStatus();
	String getPolicyName();
	
	String getPolicyRulesStatus();
	Long getPolicyVersion();

	String getReportFormatVersion();
	Long getSandboxId();

	String getSandboxName();
	Long getScanId();

	String getScanName();
	String getScanOverdue();

	List<Severity> getSeverities();
	ISoftwareCompositionAnalysis getSoftwareCompositionAnalysis();

	StaticAnalysis getStaticAnalysis();

	String getSubmitter();

	String getTags();
	String getTeams();

	Long getTotalFlaws();

	/**
	 * Returns the name of the vendor.
	 * @return the vendor's name.
	 */
	String getVendor();
	String getVeracodeLevel();
	Boolean hasGracePeriodExpired();
	/**
	 * Return true if the requested analysis report type is contained within the detailed report document.
	 * Otherwise the method will return false.
	 * 
	 * @param analysisReportType the analysis report type to search if the document contains.
	 * @return {@link Boolean}
	 */
	Boolean hasScan(AnalysisReportType analysisReportType);
	Boolean isLatestBuild();

	 /**
     * @deprecated
     * Indicates if the scanning engine being used is a legacyScanEngine.
     * 
     * @return {@link Boolean }
     */
	Boolean isLegacyScanEngine();
	Boolean isPolicyLevelAnalysis();
}