package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingListExample {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        // Sort List of integer in ascending order
        // method 1
        List<Integer> ascendingOrder1 = numList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorted in natural sorting order1 ->" + ascendingOrder1);
        //Method 2
        List<Integer> ascendingOrder2 = numList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted in natural sorting order2 ->" + ascendingOrder2);

        int[] numArray = {12, 25, 18, 17, 34, 96, 75};
        List<Integer> collect = IntStream.of(numArray).mapToObj(e -> e).sorted().collect(Collectors.toList());
        System.out.println("Sort integer for  int[] -> "+collect);
        // Sort List of integer in descending order
        List<Integer> descendingOrder1 = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted in descending sorting order -> " + descendingOrder1);


    }
}
