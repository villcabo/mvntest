package io.github.villcab.mvntest.unividaclient;

import io.github.villcab.mvntest.pgp3.PGPEncryption;
import io.github.villcab.mvntest.unividaclient.request.LottoRequest;
import io.github.villcab.mvntest.unividaclient.util.GsonUtil;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;

public class LottoMain {

    private static final String endpoint = "http://localhost:8007";
//    private static final String endpoint = "http://dev-kraken.eastus.cloudapp.azure.com:8007";
    private static final String username = "user";
    private static final String password = "user";

    public static void main(String[] args) {
        LottoMain lottoMain = new LottoMain();
        String jwt = AuthenticateMain.authenticate(endpoint, username, password);

        lottoMain.postCreateLotto(jwt, "1731NUB");
    }

    public void postCreateLotto(String jwt, String licensePlate) {

        LottoRequest lottoRequest = new LottoRequest();
        lottoRequest.setLicensePlate(licensePlate);
        lottoRequest.setRosetteNumber("123456789");
        lottoRequest.setCiOwner("7800725");
        lottoRequest.setFullNameOwner("Bismarck Villca Soliz");
        lottoRequest.setPhoneOwner("75307332");
        lottoRequest.setEmailOwner("bismarck.villca@gmail.com");
        lottoRequest.setFileNameRosette(loadImage(jwt, "ci"));
        lottoRequest.setFileNameRuat(loadImage(jwt, "ruat"));

        String json = GsonUtil.gson.toJson(lottoRequest);
        System.out.println(json);

        String publicKey = this.getClass().getResource("/Tnbk-publicKey.asc").getPath();

        String request = null;
        try {
            request = PGPEncryption.encryptToString(json, publicKey);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(endpoint).path("api").path("mob").path("lottos").path("create");

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON).header("Authorization", "Bearer " + jwt);
        Response response = invocationBuilder.post(Entity.entity(request, MediaType.APPLICATION_JSON));

        System.out.println("=============================== ResponseStatus ===============================");
        System.out.println("ResponseStatus: " + response.getStatus());
        System.out.println("=============================== ResponseHeaders ===============================");
        response.getHeaders().forEach((s, objects) -> {
            if (s.contains("X-unividaBackendApp")) {
                System.out.println(s + ", " + objects);
            }
        });
        System.out.println("=============================== ResponseBody ===============================");
        String tmResponse = response.readEntity(String.class);
        if (response.getStatus() == 200) {
            System.out.println("Response: " + tmResponse);
        } else {
            System.out.println(tmResponse);
        }
    }

    public String loadImage(String jwt, String type) {
        Client client = ClientBuilder.newClient()
                .register(MultiPartFeature.class);
//                .register(LoggingFilter.class);

        WebTarget webTarget = client.target(endpoint).path("api").path("mob").path("lottos").path("upload-image");

        MultiPart multiPart = new MultiPart(MediaType.MULTIPART_FORM_DATA_TYPE);

        FileDataBodyPart fileDataBodyPart;
        if (type.equalsIgnoreCase("ci")) {
            fileDataBodyPart = new FileDataBodyPart("file", new File(this.getClass().getResource("/img-lotto/ci-file.jpg").getPath()), MediaType.APPLICATION_OCTET_STREAM_TYPE);
        } else {
            fileDataBodyPart = new FileDataBodyPart("file", new File(this.getClass().getResource("/img-lotto/ruat-file.jpg").getPath()), MediaType.APPLICATION_OCTET_STREAM_TYPE);
        }
        multiPart.bodyPart(fileDataBodyPart);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON).header("Authorization", "Bearer " + jwt);
        Response response = invocationBuilder.post(Entity.entity(multiPart, multiPart.getMediaType()));

        if (response.getStatus() == 200) {
            return response.readEntity(String.class);
        } else {
            System.out.println("Failed to upload image");
            return null;
        }
    }
}
