package io.github.villcab.mvntest.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateMain {

    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now(ZoneId.of("GMT")).format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }
}
