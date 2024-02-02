package com.codeforsolution.logical.java8;

import java.util.stream.IntStream;

public class FindThreeSmallestDistinctNumbers {

	public static void main(String[] args) {
		int[] numbers = {5, 4, 10, 12, 0 ,5, 6, 9, 0, 3, 7};
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);

	}

}
