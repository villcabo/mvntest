
package com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobileresponse.v1.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tigo.clienttype.v2.ClientComplexType;
import com.tigo.contracttype.v1.ContractComplexType;
import com.tigo.xmlns.parametertype.v2.ParameterType;


/**
 * <p>Java class for GetClientAccountGeneralInfoMobileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientAccountGeneralInfoMobileResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://www.tigo.com/ClientType/V2}ClientComplexType"/>
 *         &lt;element name="contracts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contract" type="{http://www.tigo.com/ContractType/V1}ContractComplexType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enterpriseAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GetClientAccountGeneralInfoMobileResponseType", propOrder = {
    "client",
    "contracts",
    "enterpriseAddress",
    "additionalResults"
})
public class GetClientAccountGeneralInfoMobileResponseType {

    @XmlElement(required = true)
    protected ClientComplexType client;
    @XmlElement(required = true)
    protected Contracts contracts;
    @XmlElement(required = true)
    protected String enterpriseAddress;
    protected AdditionalResults additionalResults;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientComplexType }
     *     
     */
    public ClientComplexType getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientComplexType }
     *     
     */
    public void setClient(ClientComplexType value) {
        this.client = value;
    }

    /**
     * Gets the value of the contracts property.
     * 
     * @return
     *     possible object is
     *     {@link Contracts }
     *     
     */
    public Contracts getContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contracts }
     *     
     */
    public void setContracts(Contracts value) {
        this.contracts = value;
    }

    /**
     * Gets the value of the enterpriseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    /**
     * Sets the value of the enterpriseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseAddress(String value) {
        this.enterpriseAddress = value;
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
     *         &lt;element name="contract" type="{http://www.tigo.com/ContractType/V1}ContractComplexType" maxOccurs="unbounded"/>
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
        "contract"
    })
    public static class Contracts {

        @XmlElement(required = true, namespace = "http://www.tigo.com/ContractType/V1")
        protected List<ContractComplexType> contract;

        /**
         * Gets the value of the contract property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contract property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContract().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractComplexType }
         * 
         * 
         */
        public List<ContractComplexType> getContract() {
            if (contract == null) {
                contract = new ArrayList<ContractComplexType>();
            }
            return this.contract;
        }

    }

}
