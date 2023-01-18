package io.github.villcab.mvntest.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class SaveFileMain {

    public static void main(String[] args) throws IOException {

        String path = "/home/ubuntu/Temporal";
        Path pathDir = Paths.get(path);
        if (!Files.exists(pathDir)) {
            Files.createDirectories(pathDir);
            System.out.println("Directory created: " +  pathDir);
        }

        Path pathFile = Paths.get(path, "mifile.txt");
        Files.write(pathFile, Base64.getDecoder().decode("YXJjaGl2byB0ZSBwcnVlYmEK"));
        System.out.println("File saved in: " + pathFile);
    }
}
