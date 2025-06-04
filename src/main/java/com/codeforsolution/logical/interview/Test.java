package com.codeforsolution.logical.interview;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,5, 20, 10, 7};

        Integer limit = IntStream.of(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(limit);

        for(int i = 0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                int temp = 0;
                if(nums[j]>nums[i]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]= temp;
                }
            }
        }

 //       System.out.println(nums[1]);

    }
}
