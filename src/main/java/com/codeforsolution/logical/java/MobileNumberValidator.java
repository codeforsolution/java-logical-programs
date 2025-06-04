package com.codeforsolution.logical.java;

import java.util.Scanner;

/**
 *
 */
public class MobileNumberValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a mobile number to validate");
        String mobilenumber = sc.nextLine();

        validateMobileNumber(mobilenumber);

    }

    private static void validateMobileNumber(String mobilenumber) {
        try {
            if (mobilenumber.length() > 10)
                throw new IllegalArgumentException("You have entered number have more than 10 digit");
            else if (mobilenumber.length() < 10) {
                throw new IllegalArgumentException("You have entered number less than 10 digit");
            } else {
                //Using for loop
                for(int i = 0; i<mobilenumber.length()-1; i++){
                    if(!Character.isDigit(mobilenumber.charAt(i))){
                        throw new IllegalArgumentException("You have entered special character for mobile");
                    }
                }
                System.out.println("Mobile number is valid");
                //using pattern
                if (!mobilenumber.matches("\\d{10}")) {
                    throw new IllegalArgumentException("You have entered special character for mobile");
                } else{
                    System.out.println("Mobile number is valid");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName() +": "+e.getLocalizedMessage());
        }
    }
}
