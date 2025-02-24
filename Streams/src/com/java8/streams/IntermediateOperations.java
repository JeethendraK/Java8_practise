package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class IntermediateOperations {

	public static void main(String[] args) {
		List<String> li = Arrays.asList(
			    "apple", "banana", "cherry", "date", "elderberry",
			    "fig", "grape", "honeydew", "kiwi", "lemon",
			    "mango", "nectarine", "orange", "pear", "plum"
			);
		System.out.println("====Filter method====");
		//filter: operation allows you to exclude elements from the stream based on a condition/ predicate
		li.stream().filter(i-> i.length() >5).forEach(System.out::println);
		
		System.out.println("====Map method====");
		//map:  transforms each element in the stream using a given function. It maps each element to another form
		li.stream().filter(i->i.contains("an")).map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("====Sorted method====");
		//The sorted() operation sorts the elements of the stream. You can either use the natural order or provide a custom comparator.
		li.stream().filter(i->i.endsWith("e")).sorted().forEach(System.out::println);
		
		System.out.println("====using custom1 method====");
		li.stream().sorted((f1,f2)-> Integer.compare(f1.length(), f2.length())).forEach(System.out::println);

		System.out.println("====using custom2 method====");
		li.stream().sorted((f1,f2)-> f1.compareTo(f2)).forEach(System.out::println);

		//The skip() operation skips the first n elements in the stream and returns the remaining elements.
		System.out.println("====using Skip method====");
		li.stream().skip(8).forEach(System.out::println);


	}

}
