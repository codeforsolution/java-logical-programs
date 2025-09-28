package com.codeforsolution.logical.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given the string[] group the string based on the middle character
 */
public class GroupByMiddleChar {
    public static void main(String[] args) {
        String[] str = {"ewe", "jhj", "jji", "kwk", "aha"};
        Map<String, List<String>> collect = Stream.of(str).collect(Collectors.groupingBy(e -> e.toString().substring(1, 2)));
        System.out.println(collect);
    }
}
