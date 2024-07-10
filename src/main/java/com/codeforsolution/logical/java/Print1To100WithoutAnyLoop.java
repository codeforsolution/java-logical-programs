/**
 * @Author codeforsolution
 * Date: 11-07-2024
 *
 * Print 1 to 100 without any loop
 *
 **/
package com.codeforsolution.logical.java;

public class Print1To100WithoutAnyLoop {

    public static void main(String[] args) {
        //Using recursion
        int number = 100;
       displayNumbers(number);

        //Using BitSet
        String set = new java.util.BitSet() {{
            set(1, 100 + 1);
        }}.toString();
        System.out.append(set, 1, set.length() - 1);

    }

    private static void displayNumbers(int number) {

        if(number>1){
            displayNumbers(number -1);
        }
        System.out.println(number + " ");
    }
}
