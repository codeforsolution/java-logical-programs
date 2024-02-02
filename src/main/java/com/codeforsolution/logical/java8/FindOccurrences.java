package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurrences {

	public static void main(String[] args) {
		List<String> lists = Arrays.asList("apple", "banana", "apple", "grapes", "banana", "orange", "apple");
		Map<String, Long> listWithOccurrences = lists.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(listWithOccurrences);
	}
}