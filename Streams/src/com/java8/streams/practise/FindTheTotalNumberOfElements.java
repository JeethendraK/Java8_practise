package com.java8.streams.practise;

import java.util.*;

public class FindTheTotalNumberOfElements {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Long totalCount = myList.stream().count();
		System.out.println(totalCount);

		System.out.println("Using Arrays Method");
		int[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		Long totalCounr2 = Arrays.stream(arr).boxed().count();
		System.out.println(totalCounr2);

		/*
		 * arr is an array of primitive int values. Arrays.stream(arr) creates an
		 * IntStream from the primitive int array. boxed() converts each int element
		 * into an Integer object (which is the wrapper class for the primitive int).
		 * count() counts the number of elements in the stream after boxed().
		 */
	}

}
