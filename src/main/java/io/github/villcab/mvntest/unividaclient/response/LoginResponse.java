package io.github.villcab.mvntest.unividaclient.response;

public class LoginResponse {

    private String id_token;

    public String getId_token() {
        return id_token;
    }

    public void setId_token(String id_token) {
        this.id_token = id_token;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "id_token='" + id_token + '\'' +
                '}';
    }
}
