
package com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilerequest.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilerequest.v1.schema package. 
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

    private final static QName _GetClientAccountGeneralInfoMobileRequest_QNAME = new QName("http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileRequest/V1/schema", "getClientAccountGeneralInfoMobileRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilerequest.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileRequestType }
     * 
     */
    public GetClientAccountGeneralInfoMobileRequestType createGetClientAccountGeneralInfoMobileRequestType() {
        return new GetClientAccountGeneralInfoMobileRequestType();
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileRequestType.AdditionalParameters }
     * 
     */
    public GetClientAccountGeneralInfoMobileRequestType.AdditionalParameters createGetClientAccountGeneralInfoMobileRequestTypeAdditionalParameters() {
        return new GetClientAccountGeneralInfoMobileRequestType.AdditionalParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccountGeneralInfoMobileRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileRequest/V1/schema", name = "getClientAccountGeneralInfoMobileRequest")
    public JAXBElement<GetClientAccountGeneralInfoMobileRequestType> createGetClientAccountGeneralInfoMobileRequest(GetClientAccountGeneralInfoMobileRequestType value) {
        return new JAXBElement<GetClientAccountGeneralInfoMobileRequestType>(_GetClientAccountGeneralInfoMobileRequest_QNAME, GetClientAccountGeneralInfoMobileRequestType.class, null, value);
    }

}
