package io.github.villcab.mvntest.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter fdatetime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {

//        Integer month = 3;
//        Integer year = 2018;
//
//        LocalDate initial = LocalDate.of(year, month, 1);
//        LocalDate start = initial.withDayOfMonth(1);
//        LocalDate end = initial.withDayOfMonth(initial.lengthOfMonth());
//
//        ZonedDateTime startDate = start.atStartOfDay(ZoneId.systemDefault());
//        ZonedDateTime endDate = end.atStartOfDay(ZoneId.systemDefault()).withHour(23).withMinute(59).withSecond(59);
//
//        System.out.println("StartDate : " + startDate.format(fdatetime));
//        System.out.println("EndDate   : " + endDate.format(fdatetime));

        LocalDate start = LocalDate.of(2018, 9, 10);
        LocalDate end = LocalDate.of(2018, 12, 31);

        System.out.println(validateRangeDate(start, end, LocalDate.of(2018, 8, 10)));
        System.out.println(validateRangeDate(start, end, LocalDate.of(2018, 11, 1)));
        System.out.println(validateRangeDate(start, end, LocalDate.of(2018, 11, 15)));
        System.out.println(validateRangeDate(start, end, LocalDate.of(2018, 11, 10)));
        System.out.println(validateRangeDate(start, end, LocalDate.of(2018, 11, 16)));
        System.out.println(validateRangeDate(start, end, LocalDate.of(2018, 10, 30)));
    }

    public static boolean validateRangeDate(LocalDate init, LocalDate end, LocalDate data) {
        return data.compareTo(init) >= 0 && data.compareTo(end) <= 0;
    }
}
