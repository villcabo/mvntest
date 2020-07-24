package io.github.villcab.mvntest.random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomLib {

    public static void main(String[] args) {
        String s1 = RandomStringUtils.randomAscii(8);
        String s2 = RandomStringUtils.randomAlphanumeric(8);

        System.out.println(s1);
        System.out.println(s2);
    }
}
