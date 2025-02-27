package com.java8.streams.Stringpractise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsandCharString {
    public static void main(String[] args) {


        method1();
        method2();
    }

    private static void method2() {
        List<String> names = Arrays.asList("TDD and Acceptance TDD for Java Developers");
        // Counting duplicate strings in the list
        Map<String, Long> method2res = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by exact string
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1) // Filter those that appear more than once
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("String Count (More than once): " + method2res);
    }

    public static void method1() {
        // Counting duplicate characters in the string, excluding spaces and considering lowercase
        List<String> names = Arrays.asList("TDD and Acceptance TDD for Java Developers");
        System.out.println("Original Names List: " + names);
        Map<Character, Long> namesCount = names.stream()
                .flatMap(str -> str.chars() // Convert each string to an IntStream of char codes
                        .mapToObj(c -> (char) c)) // Convert int to Character
                .map(c -> Character.toLowerCase(c)) // Convert to lowercase
                .filter(c -> c != ' ' && Character.isLetterOrDigit(c)) // Exclude spaces and non-alphanumeric characters
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by character
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filter characters that appear more than once
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Collect results in a map

        System.out.println("Character Count (More than once): " + namesCount);
    }
}
