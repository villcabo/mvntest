package io.github.villcab.mvntest.tigoapiaccountclient;

import com.tigo.xmlns.tigobusiness.service.getclientaccountgeneralinfomobile.v1.GeneralResponseMessage;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;

public class GetAccountClientWs1 {

    public static void main(String[] args) throws GeneralResponseMessage, MalformedURLException {
        String wsdlUrl = "https://oracleapigw.tigo.net.bo/Regional/TigoBusinessOnline/GetClientAccountGeneralInfoMobile";
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();


            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();
            SOAPEnvelope soapEnvelope = soapPart.getEnvelope();

            /*Body*/
            String prefixBody = "sch";
            String uriBody = "http://xmlns.tigo.com/TigoBusiness/GetClientAccountGeneralInfoMobileRequest/V1/schema";
            soapEnvelope.addNamespaceDeclaration(prefixBody, uriBody);
            SOAPBody soapBody = soapEnvelope.getBody();
            SOAPElement soapElement = soapBody.addChildElement("getClientAccountGeneralInfoMobileRequest", prefixBody);
            soapElement.addChildElement("searchType", prefixBody).addTextNode("MSISDN");
            soapElement.addChildElement("searchValue", prefixBody).addTextNode("75307332");
            soapElement.addChildElement("informationToRetrieve", prefixBody).addTextNode("17");
            soapElement.addChildElement("documentType", prefixBody).addTextNode("0");
            soapMessage.getMimeHeaders().addHeader(
                    "SOAPAction",
                    "http://xmlns.tigo.com/TigoBusiness/Service/GetClientAccountGeneralInfoMobile/V1/GetClientAccountGeneralInfoMobile"
            );

            /*Headers*/
            String username = "usrvulcan";
            String password = "U5rvulc4n";

            SOAPFactory factory = SOAPFactory.newInstance();
            String prefixSecurity = "wsse";
            String uriSecurity = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
            SOAPElement securityElem = factory.createElement("Security", prefixSecurity, uriSecurity);
            SOAPElement tokenElem = factory.createElement("UsernameToken", prefixSecurity, uriSecurity);
            tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-2");
            tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
            SOAPElement userElem = factory.createElement("Username", prefixSecurity, uriSecurity);
            userElem.addTextNode(username);
            SOAPElement pwdElem = factory.createElement("Password", prefixSecurity, uriSecurity);
            pwdElem.addTextNode(password);
            pwdElem.addAttribute(QName.valueOf("Type"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
            tokenElem.addChildElement(userElem);
            tokenElem.addChildElement(pwdElem);
            securityElem.addChildElement(tokenElem);
            SOAPHeader header = soapEnvelope.getHeader();
            header.addChildElement(securityElem);

            soapMessage.saveChanges();
            System.out.println("Request SOAP Message:");
            soapMessage.writeTo(System.out);
            System.out.println();

            SOAPMessage soapResponse = soapConnection.call(soapMessage, wsdlUrl);
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);

            System.out.println();
            System.out.println("----------------------------------------------------------------------");
            System.out.println();

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            soapResponse.writeTo(outputStream);
            String res = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
            System.out.println("String xml: " + res);


//            Document document = soapResponse.getSOAPPart().getOwnerDocument();

//            System.out.println(MyXmlUtil.getStringFromDocument(document,"client"));

//            Source src = soapResponse.getSOAPPart().getContent();
//            TransformerFactory tf = TransformerFactory.newInstance();
//            Transformer transformer = tf.newTransformer();
//            DOMResult result = new DOMResult();
//            transformer.transform(src, result);
//
//            Document document = (Document) result.getNode();
//
//            System.out.println(document);

//            OutputStream outputStream = new ByteArrayOutputStream();
//            soapResponse.writeTo();
//
            DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dfactory.newDocumentBuilder();
            Document document = builder.parse(res);

            System.out.println(document);

            soapConnection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
