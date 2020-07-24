package io.github.villcab.mvntest.date;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static void main(String[] args) {
        LocalDate dateTime = LocalDate.now();

        DateTimeFormatter literalES = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", Locale.forLanguageTag("es"));

        DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("d");
        DateTimeFormatter formatterMonth = DateTimeFormatter.ofPattern("MMMM", Locale.forLanguageTag("es"));
        DateTimeFormatter formatterYear = DateTimeFormatter.ofPattern("yyyy");
//        System.out.println(String.format("%s de %s de %s", dateTime.format(formatterDay), StringUtils.capitalize(dateTime.format(formatterMonth)), dateTime.format(formatterYear)));
        System.out.println(dateTime.format(literalES));
    }
}
