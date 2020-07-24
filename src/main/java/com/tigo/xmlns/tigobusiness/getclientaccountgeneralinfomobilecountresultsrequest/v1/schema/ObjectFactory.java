
package com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilecountresultsrequest.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilecountresultsrequest.v1.schema package. 
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

    private final static QName _GetClientAccountGeneralInfoMobileCountResultsRequest_QNAME = new QName("http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileCountResultsRequest/V1/schema", "getClientAccountGeneralInfoMobileCountResultsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilecountresultsrequest.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileCountResultsRequestType }
     * 
     */
    public GetClientAccountGeneralInfoMobileCountResultsRequestType createGetClientAccountGeneralInfoMobileCountResultsRequestType() {
        return new GetClientAccountGeneralInfoMobileCountResultsRequestType();
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileCountResultsRequestType.AdditionalParameters }
     * 
     */
    public GetClientAccountGeneralInfoMobileCountResultsRequestType.AdditionalParameters createGetClientAccountGeneralInfoMobileCountResultsRequestTypeAdditionalParameters() {
        return new GetClientAccountGeneralInfoMobileCountResultsRequestType.AdditionalParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccountGeneralInfoMobileCountResultsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileCountResultsRequest/V1/schema", name = "getClientAccountGeneralInfoMobileCountResultsRequest")
    public JAXBElement<GetClientAccountGeneralInfoMobileCountResultsRequestType> createGetClientAccountGeneralInfoMobileCountResultsRequest(GetClientAccountGeneralInfoMobileCountResultsRequestType value) {
        return new JAXBElement<GetClientAccountGeneralInfoMobileCountResultsRequestType>(_GetClientAccountGeneralInfoMobileCountResultsRequest_QNAME, GetClientAccountGeneralInfoMobileCountResultsRequestType.class, null, value);
    }

}
