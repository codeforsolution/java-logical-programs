package com.codeforsolution.logical.java8;

/**
 *
 * sum of every digit of a number
 *
 */
public class AddEveryDigitOfANumber {

    public static void main(String[] args) {
        int number = 123485;
        int sum = String.valueOf(number).chars().map(c-> c - '0').sum();
        System.out.println("Sum "+ sum);
    }
}
