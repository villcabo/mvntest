
package com.tigo.clienttype.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documenNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentExpeditionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="economicActivity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="admissionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="segmentation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scoring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="urlClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guaranteesNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subClientState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="M"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientComplexType", propOrder = {
    "documenNumber",
    "documentType",
    "documentExpeditionDate",
    "nationality",
    "clientCode",
    "name",
    "firstLastName",
    "secondLastName",
    "phoneNumber",
    "address",
    "email",
    "fax",
    "ruc",
    "businessName",
    "clientType",
    "subType",
    "economicActivity",
    "admissionDate",
    "segmentation",
    "scoring",
    "baseCurrency",
    "urlClient",
    "guaranteesNumber",
    "subClientState",
    "clientState",
    "genre"
})
public class ClientComplexType {

    @XmlElement(required = true)
    protected String documenNumber;
    @XmlElement(required = true)
    protected String documentType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentExpeditionDate;
    @XmlElement(required = true)
    protected String nationality;
    @XmlElement(required = true)
    protected String clientCode;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String firstLastName;
    @XmlElement(required = true)
    protected String secondLastName;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String fax;
    @XmlElement(required = true)
    protected String ruc;
    @XmlElement(required = true)
    protected String businessName;
    @XmlElement(required = true)
    protected String clientType;
    @XmlElement(required = true)
    protected String subType;
    @XmlElement(required = true)
    protected String economicActivity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar admissionDate;
    @XmlElement(required = true)
    protected String segmentation;
    @XmlElement(required = true)
    protected String scoring;
    @XmlElement(required = true)
    protected String baseCurrency;
    @XmlElement(required = true)
    protected String urlClient;
    @XmlElement(required = true)
    protected String guaranteesNumber;
    @XmlElement(required = true)
    protected String subClientState;
    @XmlElement(required = true)
    protected String clientState;
    @XmlElement(required = true)
    protected String genre;

    /**
     * Gets the value of the documenNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumenNumber() {
        return documenNumber;
    }

    /**
     * Sets the value of the documenNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumenNumber(String value) {
        this.documenNumber = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentExpeditionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentExpeditionDate() {
        return documentExpeditionDate;
    }

    /**
     * Sets the value of the documentExpeditionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentExpeditionDate(XMLGregorianCalendar value) {
        this.documentExpeditionDate = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the clientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Sets the value of the clientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCode(String value) {
        this.clientCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firstLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLastName() {
        return firstLastName;
    }

    /**
     * Sets the value of the firstLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLastName(String value) {
        this.firstLastName = value;
    }

    /**
     * Gets the value of the secondLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLastName() {
        return secondLastName;
    }

    /**
     * Sets the value of the secondLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLastName(String value) {
        this.secondLastName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the ruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Sets the value of the ruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the economicActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicActivity() {
        return economicActivity;
    }

    /**
     * Sets the value of the economicActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicActivity(String value) {
        this.economicActivity = value;
    }

    /**
     * Gets the value of the admissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Sets the value of the admissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmissionDate(XMLGregorianCalendar value) {
        this.admissionDate = value;
    }

    /**
     * Gets the value of the segmentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentation() {
        return segmentation;
    }

    /**
     * Sets the value of the segmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentation(String value) {
        this.segmentation = value;
    }

    /**
     * Gets the value of the scoring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoring() {
        return scoring;
    }

    /**
     * Sets the value of the scoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoring(String value) {
        this.scoring = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrency(String value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the urlClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlClient() {
        return urlClient;
    }

    /**
     * Sets the value of the urlClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlClient(String value) {
        this.urlClient = value;
    }

    /**
     * Gets the value of the guaranteesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteesNumber() {
        return guaranteesNumber;
    }

    /**
     * Sets the value of the guaranteesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteesNumber(String value) {
        this.guaranteesNumber = value;
    }

    /**
     * Gets the value of the subClientState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClientState() {
        return subClientState;
    }

    /**
     * Sets the value of the subClientState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClientState(String value) {
        this.subClientState = value;
    }

    /**
     * Gets the value of the clientState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientState() {
        return clientState;
    }

    /**
     * Sets the value of the clientState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientState(String value) {
        this.clientState = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

}
