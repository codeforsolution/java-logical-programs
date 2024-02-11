package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestPrefix {

    public static void main(String[] args) {
        List<String> listValue = Arrays.asList("javaprogramming", "javadeveloper", "javaprogrammer", "javaarchitect");
        String prefix = "javaprogramming";
        Optional<String> commanPrefix=  listValue.stream().sorted(Comparator.comparingInt(String::length).reversed())
                .filter(prefix::startsWith)
                .findFirst();
        System.out.println("common --> "+commanPrefix.get());
        String[] arr = {"javaprogramming", "javadeveloper", "javaprogrammer", "javaarchitect"};//{"giorgi", "gio", "gior", "giorg", "gior"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] arr) {
        if(arr.length==0) return "";
        String prefix = arr[0];
        for(int i = 1;i<arr.length; i++){

           while(arr[i].indexOf(prefix) !=0){
                 prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.equals("")){
                    return "";
                }
            }

        }
        return prefix;
    }
}
