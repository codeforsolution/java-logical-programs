package com.codeforsolution.logical.java;

/*
Koko loves to eat bananas. There are N piles of bananas, the i-th pile has piles[i] bananas. The guards have gone and will come back in H hours.
Koko can decide her bananas-per-hour eating speed of K. Each hour, she chooses some pile of bananas, and eats K bananas from that pile.
 If the pile has less than K bananas, she eats all of them instead, and won't eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards come back.
Return the minimum integer K such that she can eat all the bananas within H hours.
Input: piles = [30,11,23,4,20], H = 6
Output: 23

Input: piles = [3,6,7,11], H = 8
Output: 4

 */

import java.util.Arrays;

public class MinimumEatingSpeed {

    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int hours = 6;
        System.out.println("minimum banana eating speed "+minimuEatingSpeed(piles, hours));
    }

    private static int minimuEatingSpeed(int[] piles, int hours) {
        //Minimum speed to eat piles
        int start = 1;
        //Maximum speed to eat banana is the maximum bananas in the given piles
        int end = Arrays.stream(piles).max().getAsInt();
        while(start < end){
            int mid = start + (end-start)/2;
            System.out.println("mid value -> "+mid);
            // Check if mid hour is valid
            if((check(piles, mid, hours)) == true){
                //if valid then continue to search the lower speed
                end = mid;
            } else{
                // if bananas not finished in the given hours, then increase the speed
                start = mid +1;
            }
        }
        return end;
    }

    static boolean check(int[] bananas, int mid, int hours){
        int time = 0;
        for(int i = 0; i < bananas.length; i++){
            System.out.println("array value->"+bananas[i]);
            if(bananas[i] % mid != 0){
                System.out.println("if block");
                // in case of odd numbers
                time = time + ((bananas[i] / mid) + 1);
            } else {
                System.out.println("else block");
                time  = time +  (bananas[i] / mid);
            }
            System.out.println("time->"+time);
        }
        System.out.println("Final time is " +time + "and hours is "+hours);
        if(time <= hours){
            return true;
        } else {
            return false;
        }
    }
}
