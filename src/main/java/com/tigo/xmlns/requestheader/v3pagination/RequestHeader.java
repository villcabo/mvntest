
package com.tigo.xmlns.requestheader.v3pagination;

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
 *         &lt;element name="GeneralConsumerInformation" type="{http://xmlns.tigo.com/RequestHeader/V3pagination}GeneralConsumerInfoType"/>
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
@XmlRootElement(name = "RequestHeader")
public class RequestHeader {

    @XmlElement(name = "GeneralConsumerInformation", required = true)
    protected GeneralConsumerInfoType generalConsumerInformation;

    /**
     * Gets the value of the generalConsumerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralConsumerInfoType }
     *     
     */
    public GeneralConsumerInfoType getGeneralConsumerInformation() {
        return generalConsumerInformation;
    }

    /**
     * Sets the value of the generalConsumerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralConsumerInfoType }
     *     
     */
    public void setGeneralConsumerInformation(GeneralConsumerInfoType value) {
        this.generalConsumerInformation = value;
    }

}
