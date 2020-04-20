//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:08:25 AM EDT 
//


package com.dennismedeiros.veracode.platform.api.pojo.portfolio;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyComplianceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyComplianceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Calculating..."/>
 *     &lt;enumeration value="Not Assessed"/>
 *     &lt;enumeration value="Did Not Pass"/>
 *     &lt;enumeration value="Conditional Pass"/>
 *     &lt;enumeration value="Pass"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyComplianceType")
@XmlEnum
public enum PolicyComplianceType {

    @XmlEnumValue("Calculating...")
    CALCULATING("Calculating..."),
    @XmlEnumValue("Not Assessed")
    NOT_ASSESSED("Not Assessed"),
    @XmlEnumValue("Did Not Pass")
    DID_NOT_PASS("Did Not Pass"),
    @XmlEnumValue("Conditional Pass")
    CONDITIONAL_PASS("Conditional Pass"),
    @XmlEnumValue("Pass")
    PASS("Pass");
    private final String value;

    PolicyComplianceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyComplianceType fromValue(String v) {
        for (PolicyComplianceType c: PolicyComplianceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}