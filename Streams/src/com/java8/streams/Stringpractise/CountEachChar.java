package com.java8.streams.Stringpractise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachChar {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("TDD and Acceptance TDD for Java Developers");

		System.out.println("Original Names List: " + names);

		// Count occurrences of each character in the list of strings
		Map<Character, Long> charCountMap = names.stream() // Stream the List<String>
				.flatMapToInt(String::chars) // Convert each string to a stream of char values (int)
				.mapToObj(c -> (char) c) // Convert int to Character
				//mapToObj(c->Character.toLowercase(char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Count each character

		
		
		
		// Print the result
		System.out.println("Character Count: " + charCountMap);
	}

}
