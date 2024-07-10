/**
 * @Author codeforsolution
 * Date: 11-07-2024
 *
 * Program to check a String is Anagram or not.
 *
 **/
package com.codeforsolution.logical.java;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Presbyterian";
        String str2 = "best in prayer";
        boolean result = isAnagram(str1, str2);
        if(result){
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }

    private static boolean isAnagram(String str1, String str2) {
        char[] charArray1 = str1.replaceAll(" ","").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll(" ", "").toLowerCase().toCharArray();
        if(charArray2.length ==charArray1.length){
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }
        return false;
    }
}
