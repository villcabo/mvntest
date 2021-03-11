package io.github.villcab.mvntest.string;

import java.util.UUID;

public class UUIDMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid.substring(0, uuid.indexOf("-")));
        }
    }
}
