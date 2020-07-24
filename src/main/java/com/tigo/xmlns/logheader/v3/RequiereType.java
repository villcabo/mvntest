
package com.tigo.xmlns.logheader.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requiereType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiereType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUE"/>
 *     &lt;enumeration value="FALSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiereType")
@XmlEnum
public enum RequiereType {

    TRUE,
    FALSE;

    public String value() {
        return name();
    }

    public static RequiereType fromValue(String v) {
        return valueOf(v);
    }

}
