package com.java8.streams.practise;

import java.util.*;
import java.util.stream.Collectors;

public class SortValues {
	public static void main(String[] args) {
		System.out.println("Using Natural Order");
		randomgenerate().stream().sorted(Comparator.naturalOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("Using a lambda expression for sorting");
		randomgenerate().stream().sorted((a,b)->a.compareTo(b)).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("Using Comparator.comparing()");
		randomgenerate().stream().sorted(Integer::compare).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("Using Stream.peek() ");
		List<Integer> res = randomgenerate().stream().sorted().peek(System.out::println) // Prints each element as it's processed
		.collect(Collectors.toList());
		res.forEach(i -> System.out.print(i + ", "));
		
		
	}
	public static List<Integer> randomgenerate() {
		List<Integer> li = new ArrayList<>();
		Random r = new Random();
        for (int i = 0; i < 25; i++) {
            li.add(r.nextInt(100)); // Generate a random number between 0 and 99
        }
        return li;
	}
}
