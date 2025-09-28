package com.codeforsolution.logical.java;

import java.util.Arrays;

public class EqulsCheckOfArrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5,6};
        boolean status = Arrays.equals(a, b);
        if(status){
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are not equals");
        }
    }
}
