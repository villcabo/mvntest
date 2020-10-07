package io.github.villcab.mvntest.date;

import java.time.LocalDate;

public class DateBetweenMain {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, 3, 3).minusDays(1);
        LocalDate end = LocalDate.of(2020, 3, 20).plusDays(1);
        LocalDate current = LocalDate.of(2020, 3, 1);

        if (!current.isAfter(start) || !current.isBefore(end))
            System.out.println("No esta dentro del rango");
        else
            System.out.println("Esta dentro del rango");
    }
}
