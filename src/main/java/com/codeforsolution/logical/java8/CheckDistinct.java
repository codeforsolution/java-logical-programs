package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * In a given array of integers, return true if it contains distinct value
 */
public class CheckDistinct {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 8, 2};
        boolean b = Arrays
                .stream(numbers)
                .mapToObj(e -> e)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().noneMatch(x -> x > 1);
        System.out.println(b);
    }
}
