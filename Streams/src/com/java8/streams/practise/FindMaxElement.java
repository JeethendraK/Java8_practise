package com.java8.streams.practise;

import java.util.*;

public class FindMaxElement {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		Random r =  new Random();
		for(int i=0; i<=25; i++) {
			myList.add(r.nextInt(100));
		}
		for(int li: myList) {
			System.out.print(li+" ");
		}
		System.out.println();
		
		int maxLen = myList.stream().max(Integer::compare).get();
		System.out.println("The maximum value is : "+maxLen);
		
		System.out.println("Using an Arrays Concepts");
		int[] arr = {10,15,8,49,25,98,98,32,15};
		int maxlenArr = Arrays.stream(arr).boxed().max((a,b)->Integer.compare(a, b)).get();
		System.out.println("The maxnumber using Arrays concept: "+ maxlenArr);
		System.out.println("++++++++OR++++++++");
		int maxlenArr2 = Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get();
		System.out.println("The maxnumber using method 2 Arrays concept: "+ maxlenArr2);
	}

}
