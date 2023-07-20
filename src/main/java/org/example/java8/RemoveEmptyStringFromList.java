package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStringFromList {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("ABC","","DCS","SSA","","","CDF","SWE","");
        System.out.println("Before remove empty string : " +list);
        List<String> newList=list.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        System.out.println("After remove empty string: " +newList);
    }
}
