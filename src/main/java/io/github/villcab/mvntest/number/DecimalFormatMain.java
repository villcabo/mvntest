package io.github.villcab.mvntest.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatMain {

    private static final DecimalFormat formatter = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.forLanguageTag("es")));
//    private static final DecimalFormat formatter1 = new DecimalFormat("#.##0,00");

    public static void main(String[] args) {
        BigDecimal n1 = new BigDecimal("1600");
        BigDecimal n2 = new BigDecimal("1600.00");
        BigDecimal n3 = new BigDecimal("1600.99");
        BigDecimal n4 = new BigDecimal("1600.00");

        String s1 = formatter.format(n1);
        String s2 = formatter.format(n2);
        String s3 = formatter.format(n3);

//        System.out.println(String.format("Number 1: %s,\t\tFormatted: %s", n1, s1));
//        System.out.println(String.format("Number 2: %s,\tFormatted: %s", n2, s2));
//        System.out.println(String.format("Number 3: %s,\tFormatted: %s", n3, s3));

        System.out.println(String.format("Number 1: %s,\t\tFormatted: %s", n1, DecimalFormat.getNumberInstance(Locale.CANADA).format(n1)));
        System.out.println(String.format("Number 2: %s,\t\tFormatted: %s", n2, formatter.format(n2)));
        System.out.println(String.format("Number 3: %s,\tFormatted: %s", n3, DecimalFormat.getNumberInstance(Locale.forLanguageTag("es")).format(n3)));
        System.out.println(String.format("Number 4: %s,\tFormatted: %s", n3, DecimalFormat.getNumberInstance(Locale.forLanguageTag("es")).format(n4)));
    }
}
