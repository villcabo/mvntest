package io.github.villcab.mvntest.nivelar;

import com.google.gson.Gson;
import io.github.villcab.mvntest.nivelar.model.Coordinate;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NivelarMain {

    public static void main(String[] args) {
        NivelarMain nivelarMain = new NivelarMain();
        nivelarMain.nivelar();
    }

    public void nivelar() {
        Scanner scanner = new Scanner(this.getClass().getResourceAsStream("/coordinates.txt"));
        List<Coordinate> coordinates = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("0|0")) {
                coordinates.add(new Coordinate(null));
            } else if (line.equalsIgnoreCase("0.0|0.0")) {
                coordinates.add(new Coordinate(null));
            } else if (line.equalsIgnoreCase("0.00|0.00")) {
                coordinates.add(new Coordinate(null));
            } else {
                coordinates.add(new Coordinate(line));
            }

        }

        try {
            File f = new File("/home/ubuntu/Temporal/newformat.txt");
            f.createNewFile();
            PrintWriter out = new PrintWriter(f, "UTF-8");
            String breakline = "";
            Gson gson = new Gson();
            for (Coordinate coordinate : coordinates) {
                out.print(breakline + gson.toJson(coordinate));
                breakline = "\n";
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
