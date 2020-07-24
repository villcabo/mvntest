
package com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilecountresultsresponse.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilecountresultsresponse.v1.schema package. 
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

    private final static QName _GetClientAccountGeneralInfoMobileCountResultsResponse_QNAME = new QName("http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileCountResultsResponse/V1/schema", "getClientAccountGeneralInfoMobileCountResultsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilecountresultsresponse.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileCountResultsResponseType }
     * 
     */
    public GetClientAccountGeneralInfoMobileCountResultsResponseType createGetClientAccountGeneralInfoMobileCountResultsResponseType() {
        return new GetClientAccountGeneralInfoMobileCountResultsResponseType();
    }

    /**
     * Create an instance of {@link GetClientAccountGeneralInfoMobileCountResultsResponseType.AdditionalResults }
     * 
     */
    public GetClientAccountGeneralInfoMobileCountResultsResponseType.AdditionalResults createGetClientAccountGeneralInfoMobileCountResultsResponseTypeAdditionalResults() {
        return new GetClientAccountGeneralInfoMobileCountResultsResponseType.AdditionalResults();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccountGeneralInfoMobileCountResultsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileCountResultsResponse/V1/schema", name = "getClientAccountGeneralInfoMobileCountResultsResponse")
    public JAXBElement<GetClientAccountGeneralInfoMobileCountResultsResponseType> createGetClientAccountGeneralInfoMobileCountResultsResponse(GetClientAccountGeneralInfoMobileCountResultsResponseType value) {
        return new JAXBElement<GetClientAccountGeneralInfoMobileCountResultsResponseType>(_GetClientAccountGeneralInfoMobileCountResultsResponse_QNAME, GetClientAccountGeneralInfoMobileCountResultsResponseType.class, null, value);
    }

}
