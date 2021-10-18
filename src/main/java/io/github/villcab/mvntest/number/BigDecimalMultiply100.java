package io.github.villcab.mvntest.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMultiply100 {

    public static void main(String[] args) {
        System.out.println(convert(new BigDecimal("10")));
        System.out.println(convert(new BigDecimal("10.1")));
        System.out.println(convert(new BigDecimal("10.00")));
        System.out.println(convert(new BigDecimal("10.000")));
        System.out.println(convert(new BigDecimal("10.0000")));
        System.out.println(convert(new BigDecimal("10.100")));
        System.out.println(convert(new BigDecimal("10.56500")));
        System.out.println(convert(new BigDecimal("10.200")));
    }

    public static BigDecimal convert(BigDecimal value) {
        return value
                .setScale(2, RoundingMode.CEILING)
                .multiply(new BigDecimal("100"))
                .setScale(0, RoundingMode.CEILING);
    }
}
