package com.codeforsolution.logical.java8;

/**
 * @Author codeforsolution
 * Date: 25-07-2024
 * Write a program to Convert String to Hashmap using streams.
 * Input:-
 * String str = "orange:1;apple:2;orange:5;pears:10"
 *Output:-
 * orange - 6
 * apple - 2
 * pears - 10
 **/
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToHashMap {

    public static void main(String[] args) {
        String str = "orange:1;apple:2;orange:5;pears:10";
        Map<String, Integer> strToMap =
                Arrays.stream(str.split(";"))
                        .map(e->e.split(":"))
                            .collect(Collectors.groupingBy(e->e[0],Collectors.summingInt(e->Integer.parseInt(e[1]))));
        strToMap.forEach((k,v)-> System.out.println(k +" - "+ v));
    }
}
