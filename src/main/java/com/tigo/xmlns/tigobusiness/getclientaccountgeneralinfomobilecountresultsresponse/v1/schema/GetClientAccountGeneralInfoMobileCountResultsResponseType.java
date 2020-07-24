
package com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilecountresultsresponse.v1.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tigo.xmlns.parametertype.v2.ParameterType;


/**
 * <p>Java class for GetClientAccountGeneralInfoMobileCountResultsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientAccountGeneralInfoMobileCountResultsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="additionalResults" minOccurs="0">
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
@XmlType(name = "GetClientAccountGeneralInfoMobileCountResultsResponseType", propOrder = {
    "resultCount",
    "additionalResults"
})
public class GetClientAccountGeneralInfoMobileCountResultsResponseType {

    @XmlElement(required = true)
    protected BigInteger resultCount;
    protected AdditionalResults additionalResults;

    /**
     * Gets the value of the resultCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCount(BigInteger value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the additionalResults property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalResults }
     *     
     */
    public AdditionalResults getAdditionalResults() {
        return additionalResults;
    }

    /**
     * Sets the value of the additionalResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalResults }
     *     
     */
    public void setAdditionalResults(AdditionalResults value) {
        this.additionalResults = value;
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
    public static class AdditionalResults {

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
