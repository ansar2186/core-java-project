package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "", "bcd", "", "fgh", "", "Lmk");
        //count string whose is empty
        //long count = list.stream().filter(x -> x.isEmpty()>2).count();

        //count string whose lenth is more than 2
        //long count = list.stream().filter(x -> x.length()>2).count();
         //count string whose start with a
        long count = list.stream().filter(x -> x.startsWith("a")).count();

        System.out.printf("List %s has %d empty strings %n", list, count);
    }
}
