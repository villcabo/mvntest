package io.github.villcab.mvntest.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyMain {

    public static void main(String[] args) throws IOException {
        Files.copy(
                Paths.get("/home/ubuntu/Temporal/danger-univida-dev/temp/33c0494b-0888-4601-a523-4de740234596"),
                Paths.get("/home/ubuntu/Temporal/danger-univida-dev/lotto/new")
        );
    }
}
