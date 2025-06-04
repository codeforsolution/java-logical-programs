package com.codeforsolution.logical.interview;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        FunctionalText f = (a, b)-> a+b;
        int add = f.add(5, 10);
 //       System.out.println(add);

        String s1 = "abc";
        s1.concat("t");
 //       System.out.println(s1);

        String m1 = "abc";
        String m2 = "caB";
        boolean isAnagram = IsAnagramTest(m1,m2);
        if(isAnagram){
            System.out.println("Both strings are equals");
        } else {
            System.out.println("Not equals");
        }

    }

    private static boolean IsAnagramTest(String m1, String m2) {
        if(m1.length() != m2.length()) return false;

        char[] ch1 = m1.toCharArray();
        char[] ch2 = m2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);



    }
}
