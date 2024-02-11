package com.codeforsolution.logical.java;

/**
 * Find the longest common prefix from the String array.
 * Input:-  {"javaprogramming", "javadeveloper", "javaprogrammer", "javaarchitect"}
 *
 * Output:- java
 */
public class FindLongestPrefix {

    public static void main(String[] args) {
        String[] arr = {"javaprogramming", "javadeveloper", "javaprogrammer", "javaarchitect"};
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
