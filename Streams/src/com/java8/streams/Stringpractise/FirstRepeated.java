package com.java8.streams.Stringpractise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Optional;


public class FirstRepeated {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}

	private static void method1() {
		String input = "Java articles are Awezome";
        // Find the first repeated character
        Optional<Character> res = input.chars()
            .mapToObj(s -> Character.toLowerCase((char) s))  // Convert the codes to lowercase characters
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))  // Group and count occurrences
            .entrySet()  // Convert the map to a set of entries (key-value pairs)
            .stream()
            .filter(entry -> entry.getValue() > 1L)  // Filter repeated characters (count > 1)
            .map(Map.Entry::getKey)  // Get the characters
            .findFirst();  // Get the first repeated character

        // Print the result
        res.ifPresentOrElse(
            c -> System.out.println("First Repeated: " + c),
            () -> System.out.println("No repeated character found")
        );
	}

	private static void method2() {
		String input2 = "The greatest times of era begins now";

		System.out.println("<-------------------The other way of handling is------------>");
	}

	private static void method3() {
		System.out.println("<-------------------The other way of handling is------------>");
		String input3 = "Don't worry you are on the right track";
	}

}
