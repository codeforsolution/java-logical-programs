package com.codeforsolution.logical.java;

public class ReverseString {
    public static void main(String[] args) {
        String str ="Amazon";
        String reverseString = getReverseString(str);
        System.out.println(reverseString);
    }

    private static String getReverseString(String str) {
        if(str.isEmpty()) return "";
        return getReverseString(str.substring(1))+ str.charAt(0);
    }
}
