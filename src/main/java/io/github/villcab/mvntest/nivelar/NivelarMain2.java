package io.github.villcab.mvntest.nivelar;

import com.google.gson.Gson;
import io.github.villcab.mvntest.nivelar.model.Coordinate;
import io.github.villcab.mvntest.nivelar.model.Tupla;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class NivelarMain2 {

    public static void main(String[] args) {
        NivelarMain2 nivelarMain = new NivelarMain2();
        nivelarMain.nivelar();
    }

    public void nivelar() {
//        Scanner scanner = new Scanner(this.getClass().getResourceAsStream("/coordinates.txt"));
        Scanner scanner = new Scanner(this.getClass().getResourceAsStream("/new-coor.txt"));
        List<Tupla> tuplas = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split("\\t");
            String id = split[0];
            String coora = "";
            if (split.length > 1) {
                coora = split[1];
            }

            if (coora.equalsIgnoreCase("0|0") || coora.equalsIgnoreCase("0.0|0.0") || coora.equalsIgnoreCase("0.00|0.00")) {
                tuplas.add(new Tupla(id, new Coordinate(null)));
            } else {
                tuplas.add(new Tupla(id, new Coordinate(coora)));
            }
        }

        try {
            File f = new File("/home/ubuntu/Temporal/newformat-sql.txt");
            f.createNewFile();
            PrintWriter out = new PrintWriter(f, "UTF-8");
            String breakline = "";
            Gson gson = new Gson();
            for (Tupla tupla : tuplas) {
                String query = String.format("UPDATE soat set coordinates = '%s' where id = %s;", gson.toJson(tupla.getCoordinate()), tupla.getId());
                out.print(breakline + query);
                breakline = "\n";
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
