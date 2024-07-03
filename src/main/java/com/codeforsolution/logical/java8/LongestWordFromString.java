/**
 * @Author codeforsolution
 * Date: 03-07-2024
 *
 * Write a program using java 8 to find the longest word from the string.
 **/
package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordFromString {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        String longestWord = Arrays.asList(str.split(" ")).stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("longest word from String is -> "+ longestWord);

    }
}
