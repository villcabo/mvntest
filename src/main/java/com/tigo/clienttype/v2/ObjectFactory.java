
package com.tigo.clienttype.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.clienttype.v2 package. 
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

    private final static QName _ClientType_QNAME = new QName("http://www.tigo.com/ClientType/V2", "ClientType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.clienttype.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientComplexType }
     * 
     */
    public ClientComplexType createClientComplexType() {
        return new ClientComplexType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tigo.com/ClientType/V2", name = "ClientType")
    public JAXBElement<ClientComplexType> createClientType(ClientComplexType value) {
        return new JAXBElement<ClientComplexType>(_ClientType_QNAME, ClientComplexType.class, null, value);
    }

}
