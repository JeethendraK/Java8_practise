package com.java8.streams.practise;

import java.util.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateForArray {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(20, 20, 30, 12, 32, 42, 11, 13, 16, 10, 102, 104);
		elementswithSetMethod(li);
		System.out.println();
		List<Integer> myList = Arrays.asList(10, 20, 20, 30, 40, 50, 30, 50, 50);
		elementswithpartitioning(myList);
		
		System.out.println();
		List<Integer> myList2 = Arrays.asList(10, 20, 20, 30, 40, 50, 30, 50, 50);
		elementsUsingStreamDistinctFilter(myList2);

	}

	private static void elementsUsingStreamDistinctFilter(List<Integer> myList2) {
		System.out.println("Using Stream Disticnt Filter for Unique");
		myList2.stream()
		.filter(d ->Collections.frequency(myList2, d)==1)
		.forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("Using Stream Disticnt Filter for duplicates");

		myList2.stream()
        .filter(e -> Collections.frequency(myList2, e) > 1)  // Only duplicate elements (appears more than once)
        .distinct()  // Remove duplicates from the result list
		.forEach(i -> System.out.print(i + " "));
	}

	private static void elementswithSetMethod(List<Integer> li) {
		Set<Integer> set = new HashSet();
		System.out.println("Unique values using Set");
		li.stream().filter(n -> set.add(n)).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("Duplicate values using set are :");
		set.clear(); // Clear the set to check for duplicates in the second pass
		li.stream().filter(n -> !set.add(n)).forEach(i -> System.out.print(i + " "));
	}

	public static void elementswithpartitioning(List<Integer> myList) {
		System.out.println("== Using partitioningBy() to Separate Unique and Duplicates==");
		Map<Boolean, List<Integer>> res = myList.stream()
				.collect(Collectors.partitioningBy(s -> Collections.frequency(myList, s) > 1));

		System.out.println("Using partition Duplicates:");
		res.get(true).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("Using partition Unique:");
		res.get(false).forEach(i -> System.out.print(i + " "));
	}

}
