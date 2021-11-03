package io.github.villcab.mvntest.string;

import java.util.*;

public class EnumetationStringMain {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        Enumeration<String> enm = Collections.enumeration(ls);

        System.out.println(Collections.list(enm));

        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}
