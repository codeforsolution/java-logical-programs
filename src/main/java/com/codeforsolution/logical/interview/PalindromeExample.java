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
        boolean isPalindrome = palindromeCheck(str);
        if(isPalindrome){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

    }

    private static boolean palindromeCheck(String str) {

        char[] ch = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = ch.length-1; i>=0; i--){
            stringBuilder.append(ch[i]);
        }
        if(str.equals(stringBuilder)){
            return true;
        }else{
            return  false;
        }
    }
}
