/**
 * @Author codeforsolution
 * Write a program to check a number is palindrome or not
 * Date: 30-03-2024
 **/
package com.codeforsolution.logical.java;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        int number, reverse=0, tempNumber, remainder;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        s.close();
        tempNumber = number;
        while (number != 0){
         /*  remainder = number % 10;
           reverse = reverse * 10 + remainder;*/
            reverse = number % 10 +  reverse * 10;
           number = number / 10;
        }

        if(tempNumber == reverse){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

    }
}
