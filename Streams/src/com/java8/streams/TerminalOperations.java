package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew",
				"kiwi", "lemon", "mango", "nectarine", "orange", "pear", "plum");

		// 1. Purpose: Converts the stream into a different collection (e.g., a List,
		// Set, Map).
		// Commonly used with: Collectors.toList(), Collectors.toSet(),
		// Collectors.toMap(), etc
		System.out.println("=======collect-=========");
		List<String> fruitsStartingWithA = li.stream().filter(fruit -> fruit.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println("Fruits starting with 'a': " + fruitsStartingWithA);

		// 2. Reduce() : Purpose: Performs a reduction on the elements of the stream
		// using an associative accumulation function, and returns an Optional.
		// Commonly used with: Aggregating results (e.g., sum, multiplication, etc.)
		System.out.println("=======Reduce-=========");
		String concatnated = li.stream().reduce("", (res, fruit) -> res + fruit + " ");
		System.out.println(concatnated);

		// 3. min() / max()
		// Purpose: Finds the minimum or maximum element in the stream based on a
		// comparator.
		System.out.println("=======Min-=========");
		Optional<String> minfruit = li.stream().min(String::compareTo);
		System.out.println("Lexicographically smallest fruit: " + minfruit.orElse("None"));

		System.out.println("=======max-=========");
		Optional<String> maxfruit = li.stream().max(String::compareTo);
		System.out.println(" Lexicographically smallest fruit: " + maxfruit.orElse("None"));

		// anyMatch()
		// Purpose: Checks if any element in the stream satisfies the given predicate.
		System.out.println("=======anyMatch-=========");
		boolean anyFruitStartsWithM = li.stream().anyMatch(i -> i.contains("ra"));
		System.out.println("Any fruit contains with 'ra': " + anyFruitStartsWithM);

		// allMatch()
		// Purpose: Checks if all elements in the stream satisfy the given predicate.
		System.out.println("=======allMatch-=========");
		boolean allHaveMoreThan4Letters = li.stream().allMatch(fru -> fru.length() > 7);
		System.out.println("All fruits have more than 4 letters: " + allHaveMoreThan4Letters);

		// noneMatch()
		// Purpose: Checks if no elements in the stream satisfy the given predicate.
		System.out.println("=======noneMatch-=========");
		boolean noneStartsWithZ = li.stream().noneMatch(fruit -> fruit.startsWith("z"));
		System.out.println("No fruit starts with 'z': " + noneStartsWithZ);
		
		// findFirst()
		// Purpose: Returns the first element of the stream, if present, wrapped in an
		// Optional.
		System.out.println("=======findFirst-=========");
		Optional<String> res= li.stream().filter(i->i.contains("r") && i.length()>6).findFirst();
		res.ifPresent(System.out::println);
		
		/*
		 * findAny() Purpose: Returns any element of the stream, if present, wrapped in
		 * an Optional. It is generally used when you don't care about the order of the
		 * elements.
		 */
		System.out.println("=======findAny-=========");
		Optional<String> findAnyWithSubstring = li.stream()
			    .filter(i -> i.length() > 4 && i.substring(4).contains("e")) // Check if substring from index 4 contains "e"
			    .findAny();

			findAnyWithSubstring.ifPresent(System.out::println);

		/*
		 * toArray() Purpose: Converts the stream into an array.
		 */

		System.out.println("=======toArray()-=========");
		String[] arr = li.stream().toArray(String[]::new);
		System.out.println("Fruits array: "+String.join(" ", arr));
		

	}

}
