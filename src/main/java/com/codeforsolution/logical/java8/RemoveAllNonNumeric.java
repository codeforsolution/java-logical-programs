package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveAllNonNumeric {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("abc123", "a12b35c", "12abc4");
        Pattern pattern = Pattern.compile("[^0-9]");

        List<String> numericStr = str.stream().map(x->pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
        System.out.println("Numberic String : "+numericStr);
    }
}
