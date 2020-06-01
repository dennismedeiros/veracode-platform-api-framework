package com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.filelist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.dennismedeiros.veracode.platform.api.pojo.common.UploadedFile;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "file"
})
@XmlRootElement(name = "filelist")
public class UploadFileContent implements UploadedContent {

	@XmlElement(name="file", type=UploadFile.class)
    protected List<UploadedFile> file;
    @XmlAttribute(name = "filelist_version", required = true)
    protected String filelistVersion;
    @XmlAttribute(name = "account_id")
    protected Long accountId;
    @XmlAttribute(name = "app_id")
    protected Long appId;
    @XmlAttribute(name = "sandbox_id")
    protected Long sandboxId;
    @XmlAttribute(name = "build_id")
    protected Long buildId;

    @Override
    public List<UploadedFile> getUploadedFiles() {
        if (file == null) {
            file = new ArrayList<UploadedFile>();
        }
        return this.file;
    }

    /**
     * Gets the value of the filelistVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
	public String getFileListVersion() {
        return filelistVersion;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Override
	public Long getAccountId() {
        return accountId;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Override
	public Long getApplicationPortfolioId() {
        return appId;
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
     * Gets the value of the buildId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Override
	public Long getAnalysisdId() {
        return buildId;
    }
}
