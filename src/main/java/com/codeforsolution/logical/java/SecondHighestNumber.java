package com.codeforsolution.logical.java;

import java.util.Arrays;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] arr ={1,2,5,6,3,2};
        //Using for loop
        int secHighest = getSecondHighestNumber(arr);
        System.out.println("Second largest number -> "+secHighest);
        //Using Array sort method
        Arrays.sort(arr);
        System.out.println("Second largest num -> "+arr[arr.length-2]);
    }

    private static int getSecondHighestNumber(int[] arr) {
        int temp;
        for(int i= 0; i<arr.length;i++){
            for(int j= i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-2];
    }
}
