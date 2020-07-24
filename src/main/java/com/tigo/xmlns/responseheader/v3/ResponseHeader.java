
package com.tigo.xmlns.responseheader.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="GeneralResponse" type="{http://xmlns.tigo.com/ResponseHeader/V3}GeneralResponseType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ResponseHeader")
public class ResponseHeader {

    @XmlElement(name = "GeneralResponse", required = true)
    protected GeneralResponseType generalResponse;

    /**
     * Gets the value of the generalResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralResponseType }
     *     
     */
    public GeneralResponseType getGeneralResponse() {
        return generalResponse;
    }

    /**
     * Sets the value of the generalResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralResponseType }
     *     
     */
    public void setGeneralResponse(GeneralResponseType value) {
        this.generalResponse = value;
    }

}
