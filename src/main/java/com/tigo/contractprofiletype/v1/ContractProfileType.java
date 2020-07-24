
package com.tigo.contractprofiletype.v1;

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
 *       &lt;sequence>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chargeAccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chargeAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="annexFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detailFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oneSideInvoice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="courrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="holdInvoice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxExempt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsNotification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profileState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "billingCycle",
    "invoiceType",
    "paymentMethod",
    "billingAddress",
    "billingContact",
    "chargeAccountType",
    "chargeAccount",
    "invoiceFormat",
    "annexFormat",
    "detailFormat",
    "oneSideInvoice",
    "courrierCode",
    "invoiceName",
    "holdInvoice",
    "taxExempt",
    "smsNotification",
    "city",
    "department",
    "zone",
    "profileState",
    "billingId"
})
@XmlRootElement(name = "ContractProfileType")
public class ContractProfileType {

    @XmlElement(required = true)
    protected String billingCycle;
    @XmlElement(required = true)
    protected String invoiceType;
    @XmlElement(required = true)
    protected String paymentMethod;
    @XmlElement(required = true)
    protected String billingAddress;
    @XmlElement(required = true)
    protected String billingContact;
    @XmlElement(required = true)
    protected String chargeAccountType;
    @XmlElement(required = true)
    protected String chargeAccount;
    @XmlElement(required = true)
    protected String invoiceFormat;
    @XmlElement(required = true)
    protected String annexFormat;
    @XmlElement(required = true)
    protected String detailFormat;
    @XmlElement(required = true)
    protected String oneSideInvoice;
    @XmlElement(required = true)
    protected String courrierCode;
    @XmlElement(required = true)
    protected String invoiceName;
    @XmlElement(required = true)
    protected String holdInvoice;
    @XmlElement(required = true)
    protected String taxExempt;
    @XmlElement(required = true)
    protected String smsNotification;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String department;
    @XmlElement(required = true)
    protected String zone;
    @XmlElement(required = true)
    protected String profileState;
    @XmlElement(required = true)
    protected String billingId;

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCycle(String value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress(String value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billingContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContact() {
        return billingContact;
    }

    /**
     * Sets the value of the billingContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContact(String value) {
        this.billingContact = value;
    }

    /**
     * Gets the value of the chargeAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAccountType() {
        return chargeAccountType;
    }

    /**
     * Sets the value of the chargeAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAccountType(String value) {
        this.chargeAccountType = value;
    }

    /**
     * Gets the value of the chargeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAccount() {
        return chargeAccount;
    }

    /**
     * Sets the value of the chargeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAccount(String value) {
        this.chargeAccount = value;
    }

    /**
     * Gets the value of the invoiceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceFormat() {
        return invoiceFormat;
    }

    /**
     * Sets the value of the invoiceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceFormat(String value) {
        this.invoiceFormat = value;
    }

    /**
     * Gets the value of the annexFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnexFormat() {
        return annexFormat;
    }

    /**
     * Sets the value of the annexFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnexFormat(String value) {
        this.annexFormat = value;
    }

    /**
     * Gets the value of the detailFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailFormat() {
        return detailFormat;
    }

    /**
     * Sets the value of the detailFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailFormat(String value) {
        this.detailFormat = value;
    }

    /**
     * Gets the value of the oneSideInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneSideInvoice() {
        return oneSideInvoice;
    }

    /**
     * Sets the value of the oneSideInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneSideInvoice(String value) {
        this.oneSideInvoice = value;
    }

    /**
     * Gets the value of the courrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourrierCode() {
        return courrierCode;
    }

    /**
     * Sets the value of the courrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourrierCode(String value) {
        this.courrierCode = value;
    }

    /**
     * Gets the value of the invoiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceName() {
        return invoiceName;
    }

    /**
     * Sets the value of the invoiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceName(String value) {
        this.invoiceName = value;
    }

    /**
     * Gets the value of the holdInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldInvoice() {
        return holdInvoice;
    }

    /**
     * Sets the value of the holdInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldInvoice(String value) {
        this.holdInvoice = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExempt(String value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the smsNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsNotification() {
        return smsNotification;
    }

    /**
     * Sets the value of the smsNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsNotification(String value) {
        this.smsNotification = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the profileState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileState() {
        return profileState;
    }

    /**
     * Sets the value of the profileState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileState(String value) {
        this.profileState = value;
    }

    /**
     * Gets the value of the billingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingId() {
        return billingId;
    }

    /**
     * Sets the value of the billingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingId(String value) {
        this.billingId = value;
    }

}
