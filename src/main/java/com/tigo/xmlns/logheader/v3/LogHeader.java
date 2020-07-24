
package com.tigo.xmlns.logheader.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *       &lt;sequence>
 *         &lt;element name="logRequest" type="{http://xmlns.tigo.com/LogHeader/V3}requiereType" minOccurs="0"/>
 *         &lt;element name="logResponse" type="{http://xmlns.tigo.com/LogHeader/V3}requiereType" minOccurs="0"/>
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aplication" type="{http://xmlns.tigo.com/LogHeader/V3}AplicationType" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "logRequest",
    "logResponse",
    "userAgent",
    "ipClient",
    "aplication",
    "msisdn"
})
@XmlRootElement(name = "LogHeader")
public class LogHeader {

    @XmlElementRef(name = "logRequest", namespace = "http://xmlns.tigo.com/LogHeader/V3", type = JAXBElement.class, required = false)
    protected JAXBElement<RequiereType> logRequest;
    @XmlElementRef(name = "logResponse", namespace = "http://xmlns.tigo.com/LogHeader/V3", type = JAXBElement.class, required = false)
    protected JAXBElement<RequiereType> logResponse;
    @XmlElementRef(name = "userAgent", namespace = "http://xmlns.tigo.com/LogHeader/V3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userAgent;
    @XmlElementRef(name = "ipClient", namespace = "http://xmlns.tigo.com/LogHeader/V3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipClient;
    @XmlElementRef(name = "aplication", namespace = "http://xmlns.tigo.com/LogHeader/V3", type = JAXBElement.class, required = false)
    protected JAXBElement<AplicationType> aplication;
    @XmlElementRef(name = "msisdn", namespace = "http://xmlns.tigo.com/LogHeader/V3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msisdn;

    /**
     * Gets the value of the logRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequiereType }{@code >}
     *     
     */
    public JAXBElement<RequiereType> getLogRequest() {
        return logRequest;
    }

    /**
     * Sets the value of the logRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequiereType }{@code >}
     *     
     */
    public void setLogRequest(JAXBElement<RequiereType> value) {
        this.logRequest = value;
    }

    /**
     * Gets the value of the logResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequiereType }{@code >}
     *     
     */
    public JAXBElement<RequiereType> getLogResponse() {
        return logResponse;
    }

    /**
     * Sets the value of the logResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequiereType }{@code >}
     *     
     */
    public void setLogResponse(JAXBElement<RequiereType> value) {
        this.logResponse = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserAgent(JAXBElement<String> value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the ipClient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpClient() {
        return ipClient;
    }

    /**
     * Sets the value of the ipClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpClient(JAXBElement<String> value) {
        this.ipClient = value;
    }

    /**
     * Gets the value of the aplication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AplicationType }{@code >}
     *     
     */
    public JAXBElement<AplicationType> getAplication() {
        return aplication;
    }

    /**
     * Sets the value of the aplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AplicationType }{@code >}
     *     
     */
    public void setAplication(JAXBElement<AplicationType> value) {
        this.aplication = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsisdn(JAXBElement<String> value) {
        this.msisdn = value;
    }

}
