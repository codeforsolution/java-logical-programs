/**
 * @Author codeforsolution
 * Date: 03-08-2024
 *
 * Find the numbers which have 1 in second place without converting in string or char array.
 *
 **/
package com.codeforsolution.logical.sda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 8, 21, 2142, 13, 51, 65, 110, 315, 2341);
        List<Integer> numbersList = numbers.stream().filter(num->hasOneInSecondPlace(num)).collect(Collectors.toList());
        System.out.println("Numbers which having 1 in second place-> "+ numbersList);
    }

    private static boolean hasOneInSecondPlace(Integer num) {
        if(num<=20){
            return false;
        }
        while(num > 20){
            if(num>20 && num < 100){
                return (num % 10 ) == 1;
            } else {
                int rem =  (num / 10) ;
                num = num / 10;
            }
        }
        return true;
    }

}
