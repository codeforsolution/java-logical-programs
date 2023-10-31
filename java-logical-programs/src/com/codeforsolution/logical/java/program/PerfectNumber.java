package com.codeforsolution.logical.java.program;

/**
 * A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
 * For example, take the number 6:
 * Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
 * Therefore, 6 is a perfect
 */
public class PerfectNumber {
    public static void main(String[] args) {
         boolean perfect = isPerfectNumber(123);
        System.out.println(perfect);

    }

    public static boolean isPerfectNumber(int number) {
        int num = 1;
        int sum = 0;
        if (number < 1) {
            return false;
        } else {
            while (num < number) {
                if (number % num == 0){
                    sum += num;
                }
                num++;
            }
        }
        return (sum == number ? true : false);
    }
}
