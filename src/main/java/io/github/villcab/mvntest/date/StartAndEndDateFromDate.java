package io.github.villcab.mvntest.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class StartAndEndDateFromDate {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
//        LocalDate currentDate = LocalDate.of(2019, 11, 1);

        LocalDate start = currentDate.withDayOfMonth(1);
        LocalDate end = currentDate.withDayOfMonth(currentDate.lengthOfMonth());

        ZonedDateTime startDate = start.atStartOfDay(ZoneId.systemDefault());
        ZonedDateTime endDate = end.atStartOfDay(ZoneId.systemDefault()).withHour(23).withMinute(59).withSecond(59);

        System.out.println("StarDate: " + startDate.format(DATE_TIME_FORMATTER));
        System.out.println("EndDate:  " + endDate.format(DATE_TIME_FORMATTER));

//        System.out.println(LocalDate.now().minusDays(1).atStartOfDay(ZoneId.systemDefault()).format(DATE_TIME_FORMATTER));

        ZonedDateTime endOfDay = LocalTime.MAX.atDate(LocalDate.now()).atZone(ZoneId.systemDefault());;
        System.out.println(endOfDay.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

    }
}
