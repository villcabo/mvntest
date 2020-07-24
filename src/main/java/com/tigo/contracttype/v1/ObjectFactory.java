
package com.tigo.contracttype.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.contracttype.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContractType_QNAME = new QName("http://www.tigo.com/ContractType/V1", "ContractType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.contracttype.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContractComplexType }
     * 
     */
    public ContractComplexType createContractComplexType() {
        return new ContractComplexType();
    }

    /**
     * Create an instance of {@link ContractComplexType.Accounts }
     * 
     */
    public ContractComplexType.Accounts createContractComplexTypeAccounts() {
        return new ContractComplexType.Accounts();
    }

    /**
     * Create an instance of {@link ContractComplexType.Profiles }
     * 
     */
    public ContractComplexType.Profiles createContractComplexTypeProfiles() {
        return new ContractComplexType.Profiles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com/ContractType/V1", name = "ContractType")
    public JAXBElement<ContractComplexType> createContractType(ContractComplexType value) {
        return new JAXBElement<ContractComplexType>(_ContractType_QNAME, ContractComplexType.class, null, value);
    }

}
