package com.java8.streams.practise;

import java.util.*;

public class SortDescending {

	public static void main(String[] args) {
        System.out.println("Using Collections.reverseOrder:");
        randomGenerate().stream()
                        .sorted(Collections.reverseOrder()) // Sort in descending order
                        .forEach(i -> System.out.print(i + " ")); // Print sorted values
        
        System.out.println();
        System.out.println("Using a lambda expression for sorting");
        randomGenerate().stream().sorted((a,b)->b.compareTo(a)).forEach(i -> System.out.print(i + " "));
        

        System.out.println();
        System.out.println("Using Comparator.comparing()");
        randomGenerate().stream().sorted((a,b)-> Integer.compare(b, a)).forEach(i -> System.out.print(i + " "));
    }

    // Method to generate a random list of integers
    public static List<Integer> randomGenerate() {
        List<Integer> li = new ArrayList<>();
        Random r = new Random();
        
        // Generate 15 random numbers and add them to the list
        for (int i = 0; i < 15; i++) {	
            li.add(r.nextInt(100));  // Random number between 0 and 99
        }
        
        // Print the generated list
        System.out.println("The Legend List:");
        li.forEach(i -> System.out.print(i + " "));  // Print each number in the list
        System.out.println();  // Add a newline after the list
        
        return li;  // Return the generated list
    }

}
