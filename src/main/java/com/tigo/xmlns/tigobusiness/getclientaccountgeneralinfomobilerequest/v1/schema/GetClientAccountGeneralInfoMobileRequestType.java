
package com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilerequest.v1.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tigo.xmlns.parametertype.v2.ParameterType;


/**
 * <p>Java class for GetClientAccountGeneralInfoMobileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientAccountGeneralInfoMobileRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="MSISDN"/>
 *               &lt;enumeration value="DOCUMENT"/>
 *               &lt;enumeration value="BILLING_ACCOUNT"/>
 *               &lt;enumeration value="CLIENT_CODE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="informationToRetrieve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://xmlns.tigo.com/ParameterType/V2}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "GetClientAccountGeneralInfoMobileRequestType", propOrder = {
    "searchType",
    "searchValue",
    "informationToRetrieve",
    "documentType",
    "additionalParameters"
})
public class GetClientAccountGeneralInfoMobileRequestType {

    @XmlElement(required = true)
    protected String searchType;
    @XmlElement(required = true)
    protected String searchValue;
    @XmlElement(required = true)
    protected String informationToRetrieve;
    @XmlElement(required = true)
    protected String documentType;
    protected AdditionalParameters additionalParameters;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchValue(String value) {
        this.searchValue = value;
    }

    /**
     * Gets the value of the informationToRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationToRetrieve() {
        return informationToRetrieve;
    }

    /**
     * Sets the value of the informationToRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationToRetrieve(String value) {
        this.informationToRetrieve = value;
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
     * Gets the value of the additionalParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters }
     *     
     */
    public AdditionalParameters getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * Sets the value of the additionalParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters }
     *     
     */
    public void setAdditionalParameters(AdditionalParameters value) {
        this.additionalParameters = value;
    }


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
     *         &lt;element ref="{http://xmlns.tigo.com/ParameterType/V2}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
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
        "parameterType"
    })
    public static class AdditionalParameters {

        @XmlElement(name = "ParameterType", namespace = "http://xmlns.tigo.com/ParameterType/V2")
        protected List<ParameterType> parameterType;

        /**
         * Gets the value of the parameterType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameterType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParameterType }
         * 
         * 
         */
        public List<ParameterType> getParameterType() {
            if (parameterType == null) {
                parameterType = new ArrayList<ParameterType>();
            }
            return this.parameterType;
        }

    }

}
