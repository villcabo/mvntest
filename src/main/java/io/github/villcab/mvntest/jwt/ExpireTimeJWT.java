package io.github.villcab.mvntest.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ExpireTimeJWT {

    private static final JwtParser jwtParser = Jwts.parserBuilder().build();

    public static void main(String[] args) {

//        String yourJwt = "eyJhbGciOiJIUzUxMiJ9.eyJOb21icmUiOiJzaW50ZXNpc19kZXYiLCJzdWIiOiJzaW50ZXNpc19kZXYiLCJUaXBvIjoiRU1QUkVTQSIsIlN1YnRpcG8iOm51bGwsIklkVXN1YXJpbyI6NTI4LCJPYnNlcnZhZG8iOmZhbHNlLCJNZW51IjpbeyJ0aXR1bG8iOiJBZG1pbmlzdHJhY2nDs24iLCJvcmRlbiI6MSwibGlzdGFQZXJtaXNvIjpbeyJpZFBlcm1pc28iOjE1LCJub21icmUiOiJVc3VhcmlvcyIsInZhbG9yIjoiL3VzdWFyaW9zIiwib3JkZW4iOjEsIl9faGlqb3MiOm51bGx9XX0seyJ0aXR1bG8iOiJUcmFuc2ZlcmVuY2lhcyIsIm9yZGVuIjowLCJsaXN0YVBlcm1pc28iOlt7ImlkUGVybWlzbyI6MTcsIm5vbWJyZSI6IlRyYW5zYWNjaW9uZXMiLCJ2YWxvciI6Ii90cmFuc2FjY2lvbmVzIiwib3JkZW4iOjEsIl9faGlqb3MiOm51bGx9LHsiaWRQZXJtaXNvIjoyMywibm9tYnJlIjoiUmVwb3J0ZXMiLCJ2YWxvciI6Ii9yZXBvcnRlcyIsIm9yZGVuIjoxLCJfX2hpam9zIjpudWxsfV19LHsidGl0dWxvIjoiRW50aWRhZGVzIiwib3JkZW4iOjMsImxpc3RhUGVybWlzbyI6W3siaWRQZXJtaXNvIjoyMSwibm9tYnJlIjoiU2VydmljaW9zIiwidmFsb3IiOiIvc2VydmljaW9zIiwib3JkZW4iOjEsIl9faGlqb3MiOm51bGx9LHsiaWRQZXJtaXNvIjozMiwibm9tYnJlIjoiRXN0cnVjdHVyYSIsInZhbG9yIjoiL2VzdHJ1Y3R1cmEiLCJvcmRlbiI6MiwiX19oaWpvcyI6bnVsbH1dfSx7InRpdHVsbyI6IkNvYnJvcyIsIm9yZGVuIjoxLCJsaXN0YVBlcm1pc28iOltdfSx7InRpdHVsbyI6IlJlcG9ydGVzIiwib3JkZW4iOjIsImxpc3RhUGVybWlzbyI6W119LHsidGl0dWxvIjoiRGFzaGJvYXJkcyIsIm9yZGVuIjo1LCJsaXN0YVBlcm1pc28iOlt7ImlkUGVybWlzbyI6MTAwMDAxLCJub21icmUiOiJEYXNoYm9hcmQiLCJ2YWxvciI6Ii9kYXNoYm9hcmQtZ3JhcGhpYyIsIm9yZGVuIjo0LCJfX2hpam9zIjpudWxsfV19XSwiZXhwIjoxNzEyMjQ1MTE5LCJpYXQiOjE3MTIyNDE1MTksIkVudGlkYWQiOjEyMn0.Y-Wfbswl8bhnEq567c5S-CJ95_VPgEb85qhf1xErx3HXJPv21KCsUCv3JJEWdtpwQbXYE3q0rdR9WbEHHE0dyg";

//        Claims claims = Jwts.parserBuilder().build().parseClaimsJwt(yourJwt).getBody();
//
//        // Obtener la fecha de expiración del token
//        long expirationTimeMillis = claims.getExpiration().getTime();
//
//        // Convertir la fecha de expiración a una cadena legible
//        // Aquí puedes formatear la fecha como desees
//        String expirationTimeString = new java.util.Date(expirationTimeMillis).toString();
//
//        // Imprimir la fecha de expiración
//        System.out.println("Fecha de expiración del JWT: " + expirationTimeString);



        // Aquí deberías tener tu token JWT como una cadena
        String jwt = "eyJhbGciOiJIUzUxMiJ9.eyJOb21icmUiOiJzaW50ZXNpc19kZXYiLCJzdWIiOiJzaW50ZXNpc19kZXYiLCJUaXBvIjoiRU1QUkVTQSIsIlN1YnRpcG8iOm51bGwsIklkVXN1YXJpbyI6NTI4LCJPYnNlcnZhZG8iOmZhbHNlLCJNZW51IjpbeyJ0aXR1bG8iOiJBZG1pbmlzdHJhY2nDs24iLCJvcmRlbiI6MSwibGlzdGFQZXJtaXNvIjpbeyJpZFBlcm1pc28iOjE1LCJub21icmUiOiJVc3VhcmlvcyIsInZhbG9yIjoiL3VzdWFyaW9zIiwib3JkZW4iOjEsIl9faGlqb3MiOm51bGx9XX0seyJ0aXR1bG8iOiJUcmFuc2ZlcmVuY2lhcyIsIm9yZGVuIjowLCJsaXN0YVBlcm1pc28iOlt7ImlkUGVybWlzbyI6MTcsIm5vbWJyZSI6IlRyYW5zYWNjaW9uZXMiLCJ2YWxvciI6Ii90cmFuc2FjY2lvbmVzIiwib3JkZW4iOjEsIl9faGlqb3MiOm51bGx9LHsiaWRQZXJtaXNvIjoyMywibm9tYnJlIjoiUmVwb3J0ZXMiLCJ2YWxvciI6Ii9yZXBvcnRlcyIsIm9yZGVuIjoxLCJfX2hpam9zIjpudWxsfV19LHsidGl0dWxvIjoiRW50aWRhZGVzIiwib3JkZW4iOjMsImxpc3RhUGVybWlzbyI6W3siaWRQZXJtaXNvIjoyMSwibm9tYnJlIjoiU2VydmljaW9zIiwidmFsb3IiOiIvc2VydmljaW9zIiwib3JkZW4iOjEsIl9faGlqb3MiOm51bGx9LHsiaWRQZXJtaXNvIjozMiwibm9tYnJlIjoiRXN0cnVjdHVyYSIsInZhbG9yIjoiL2VzdHJ1Y3R1cmEiLCJvcmRlbiI6MiwiX19oaWpvcyI6bnVsbH1dfSx7InRpdHVsbyI6IkNvYnJvcyIsIm9yZGVuIjoxLCJsaXN0YVBlcm1pc28iOltdfSx7InRpdHVsbyI6IlJlcG9ydGVzIiwib3JkZW4iOjIsImxpc3RhUGVybWlzbyI6W119LHsidGl0dWxvIjoiRGFzaGJvYXJkcyIsIm9yZGVuIjo1LCJsaXN0YVBlcm1pc28iOlt7ImlkUGVybWlzbyI6MTAwMDAxLCJub21icmUiOiJEYXNoYm9hcmQiLCJ2YWxvciI6Ii9kYXNoYm9hcmQtZ3JhcGhpYyIsIm9yZGVuIjo0LCJfX2hpam9zIjpudWxsfV19XSwiZXhwIjoxNzEyMjQ1MTE5LCJpYXQiOjE3MTIyNDE1MTksIkVudGlkYWQiOjEyMn0.Y-Wfbswl8bhnEq567c5S-CJ95_VPgEb85qhf1xErx3HXJPv21KCsUCv3JJEWdtpwQbXYE3q0rdR9WbEHHE0dyg";

        // Separar las partes del token (header, payload, signature)
        String[] parts = jwt.split("\\.");

        // Decodificar el payload (parte central del JWT)
        String payload = new String(Base64.getUrlDecoder().decode(parts[1]), StandardCharsets.UTF_8);

        // Buscar la fecha de expiración en el payload
        int expIndex = payload.indexOf("\"exp\":");
        if (expIndex != -1) {
            int commaIndex = payload.indexOf(',', expIndex);
            String expirationString = payload.substring(expIndex + 6, commaIndex != -1 ? commaIndex : payload.length() - 1);
            long expirationTimeSeconds = Long.parseLong(expirationString);
            long expirationTimeMillis = expirationTimeSeconds * 1000; // Convertir segundos a milisegundos
            String expirationTimeString = new java.util.Date(expirationTimeMillis).toString();


            System.out.println("Fecha de expiración del JWT: " + System.currentTimeMillis());
            System.out.println("Fecha de expiración del JWT: " + expirationTimeMillis);

            System.out.println("Fecha de expiración del JWT: " + expirationTimeString);
        } else {
            System.out.println("No se encontró la fecha de expiración en el JWT.");
        }
    }
}
