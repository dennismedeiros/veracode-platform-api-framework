package com.dennismedeiros.veracode.platform.api.pojos.reporting.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlawStatusType")
public class FlawStatusSummary implements FlawStatus {

    @XmlAttribute(name = "new", required = true)
    protected BigInteger _new;
    @XmlAttribute(name = "reopen", required = true)
    protected BigInteger reopen;
    @XmlAttribute(name = "open", required = true)
    protected BigInteger open;
    @XmlAttribute(name = "cannot-reproduce")
    protected BigInteger cannotReproduce;
    @XmlAttribute(name = "fixed", required = true)
    protected BigInteger fixed;
    @XmlAttribute(name = "total", required = true)
    protected BigInteger total;
    @XmlAttribute(name = "not_mitigated", required = true)
    protected BigInteger notMitigated;
    @XmlAttribute(name = "sev-1-change", required = true)
    protected BigInteger sev1Change;
    @XmlAttribute(name = "sev-2-change", required = true)
    protected BigInteger sev2Change;
    @XmlAttribute(name = "sev-3-change", required = true)
    protected BigInteger sev3Change;
    @XmlAttribute(name = "sev-4-change", required = true)
    protected BigInteger sev4Change;
    @XmlAttribute(name = "sev-5-change", required = true)
    protected BigInteger sev5Change;
    @XmlAttribute(name = "conforms-to-guidelines")
    protected BigInteger conformsToGuidelines;
    @XmlAttribute(name = "deviates-from-guidelines")
    protected BigInteger deviatesFromGuidelines;
    @XmlAttribute(name = "total-reviewed-mitigations")
    protected BigInteger totalReviewedMitigations;

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getNew()
	 */
    @Override
	public BigInteger getNew() {
        return _new;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setNew(java.math.BigInteger)
	 */
    @Override
	public void setNew(BigInteger value) {
        this._new = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getReopen()
	 */
    @Override
	public BigInteger getReopen() {
        return reopen;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setReopen(java.math.BigInteger)
	 */
    @Override
	public void setReopen(BigInteger value) {
        this.reopen = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getOpen()
	 */
    @Override
	public BigInteger getOpen() {
        return open;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setOpen(java.math.BigInteger)
	 */
    @Override
	public void setOpen(BigInteger value) {
        this.open = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getCannotReproduce()
	 */
    @Override
	public BigInteger getCannotReproduce() {
        return cannotReproduce;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setCannotReproduce(java.math.BigInteger)
	 */
    @Override
	public void setCannotReproduce(BigInteger value) {
        this.cannotReproduce = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getFixed()
	 */
    @Override
	public BigInteger getFixed() {
        return fixed;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setFixed(java.math.BigInteger)
	 */
    @Override
	public void setFixed(BigInteger value) {
        this.fixed = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getTotal()
	 */
    @Override
	public BigInteger getTotal() {
        return total;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setTotal(java.math.BigInteger)
	 */
    @Override
	public void setTotal(BigInteger value) {
        this.total = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getNotMitigated()
	 */
    @Override
	public BigInteger getNotMitigated() {
        return notMitigated;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setNotMitigated(java.math.BigInteger)
	 */
    @Override
	public void setNotMitigated(BigInteger value) {
        this.notMitigated = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getSev1Change()
	 */
    @Override
	public BigInteger getSev1Change() {
        return sev1Change;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setSev1Change(java.math.BigInteger)
	 */
    @Override
	public void setSev1Change(BigInteger value) {
        this.sev1Change = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getSev2Change()
	 */
    @Override
	public BigInteger getSev2Change() {
        return sev2Change;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setSev2Change(java.math.BigInteger)
	 */
    @Override
	public void setSev2Change(BigInteger value) {
        this.sev2Change = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getSev3Change()
	 */
    @Override
	public BigInteger getSev3Change() {
        return sev3Change;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setSev3Change(java.math.BigInteger)
	 */
    @Override
	public void setSev3Change(BigInteger value) {
        this.sev3Change = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getSev4Change()
	 */
    @Override
	public BigInteger getSev4Change() {
        return sev4Change;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setSev4Change(java.math.BigInteger)
	 */
    @Override
	public void setSev4Change(BigInteger value) {
        this.sev4Change = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getSev5Change()
	 */
    @Override
	public BigInteger getSev5Change() {
        return sev5Change;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setSev5Change(java.math.BigInteger)
	 */
    @Override
	public void setSev5Change(BigInteger value) {
        this.sev5Change = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getConformsToGuidelines()
	 */
    @Override
	public BigInteger getConformsToGuidelines() {
        return conformsToGuidelines;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setConformsToGuidelines(java.math.BigInteger)
	 */
    @Override
	public void setConformsToGuidelines(BigInteger value) {
        this.conformsToGuidelines = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getDeviatesFromGuidelines()
	 */
    @Override
	public BigInteger getDeviatesFromGuidelines() {
        return deviatesFromGuidelines;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setDeviatesFromGuidelines(java.math.BigInteger)
	 */
    @Override
	public void setDeviatesFromGuidelines(BigInteger value) {
        this.deviatesFromGuidelines = value;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#getTotalReviewedMitigations()
	 */
    @Override
	public BigInteger getTotalReviewedMitigations() {
        return totalReviewedMitigations;
    }

    /* (non-Javadoc)
	 * @see com.veracode.platform.parsers.jaxb.templates.detailedreport.IFlawStatusType#setTotalReviewedMitigations(java.math.BigInteger)
	 */
    @Override
	public void setTotalReviewedMitigations(BigInteger value) {
        this.totalReviewedMitigations = value;
    }

}
