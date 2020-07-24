
package com.tigo.xmlns.logheader.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.xmlns.logheader.v3 package. 
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

    private final static QName _LogHeaderAplication_QNAME = new QName("http://xmlns.tigo.com/LogHeader/V3", "aplication");
    private final static QName _LogHeaderLogRequest_QNAME = new QName("http://xmlns.tigo.com/LogHeader/V3", "logRequest");
    private final static QName _LogHeaderLogResponse_QNAME = new QName("http://xmlns.tigo.com/LogHeader/V3", "logResponse");
    private final static QName _LogHeaderUserAgent_QNAME = new QName("http://xmlns.tigo.com/LogHeader/V3", "userAgent");
    private final static QName _LogHeaderMsisdn_QNAME = new QName("http://xmlns.tigo.com/LogHeader/V3", "msisdn");
    private final static QName _LogHeaderIpClient_QNAME = new QName("http://xmlns.tigo.com/LogHeader/V3", "ipClient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.xmlns.logheader.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogHeader }
     * 
     */
    public LogHeader createLogHeader() {
        return new LogHeader();
    }

    /**
     * Create an instance of {@link AplicationType }
     * 
     */
    public AplicationType createAplicationType() {
        return new AplicationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/LogHeader/V3", name = "aplication", scope = LogHeader.class)
    public JAXBElement<AplicationType> createLogHeaderAplication(AplicationType value) {
        return new JAXBElement<AplicationType>(_LogHeaderAplication_QNAME, AplicationType.class, LogHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequiereType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/LogHeader/V3", name = "logRequest", scope = LogHeader.class, defaultValue = "FALSE")
    public JAXBElement<RequiereType> createLogHeaderLogRequest(RequiereType value) {
        return new JAXBElement<RequiereType>(_LogHeaderLogRequest_QNAME, RequiereType.class, LogHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequiereType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/LogHeader/V3", name = "logResponse", scope = LogHeader.class, defaultValue = "FALSE")
    public JAXBElement<RequiereType> createLogHeaderLogResponse(RequiereType value) {
        return new JAXBElement<RequiereType>(_LogHeaderLogResponse_QNAME, RequiereType.class, LogHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/LogHeader/V3", name = "userAgent", scope = LogHeader.class)
    public JAXBElement<String> createLogHeaderUserAgent(String value) {
        return new JAXBElement<String>(_LogHeaderUserAgent_QNAME, String.class, LogHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/LogHeader/V3", name = "msisdn", scope = LogHeader.class)
    public JAXBElement<String> createLogHeaderMsisdn(String value) {
        return new JAXBElement<String>(_LogHeaderMsisdn_QNAME, String.class, LogHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.tigo.com/LogHeader/V3", name = "ipClient", scope = LogHeader.class)
    public JAXBElement<String> createLogHeaderIpClient(String value) {
        return new JAXBElement<String>(_LogHeaderIpClient_QNAME, String.class, LogHeader.class, value);
    }

}
