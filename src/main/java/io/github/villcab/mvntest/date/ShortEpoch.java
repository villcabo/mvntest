package io.github.villcab.mvntest.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ShortEpoch {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
//        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
//        calendar.add(Calendar.HOUR, 24);
//        long shortExpirationEpochDate = calendar.getTime().getTime() / 1000L;
//        System.out.println("Short expiration epoch: " + shortExpirationEpochDate);
//
//        Calendar calendar1 = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
//        calendar1.setTimeInMillis(shortExpirationEpochDate * 1000L);
//        System.out.println("Date: " + calendar1.getTime());

        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.add(Calendar.HOUR, 24);
//        Long expirationDate = calendar.getTime().getTime() / 1000L;
        System.out.println("Time in milliseconds: " + calendar.getTimeInMillis() / 1000L);
        System.out.println("Time in milliseconds: " + calendar.getTime().getTime());
    }
}
