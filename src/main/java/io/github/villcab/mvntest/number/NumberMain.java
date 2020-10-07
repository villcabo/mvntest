package io.github.villcab.mvntest.number;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class NumberMain {

    public static void main(String[] args) {
//        BigDecimal totalPages = new BigDecimal(902610).divide(new BigDecimal(10000), RoundingMode.UP);
//        System.out.println(totalPages);

//        int aa = (int) Math.round((double) 100 / 300000);
//        System.out.println(aa);

        BigDecimal a1 = new BigDecimal(300000);
        BigDecimal a2 = new BigDecimal(300000);


        BigDecimal a  = a1.divide(a2, 0, RoundingMode.UP);
        System.out.println(a);

        BigDecimal b = a.setScale(0, RoundingMode.UP);
        System.out.println(b);

//        System.out.println(new BigDecimal(100 / 15).setScale(2, RoundingMode.HALF_UP));
//        System.out.println(r);

//        System.out.println(Long.MIN_VALUE);
//        System.out.println(new BigDecimal(21234556384577636742.16));
    }
}
