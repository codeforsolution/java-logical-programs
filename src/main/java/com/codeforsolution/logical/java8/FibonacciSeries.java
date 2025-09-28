package com.codeforsolution.logical.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        List<Integer> fabno = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).map(e -> e[0]).limit(10).collect(Collectors.toList());
       // System.out.println(fabno);

        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    private static int fibo(int n) {
        if(n <=1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}