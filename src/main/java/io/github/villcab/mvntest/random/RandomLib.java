package io.github.villcab.mvntest.random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomLib {

    public static void main(String[] args) {
        String s1 = RandomStringUtils.randomAlphanumeric(25);
        String s2 = RandomStringUtils.randomAlphanumeric(100);

        System.out.println("ClientId: " + s1);
        System.out.println("SecretKey: " + s2);
    }
}
