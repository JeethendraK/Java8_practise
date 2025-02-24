package com.java8.streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {

		List<String> li = Arrays.asList("apple", "mango", "banana", "carrot", "dungen");
		Stream<String> sequentialStream = li.stream();
		System.out.println("This is an sequential Streams.....");
		sequentialStream.forEach(System.out::println);
		
		
		Stream<String> parellelStream = li.parallelStream();
		System.out.println("This is an parallel Stream..............");
		parellelStream.forEach(System.out::println);

		// converting Arrays to stream other way
		int[] num = { 5, 6, 7, 2, 1, 7, 7, 9, 20, 22 };
		IntStream streams = Arrays.stream(num);
		System.out.println("Creating with arrays stream ");
		streams.forEach(i -> System.out.println(i));

		// Stream.of() method creates a stream from individual values.
		Stream<String> s = Stream.of("apple", "mango", "banana", "carrot", "dungen");
		System.out.println("Creating with stream ");
		s.forEach(i -> System.out.println(i));
	}

}
