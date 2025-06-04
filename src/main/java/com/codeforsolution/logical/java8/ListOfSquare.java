package com.codeforsolution.logical.java8;
/**
 * Convert list of integers to a list of their squares
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfSquare {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(5, 2, 7 , 8);
        List<Integer> listofSquare = lists.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(listofSquare);
    }
}
