package com.java8.streams.practise;

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,13,15,16,18,14,123,1232);
		System.out.println("The even number  using method 1: ");
		List<Integer> res1 = li.stream().filter(i->i%2==0).collect(Collectors.toList());
		res1.forEach(System.out::println);
		
		System.out.println("The even number using method2: ");
		int[] arr = {10,15,8,49,25,98,32};
		Map<Boolean, List<Integer>> res2 = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(res2.get(true));
		
		
		
	}

}
