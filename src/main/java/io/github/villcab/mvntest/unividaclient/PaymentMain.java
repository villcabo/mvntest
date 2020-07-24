package io.github.villcab.mvntest.unividaclient;

import com.google.gson.Gson;
import io.github.villcab.mvntest.pgp3.PGPEncryption;
import io.github.villcab.mvntest.unividaclient.request.LoginRequest;
import io.github.villcab.mvntest.unividaclient.request.Sorter;
import io.github.villcab.mvntest.unividaclient.request.TmTransactionRequest;
import io.github.villcab.mvntest.unividaclient.response.LoginResponse;
import org.bouncycastle.openpgp.PGPException;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.*;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.math.BigDecimal;

public class PaymentMain {

    private final String endpoint = "http://localhost:8007";
    //    private final String endpoint = "http://dev-kraken.eastus.cloudapp.azure.com:8007";
    private final String username = "user";
    private final String password = "user";

    private final Gson gson = new Gson();

    public static void main(String[] args) {
        PaymentMain paymentMain = new PaymentMain();
        paymentMain.registerPayment();
//        paymentMain.decrypt();
    }

    public void decrypt() {
        try {
            String value = "-----BEGIN PGP MESSAGE-----\n" +
                    "   Version: BCPG v1.59\n" +
                    "   \n" +
                    "   hQEMA3wpWg4UuNpuAQf/Zn5zOmMnz+muncSbR4OvPggMGYAGIc9YxbW7eZYDNvys\n" +
                    "   DGcxloJGNeHSr9bkuXWrpG7ybprtLquVwOa5hlwhV/9+y5ka2bF3jZwjr3r3WJB0\n" +
                    "   M16My+DoPAu+PLgJoC2g6qibNY97/fSkQAEv9JUU6mJHh+Nrnu/WQwezpUnzb5Ff\n" +
                    "   rO/qWlE+ZehBDd0k3Ho1E8GriBKubZAHFpo5CeOWcRkV7nQ18q+ZPDs7JR9FHNBF\n" +
                    "   Y71mu8qQwXpQ7g4yo+XJvVsV9Nsf/hE4e38av3awOK9sFVEXXRLzRRVFuXf4ddnx\n" +
                    "   JeZBZO7snoNuTI+Ek9oQqnX6ga5cT6RJDLssuUXyKNKoAQZdB1+89RH1FqaGPeHJ\n" +
                    "   laVGev3FnPIJVGpsSxI5WD0SHxnU1pKG6NjRSPqtdBrc3Jhjk5xFmKB0pU7FN6pc\n" +
                    "   Nz9UULf/SsGRiXtdvsJ5/pG4WJzzh4T4scXPO+a3DBjnU3sWyrQReLS+gC1t6/Ap\n" +
                    "   1IY5xCt3PJQq1OFuSqRmjghaDAPA+2APHw07rDuUZXpKIV9UPk8B1SfZqJfPSQqM\n" +
                    "   S0rHQv86DdHx\n" +
                    "   =KtqJ\n" +
                    "   -----END PGP MESSAGE-----";
            String privateKey = this.getClass().getResource("/2VvY-PrivateKey.asc").getPath();
            String decrypted = PGPEncryption.decryptToString(value, privateKey, "2VvYkWPcEbz6qJzDKNm3Ilw");
            System.out.println(" =============================================== ");
            System.out.println(decrypted);
            System.out.println(" =============================================== ");
        } catch (IOException | PGPException e) {
            e.printStackTrace();
        }
    }

    public void registerPayment() {
        Sorter city = new Sorter("C_SC", "SC", "SANTA CRUZ");
        Sorter typeUse = new Sorter("TU_1", "1", "PARTICULAR");
        Sorter vehicleType = new Sorter("TV_5", "2", "VAGONETA");

        TmTransactionRequest request = new TmTransactionRequest(
                "75307332",
                "1234HYT",
                2018,
                new BigDecimal(87),
                "PT_NEW_PURCHASE",
                "7800725",
                "Villca Soliz",
                "bismarck.villca@gmail.com",
                "0.0|0.0",
                "Android",
                "1.2.0",
                "Android 7|Galaxy S5",
                city,
                typeUse,
                vehicleType
        );

        String json = gson.toJson(request);
        System.out.println(json);

        String publicKey = this.getClass().getResource("/Tnbk-publicKey.asc").getPath();
        try {
            String encryptedJson = PGPEncryption.encryptToString(json, publicKey);
//            System.out.println(encryptedJson);
            postPayment(AuthenticateMain.authenticate(endpoint, username, password), encryptedJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void postPayment(String jwt, String request) throws PGPException, IOException {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(endpoint).path("api").path("tigomoney").path("confirm-transaction");

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
            String privateKey = this.getClass().getResource("/2VvY-PrivateKey.asc").getPath();
            String decrypted = PGPEncryption.decryptToString(tmResponse, privateKey, "2VvYkWPcEbz6qJzDKNm3Ilw");
            System.out.println(decrypted);
        } else {
            System.out.println(tmResponse);
        }
//        System.out.println(response.readEntity(String.class));


//        if (response.getStatus() == 200) {
//            LoginResponse entity = response.readEntity(LoginResponse.class);
//            System.out.println("Login request: " + entity.getId_token());
//        }
    }
}
