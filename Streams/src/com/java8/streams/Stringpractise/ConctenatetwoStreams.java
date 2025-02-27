package com.java8.streams.Stringpractise;

import java.util.*;
import java.util.stream.Stream;

public class ConctenatetwoStreams {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");
		Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.print(s + " f"));

	}

}
