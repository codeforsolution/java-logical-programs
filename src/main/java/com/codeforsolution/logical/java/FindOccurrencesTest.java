package com.codeforsolution.logical.java;
/**
 * Program to find the occurrences of numbers in array.
 */
public class FindOccurrencesTest {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 5, 4, 2, 1, 3};
        int[] noDuplicate = new int[nums.length];
        int count = -1;
        for(int i = 0; i< nums.length; i++){
            int localCount = 1;
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    localCount ++;
                    noDuplicate[j] = count;
                }
            }
            if(noDuplicate[i] != count){
                noDuplicate[i] = localCount;
            }
        }

        for (int k = 0; k<noDuplicate.length; k++){
            if(noDuplicate[k] != count){
                System.out.println(nums[k] +"    ---->"+ noDuplicate[k]);
            }
        }
    }
}

