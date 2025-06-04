package com.codeforsolution.logical.java8;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class FindFirstRepeattedLetter {

    public static void main(String[] args) {
        String str ="Feel the need";
        Set<Integer> seen = new HashSet<>();
        OptionalInt asInt = str.chars().filter(e -> !seen.add(e)).findFirst();
        System.out.println("First repeatted character ->"+(asInt.isPresent()?(char) asInt.getAsInt(): ""));
    }

}
