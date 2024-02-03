/*
* Write a program to count the number of occurrences from the string.
 */
package com.codeforsolution.logical.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurrencesFromString {
    public static void main(String[] args) {

        String str = "Hello Everyone, This is from codeforsolution";
        String str1 =str.replaceAll("[^a-zA-Z]+", "");
        System.out.println(str1);
        Map<Character,Long> strOccurrences1 = str.replaceAll("[^a-zA-Z]+", "").codePoints().mapToObj(e->(char)e).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(strOccurrences1);

        Map<Character,Long> strOccurrences2 = str.replaceAll("[^a-zA-Z]+", "").codePoints().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(strOccurrences2);

    }
}
