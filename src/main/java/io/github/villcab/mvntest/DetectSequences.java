package io.github.villcab.mvntest;

import com.google.gson.Gson;
import io.github.villcab.mvntest.request.CustomerRequest;
import io.github.villcab.mvntest.request.InvoiceDetailsRequest;
import io.github.villcab.mvntest.request.InvoiceRequest;
import io.github.villcab.mvntest.request.NulledInvoiceRequest;
import io.github.villcab.mvntest.response.InvoiceResponse;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.*;

public class DetectSequences {

//    private final String endpoint = "http://localhost:8000/api";
    private final String endpoint = "https://power.kraken.bo:8443/api";

    private final String jwt = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJycXVpc3BlQHVuaXZpZGEuYm8iLCJhdXRoIjoiUk9MRV9QUk9WSURFUiIsImV4cCI6MTUxNzQ1MzY5Mn0.5YalAW4U0jsK4MzDx4R90pyRXgyzyNWYJPIam71VrShesY1_G1BTWvSyrloa2FWM67Uyb4uKcqipT8XgbCGkxQ";

    private final Gson gson = new Gson();

    public static void main(String[] args) {

        DetectSequences main = new DetectSequences();

        List<Integer> values = main.readFile();
        List<Integer> faltantes = new ArrayList<>();

        int i = 0, init = 1;
        do {
            int value = values.get(i);
            int sequence = init;
//            System.out.println("sequence: " + sequence + ", value: " + value);
            if (value != sequence) {
                System.out.println("============ Add: " + sequence);
                faltantes.add(sequence);
            } else {
                i++;
            }
            init++;

        } while (i < values.size());

        System.out.println("faltan size: " + faltantes.size());
        System.out.println(faltantes);

//        for (Integer item : faltantes) {
//            main.postInvoicePersonalized(item.longValue());
//        }
    }

    public List<Integer> readFile() {
        Scanner scanner = new Scanner(this.getClass().getResourceAsStream("/values-new.txt"));
        List<Integer> integerList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            integerList.add(scanner.nextInt());
        }
        return integerList;
    }

    public void postInvoicePersonalized(Long invoiceNumber) {
        try {
//            Client client = ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));
            Client client = ClientBuilder.newClient();
            WebTarget webTarget = client.target(endpoint).path("invoices").path("personalized");

            CustomerRequest customerRequest = new CustomerRequest(0L, "SIN NOMBRE");
            Set<InvoiceDetailsRequest> detailsRequests = new HashSet<>();
            InvoiceDetailsRequest invoiceDetailsRequest = new InvoiceDetailsRequest(
                    BigDecimal.ONE, "Salto de secuencia", new BigDecimal(1), new BigDecimal(1)
            );
            detailsRequests.add(invoiceDetailsRequest);
            InvoiceRequest request = new InvoiceRequest(
                    307L,
                    4L,
                    4L,
                    invoiceNumber,
                    "2017-12-29",
                    new BigDecimal(1),
                    "Nro. Transacción: " + UUID.randomUUID().toString().replaceAll("-", "").toLowerCase(),
                    customerRequest,
                    detailsRequests
            );

            Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + jwt);
            Response response = invocationBuilder.post(Entity.entity(request, MediaType.APPLICATION_JSON));

            if (response.getStatus() == 201) {
                InvoiceResponse entity = gson.fromJson(response.readEntity(String.class), InvoiceResponse.class);
                System.out.println("Invoice created with Id: " + entity.getId());

                cancelInvoice(entity.getId());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cancelInvoice(Long invoiceId) {
        try {
//            Client client = ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));
            Client client = ClientBuilder.newClient();
            WebTarget webTarget = client.target(endpoint).path("invoices").path("cancellations");

            NulledInvoiceRequest request = new NulledInvoiceRequest(invoiceId, "Anulado por salto de secuencia");

            Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + jwt);
            Response response = invocationBuilder.post(Entity.entity(request, MediaType.APPLICATION_JSON));

            if (response.getStatus() == 200) {
                InvoiceResponse entity = gson.fromJson(response.readEntity(String.class), InvoiceResponse.class);
                System.out.println("Invoice cancelled with Id: " + entity.getId());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
