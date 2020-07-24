
package com.tigo.plantype.v1;

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
 *         &lt;element name="planName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataPlanOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "planName",
    "planType",
    "planCode",
    "planDescription",
    "planSource",
    "dataPlanOnly"
})
@XmlRootElement(name = "PlanType")
public class PlanType {

    @XmlElement(required = true)
    protected String planName;
    @XmlElement(required = true)
    protected String planType;
    @XmlElement(required = true)
    protected String planCode;
    @XmlElement(required = true)
    protected String planDescription;
    @XmlElement(required = true)
    protected String planSource;
    protected boolean dataPlanOnly;

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Gets the value of the planType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * Sets the value of the planType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanType(String value) {
        this.planType = value;
    }

    /**
     * Gets the value of the planCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * Sets the value of the planCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCode(String value) {
        this.planCode = value;
    }

    /**
     * Gets the value of the planDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Sets the value of the planDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDescription(String value) {
        this.planDescription = value;
    }

    /**
     * Gets the value of the planSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanSource() {
        return planSource;
    }

    /**
     * Sets the value of the planSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanSource(String value) {
        this.planSource = value;
    }

    /**
     * Gets the value of the dataPlanOnly property.
     * 
     */
    public boolean isDataPlanOnly() {
        return dataPlanOnly;
    }

    /**
     * Sets the value of the dataPlanOnly property.
     * 
     */
    public void setDataPlanOnly(boolean value) {
        this.dataPlanOnly = value;
    }

}
