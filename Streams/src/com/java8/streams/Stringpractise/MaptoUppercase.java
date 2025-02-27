package com.java8.streams.Stringpractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaptoUppercase {

	public static void main(String[] args) {
		String s = "The greatest era begins";
		String[] wordsArray = s.split(" ");
		List<String> res = 
				Arrays.stream(wordsArray).map(String::toUpperCase).collect(Collectors.toList());
		res.forEach(n -> System.out.print(n + " "));
	}

}
