package io.github.villcab.mvntest.jwt;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ExpireTime {

    public static void main(String[] args) {
        Instant i = Instant.ofEpochSecond(1526068295);
        ZonedDateTime z = ZonedDateTime.ofInstant(i, ZoneId.systemDefault());

        System.out.println("----------------------------------------------------------------");
        System.out.println("Expire Date: " + z.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("----------------------------------------------------------------");
    }
}
