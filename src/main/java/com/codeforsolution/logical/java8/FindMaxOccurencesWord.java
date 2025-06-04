package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaxOccurencesWord {
    public static void main(String[] args) {
        String str = "START MAN MID MAN goodbye mAN welcome Man Hi There maN BYE bye MaN";
        String mostOccurences = Arrays.stream(str.toLowerCase().split(" "))
                .collect(Collectors.groupingByConcurrent(word -> word, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
        System.out.println(mostOccurences);
    }
}
