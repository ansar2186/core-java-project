package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateListWithStringHavingTwoChr {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("ABC","","DS","SS","","DEF","CF","SWE","ASE","AB","YZ");
        List<String> newList=list.stream().filter(x->x.length()>2).collect(Collectors.toList());
        System.out.printf("List %s ",newList);

    }
}
