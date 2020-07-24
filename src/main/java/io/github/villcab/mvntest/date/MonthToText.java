package io.github.villcab.mvntest.date;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthToText {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(StringUtils.capitalize(localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES"))));
    }
}
