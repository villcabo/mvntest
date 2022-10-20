package io.github.villcab.mvntest.date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodeChanllange {

    public static void main(String[] args) {

        int a [] = {1,2,3,4,3};

        int result [] = new int[2];

        List<Integer> prev = new ArrayList<>();
        int aux = 1;
        for (int i : a) {
            prev.add(i);
            if (prev.stream().filter(x -> x.equals(i)).count() > 1) {
                result[0]=aux;
            }

            if (aux != i) {
                result[1]=i;
            }
            aux++;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
