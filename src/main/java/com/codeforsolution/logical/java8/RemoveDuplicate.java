package com.codeforsolution.logical.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String string = "programming";

		//1st Approach
		String str = Arrays.asList(string.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining());
		System.out.println(str);

		//2nd Approach
		String out = string.chars()
				.mapToObj(e-> Character.valueOf((char)e))
				.distinct().map(Objects::toString)
				.collect(Collectors.joining());
		System.out.println(out);

		// 3rd Approach if order not matters
		string.chars()
				.mapToObj(e->(char)e)
				.collect(Collectors.toSet())
				.forEach(System.out::print);
		System.out.println("\n***********************************************************************");
		// 4th Approach if order not matters
		Arrays.asList(string.split(""))
				.stream()
				.collect(Collectors.toSet())
				.forEach(System.out::print);
		System.out.println("\n***********************************************************************");
		//5th Approach
		String remDup = Arrays
				.asList(string.split(""))
				.stream()
				.distinct()
				.toList().stream().collect(Collectors.joining());
		System.out.println(remDup);

		//6th Approach

		String remDupl =  string.chars().distinct().collect(
				StringBuilder::new,
				StringBuilder::appendCodePoint,
				StringBuilder::append
		).toString();

		System.out.println(remDupl);

		// 7th Approach
		System.out.println(removeDuplicate(string));
	}

	private static String removeDuplicate(String string) {
		String str = "";
		char[] chars = string.toCharArray();
		List<Character>  characterList = new ArrayList<>();
		for(Character character: characterList){
			characterList.add(character);
		}
		List<Character> remDuplist = characterList.stream().distinct().toList();
		for(char ch:remDuplist){
			str +=ch;
		}
		return str;
	}
}