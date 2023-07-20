package org.example.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        List<String> newList = Collections.singletonList(G7.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", ")));

        System.out.printf("List %s  Upper Case List %s ", G7, newList);

    }
}
