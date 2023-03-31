package io.github.villcab.mvntest.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class EpochToDate {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        long epoch = Instant.now().toEpochMilli();
        System.out.println("epoch millis: " + epoch);

        long epoch1 = new Date().getTime();
        System.out.println("epoch millis: " + epoch1);

        long epoch2 = ZonedDateTime.now().toEpochSecond();
        System.out.println("epoch millis: " + epoch2);

        long epochDate = 1662145947L * 1000L;
        System.out.println("epoch millis: " + epochDate);

        Calendar calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone(ZoneId.systemDefault()));
        calendar.setTimeInMillis(epochDate);
        System.out.println("converted: " + dateFormat.format(calendar.getTime()));
    }
}
