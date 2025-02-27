package com.java8.streams.Stringpractise;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElementString {

	public static void main(String[] args) {
		String s = "Spring In action";
		String[] wordsArray = s.split(" ");
		Map<String, Long> map = Arrays.stream(wordsArray)
		.map(i->String.valueOf(i).toLowerCase())
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

}
