package io.github.villcab.mvntest.unividaclient;

import io.github.villcab.mvntest.unividaclient.request.LoginRequest;
import io.github.villcab.mvntest.unividaclient.response.LoginResponse;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class AuthenticateMain {

    public static String authenticate(String endpoint, String username, String password) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(endpoint).path("api").path("authenticate");

        LoginRequest request = new LoginRequest(username, password, false);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.post(Entity.entity(request, MediaType.APPLICATION_JSON));

        if (response.getStatus() == 200) {
            LoginResponse entity = response.readEntity(LoginResponse.class);
            System.out.println("Login request: " + entity.getId_token());
            return entity.getId_token();
        }
        return null;
    }
}
