//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 11:12:48 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.reporting.analysis.dast;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DynamicScanType2")
@XmlEnum
public enum DynamicScanType2 implements IDynamicScanType {

    @XmlEnumValue("mp")
    MP("mp"),
    @XmlEnumValue("ds")
    DS("ds");
    private final String value;

    DynamicScanType2(String v) {
        value = v;
    }

    @Override
	public String value() {
        return value;
    }

    public static IDynamicScanType fromValue(String v) {
        for (DynamicScanType2 c: DynamicScanType2.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
