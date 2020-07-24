
package com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobileresponse.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobileresponse.v1.schema package. 
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

    private final static QName _GetClientAccountGeneralInfoMobileResponse_QNAME = new QName("http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileResponse/V1/schema", "getClientAccountGeneralInfoMobileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobileresponse.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileResponseType }
     * 
     */
    public GetClientAccountGeneralInfoMobileResponseType createGetClientAccountGeneralInfoMobileResponseType() {
        return new GetClientAccountGeneralInfoMobileResponseType();
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileResponseType.Contracts }
     * 
     */
    public GetClientAccountGeneralInfoMobileResponseType.Contracts createGetClientAccountGeneralInfoMobileResponseTypeContracts() {
        return new GetClientAccountGeneralInfoMobileResponseType.Contracts();
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileResponseType.AdditionalResults }
     * 
     */
    public GetClientAccountGeneralInfoMobileResponseType.AdditionalResults createGetClientAccountGeneralInfoMobileResponseTypeAdditionalResults() {
        return new GetClientAccountGeneralInfoMobileResponseType.AdditionalResults();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccountGeneralInfoMobileResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileResponse/V1/schema", name = "getClientAccountGeneralInfoMobileResponse")
    public JAXBElement<GetClientAccountGeneralInfoMobileResponseType> createGetClientAccountGeneralInfoMobileResponse(GetClientAccountGeneralInfoMobileResponseType value) {
        return new JAXBElement<GetClientAccountGeneralInfoMobileResponseType>(_GetClientAccountGeneralInfoMobileResponse_QNAME, GetClientAccountGeneralInfoMobileResponseType.class, null, value);
    }

}
