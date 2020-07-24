package io.github.villcab.mvntest.string;

public class SplitStringMain {

    public static void main(String[] args) {
        String emails = "bismarck.villca@gmail.com   bvillca@vulcan.bo   ";

        for (String item: emails.split("\\s+")) {
            System.out.println(item);
        }
    }
}
