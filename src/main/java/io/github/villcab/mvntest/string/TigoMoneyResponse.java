package io.github.villcab.mvntest.string;

import java.util.HashMap;
import java.util.Map;

public class TigoMoneyResponse {

    private String codRes;

    private String mensaje;

    private String orderId;

    private String transaccion;

    public TigoMoneyResponse(String paymentResponse) {
        String[] arrayStrings = paymentResponse.split("&");
        Map<String, String> map = new HashMap<>();
        for (String s : arrayStrings) {
            String[] keyValue = s.split("=");
            map.put(keyValue[0], keyValue[1]);
        }

        this.codRes = map.get("codRes");
        this.mensaje = map.get("mensaje");
        this.orderId = map.get("orderId");
        this.transaccion = map.get("transaccion");
    }

    @Override
    public String toString() {
        return "TigoMoneyResponse{" +
                "codRes='" + codRes + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", orderId='" + orderId + '\'' +
                ", transaccion='" + transaccion + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String response = "codRes=0&mensaje=La Transacción se realizó de manera exitosa&orderId=1215&transaccion=15356987";
        TigoMoneyResponse tigoMoneyResponse = new TigoMoneyResponse(response);
        System.out.println(tigoMoneyResponse);
    }
}
