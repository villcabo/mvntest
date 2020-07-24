package io.github.villcab.mvntest.string;

import java.util.*;

import static ch.lambdaj.Lambda.*;
import static org.apache.commons.lang3.StringUtils.*;

public class ConcatenateString {

    public static void main(String[] args) {
        System.out.println("--------------- WITH DATA ---------------");
        List<Object> keys = new ArrayList<>();
        keys.add("SIMPLE_COMMISSION");
        keys.add("STATIC_COMMISSION");
        keys.add("STATIC_COMMISSION");
        keys.add("DINAMIC_COMMISSION");
        keys.add("DINAMIC_COMMISSION");
        keys.add(null);
        keys.add(null);
        System.out.println(keys);
        System.out.println(concatenateKeysString(keys));
        System.out.println("--------------- WITH EMPTY DATA ---------------");
        keys = new ArrayList<>();
        keys.add(null);
        keys.add(null);
        System.out.println(keys);
        System.out.println(concatenateKeysString(keys));
    }

    public static <E extends Object> String concatenateKeysString(List<E> keys) {
        keys.removeIf(Objects::isNull);
        String stringKeys = "('')";
        if (!keys.isEmpty()) {
            String s = "'" + join(selectDistinct(keys), "', '") + "'";
            if (!s.isEmpty()) stringKeys = String.format("(%s)", s);
        }
        return stringKeys;
    }
}
