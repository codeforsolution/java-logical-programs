/**
 * @Author codeforsolution
 * Date: 11-07-2024
 *
 * Program to find the factorial of a number.
 *
 **/
package com.codeforsolution.logical.java;

public class FindFactorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " +number+" is : "+factorial);
    }

    private static int calculateFactorial(int number) {
        int fact = 1;
        int num = 1;
        while(num <= number){
            fact *= num;
            num++;
        }
        return fact;
    }
}
