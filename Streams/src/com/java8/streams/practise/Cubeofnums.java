package com.java8.streams.practise;
import java.util.*;
import java.util.stream.Collectors;
public class Cubeofnums {

	public static void main(String[] args) {
		
		randomgenerate().stream().map(i->i*i*i).forEach(s->System.out.print(s+" "));
		
		System.out.println();
		System.out.println("Priting only even number squres");
		randomgenerate().stream().filter(i->i%2==0).map(i->i*i*i).forEach(s->System.out.print(s+" "));
		
		System.out.println();
		// Printing both even and odd number cubes using map
        System.out.println("Printing both even and odd cubes using partitioningBy:");
        Map<Boolean, List<Integer>> nums = randomgenerate().stream()
                .map(i -> i * i * i) // Cubes of all numbers
                .collect(Collectors.partitioningBy(i -> i % 2 == 0)); // Partition by even/odd

        System.out.println("The even number cubes are: " + nums.get(true));
        System.out.println("The odd number cubes are: " + nums.get(false));
	}
	public static List<Integer> randomgenerate() {
		List<Integer> li = new ArrayList<>();
		Random r = new Random();
        for (int i = 0; i < 15; i++) {
            li.add(r.nextInt(50)); // Generate a random number between 0 and 99
        }		System.out.println();

        System.out.println("Printing original list");

        li.forEach(s->System.out.print(s+" "));
		System.out.println();

        return li;
	}

}
