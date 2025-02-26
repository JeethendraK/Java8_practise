package com.java8.streams.Stringpractise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Convert the String into a stream of characters.
Group the characters by their count.
Filter for characters that have a count of 1 (non-repeated).
Find the first such character
 */
public class FirstNonRepeated {

	public static void main(String[] args) {
	    String input = "Java articles are Awezome";
	    Character res = input.chars()
	    		// First convert to Character object and then to lowercase 
	    		.mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
	    		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	    		.entrySet()
	    		.stream()
	    		.filter(e->e.getValue()== 1L)
	    		.map(e -> e.getKey())
	    		.findFirst()
	    		.get();
	    System.out.println(res);
	    
	    String input2 = "The greatest times of era begins now";
	    
	    System.out.println("<-------------------The other way of handling is------------>");
	    Optional<Character> res1 = input2.chars()// Convert the string into a stream of characters' ASCII codes
	    	    .mapToObj(s -> Character.toLowerCase((char) s))  // Convert the codes to lowercase characters
	    	    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))  // Group and count occurrences
	    	    .entrySet()  // Convert the map to a set of entries (key-value pairs)
	            .stream()
	            .filter(e -> e.getValue() == 1L) // Filter non-repeated characters
	            .map(Map.Entry::getKey) // Get the character (key) from the map entry
	            .findFirst(); // Find the first non-repeated character

	    res1.ifPresentOrElse(
	    	    c -> System.out.println("First non-repeating character: " + c),
	    	    () -> System.out.println("No non-repeated character found.")
	    	);

	    
	    System.out.println("<-------------------The other way of handling is------------>");
	    String input3 = "Don't worry you are on the right track";
	    Character firstNonRepeating = input3.chars().mapToObj(c->(char) c)
	    .filter(i->input3.indexOf(i) ==  input3.lastIndexOf(i))
	    .findFirst().orElse(null);
	    
	 // Print the result
        if (firstNonRepeating != null) {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
	}

}
