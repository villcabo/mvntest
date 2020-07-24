package io.github.villcab.mvntest.tigoapiaccountclient;

import com.tigo.xmlns.logheader.v3.LogHeader;
import com.tigo.xmlns.requestheader.v3pagination.RequestHeader;
import com.tigo.xmlns.responseheader.v3.ResponseHeader;
import com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobilerequest.v1.schema.GetClientAccountGeneralInfoMobileRequestType;
import com.tigo.xmlns.tigobusiness.getclientaccountgeneralinfomobileresponse.v1.schema.GetClientAccountGeneralInfoMobileResponseType;
import com.tigo.xmlns.tigobusiness.service.getclientaccountgeneralinfomobile.v1.GeneralResponseMessage;
import com.tigo.xmlns.tigobusiness.service.getclientaccountgeneralinfomobile.v1.PSGetClientAccountGeneralInfoMobile;
import com.tigo.xmlns.tigobusiness.service.getclientaccountgeneralinfomobile.v1.PSGetClientAccountGeneralInfoMobile_Service;
import io.github.villcab.mvntest.tigoapiaccountclient.tokenusername.WSSUsernameTokenSecurityHandlerResolver;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class GetAccountClientWs {

    public static void main(String[] args) throws GeneralResponseMessage, MalformedURLException {
        URL wsdlUrl = new URL("https://oracleapigw.tigo.net.bo/Regional/TigoBusinessOnline/GetClientAccountGeneralInfoMobile");
//        QName qname = new QName("http://xmlns.tigo.com/TigoBusiness/Service/GetClientAccountGeneralInfoMobile/V1", "PS_GetClientAccountGeneralInfoMobile");


        PSGetClientAccountGeneralInfoMobile_Service service = new PSGetClientAccountGeneralInfoMobile_Service(wsdlUrl);
        service.setHandlerResolver(new WSSUsernameTokenSecurityHandlerResolver());

        PSGetClientAccountGeneralInfoMobile proxy = service.getPSGetClientAccountGeneralInfoMobileSOAP();

        GetClientAccountGeneralInfoMobileRequestType requestBody = new GetClientAccountGeneralInfoMobileRequestType();
        requestBody.setSearchType("MSISDN");
        requestBody.setSearchValue("75307332");
        requestBody.setInformationToRetrieve("31");
        requestBody.setDocumentType("0");

        com.tigo.xmlns.requestheader.v3pagination.RequestHeader requestHeader = new RequestHeader();
        LogHeader logHeader = new LogHeader();

        Holder<GetClientAccountGeneralInfoMobileResponseType> responseBody = new Holder<>();
        Holder<ResponseHeader> responseHeader = new Holder<>();

        proxy.getClientAccountGeneralInfoMobile(requestBody, requestHeader, logHeader, responseBody, responseHeader);

        System.out.println(responseHeader.value.getGeneralResponse().getStatus().getValue());
        System.out.println(responseBody.value.getContracts().getContract().get(0).getContractNumber());
    }
}
