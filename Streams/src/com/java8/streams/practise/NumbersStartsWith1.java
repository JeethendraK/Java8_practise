package com.java8.streams.practise;

import java.util.*;
import java.util.stream.Collectors;

public class NumbersStartsWith1 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(20,30,12,32,42,11,13,16,10,102,104);
		List<String> res1 = usingFormat(li);
		System.out.println("Using format");
		res1.forEach(System.out::println);
		
		System.out.println("Using string");
		List<String> res2 = usingString(li);
		res2.forEach(System.out::println);

		System.out.println("Using toString method");
		List<String> res3 = usingtoString(li);
		res3.forEach(System.out::println);

		System.out.println("Using StringBuilder method");
		List<String> res4 = usingStringbuilder(li);
		res4.forEach(System.out::println);
		
		System.out.println("Using ValueOf method");
		List<String> res5 = usingvalueOf(li);
		res5.forEach(System.out::println);
		
	}
	public static List<String> usingFormat(List<Integer> li){
		return li.stream().map(i->String.format("%d", i))
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
	}
	
	public static List<String> usingString(List<Integer> li){
		return li.stream().map(s->s+" ").
				filter(s->s.contains("2")).
				collect(Collectors.toList());
		
	}
	public static List<String> usingtoString(List<Integer> li){
	    return li.stream()
                .map(i -> Integer.toString(i))           // Convert integer to String using Integer.toString
                .filter(s -> s.contains("0"))     // Filter strings containing the digit "0"
                .collect(Collectors.toList());  // Collect the result into a List<String>
	}
   
	public static List<String> usingStringbuilder(List<Integer> li){
		return li.stream().map(i->new StringBuilder().append(i).toString())
				.filter(i->i.length()>2).collect(Collectors.toList());
	}

	public static List<String> usingvalueOf(List<Integer> li){
		return li.stream().map(i-> String.valueOf(i)).filter(i->i.substring(1).length()>1)
				.collect(Collectors.toList());
	}

}
