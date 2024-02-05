package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.List;

public class FindSumOfIntegers {
    public static void main(String[] args) {
        //1st method
        List<Integer> numbers = Arrays.asList(12, 20, 25, 32, 50, 40);
        int sum = numbers.stream().mapToInt(e -> e).sum();
        System.out.println(sum);
        
        //2nd method
        Integer sumOfNumbers = numbers.stream().reduce((a, b) -> a + b).get();
        System.out.println(sumOfNumbers);
    }
}
