package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String args[]) {

        List<Integer> myList = Arrays.asList(10, 25, 8, 49, 15, 98, 32, 12, 20);
        myList.stream().map(e -> e + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
        //Or
        myList.stream().map(e -> e.toString()).filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
