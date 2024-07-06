package com.codeforsolution.logical.interview;
/**
 * @Author codeforsolution
 * Date: 06-07-2024
 * Write a program to check a string is Palindrome or not
 * EY company
 **/
public class PalindromeExample {
    public static void main(String[] args) {

        String str = "abcba";

        char[] ch = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = ch.length-1; i>=0; i--){
            stringBuilder.append(ch[i]);
        }

        if(str.equals(stringBuilder)){
            System.out.println("Given string is Palindrome");
        }else{
            System.out.println("Not a Palindrome string");
        }

    }
}
