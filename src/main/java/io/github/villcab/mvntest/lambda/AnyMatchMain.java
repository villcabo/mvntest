package io.github.villcab.mvntest.lambda;

import java.util.Arrays;
import java.util.List;

public class AnyMatchMain {

    public static void main(String[] args) {

        List<String> scopesValidate = Arrays.asList("admin", "portal");

        List<String> scopesClient1 = Arrays.asList("other", "other");
        List<String> scopesClient2 = Arrays.asList("other", "admin");
        List<String> scopesClient3 = Arrays.asList("other", "portal");
        List<String> scopesClient4 = Arrays.asList("admin", "portal");

        System.out.println("Scope to Validate: " + scopesValidate);
        System.out.println("---------------------------------------");
        System.out.println("Validation 1: " + scopesClient1 + ", result: " + scopesValidate.stream().anyMatch(scopesClient1::contains));
        System.out.println("Validation 2: " + scopesClient1 + ", result: " + scopesValidate.stream().anyMatch(scopesClient2::contains));
        System.out.println("Validation 3: " + scopesClient1 + ", result: " + scopesValidate.stream().anyMatch(scopesClient3::contains));
        System.out.println("Validation 4: " + scopesClient1 + ", result: " + scopesValidate.stream().anyMatch(scopesClient4::contains));
    }
}
