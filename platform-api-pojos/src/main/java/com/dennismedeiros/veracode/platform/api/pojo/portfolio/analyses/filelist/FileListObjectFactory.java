package com.dennismedeiros.veracode.platform.api.pojo.portfolio.analyses.filelist;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class FileListObjectFactory {


    /**
     * Create a new FileListObjectFactory that can be used to create new instances of schema derived classes for package: com.veracode.platform.parsers.jaxb.templates.filelist
     * 
     */
    public FileListObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadFileContent }
     * @return new UploadFileContent object
     */
    public UploadedContent createFilelist() {
        return new UploadFileContent();
    }

    /**
     * Create an instance of {@link UploadFile }
     * @return new UploadFile
     */
    public UploadFile createFileType() {
        return new UploadFile();
    }

}
