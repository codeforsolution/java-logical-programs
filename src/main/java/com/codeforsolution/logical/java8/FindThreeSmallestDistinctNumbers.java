package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindThreeSmallestDistinctNumbers {

	public static void main(String[] args) {
		int[] numbers = {5, 4, 10, 12, 0 ,5, 6, 9, 0, 3, 7};
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);

		List<Integer> listNumbers = Arrays.asList(4,1, 3,56,7,12,6,34,50,121, 343,320);
		List<Integer> limit = listNumbers.stream().distinct().sorted().limit(3).toList();
		System.out.println(limit);

	}

}
