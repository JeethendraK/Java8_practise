package com.java8.streams.practise;

import java.util.*;

public class FindFirstElement {
	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(10,15,8,49,25,98,98,32,15);
		mylist.stream().filter(i->String.valueOf(i).contains("8"))
		.findFirst().ifPresent(System.out::println);
		
		System.out.println("Using other methods");
		int[] arr = {10,15,8,49,25,98,98,32,15};
		Arrays.stream(arr).boxed().filter(i->String.valueOf(i).contains("9"))
		.findFirst().ifPresent(System.out::println);
	}

}
