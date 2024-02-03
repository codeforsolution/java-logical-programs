package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximum {
    public static void main(String[] args) {

        int[] numbers = {5, 4, 10, 12, 0 ,5, 6, 9, 0, 3, 7};
        int maxNum = Arrays.stream(numbers).max().getAsInt();
        System.out.println(maxNum);

        List<Integer> listNumbers = Arrays.asList(4,1, 3,56,7,12,6,34,50,121, 343,320);
        Integer max = listNumbers.stream().mapToInt(e->e).max().getAsInt();
        System.out.println(max);

        Integer maxValue = listNumbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxValue);

    }
}
