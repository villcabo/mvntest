package io.github.villcab.mvntest.date;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class IsoDate {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
