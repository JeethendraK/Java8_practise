package com.java8.streams.practise;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = new int[] {
				15, 17, 21, 22, 28, 30, 32,30
		};
		System.out.println("Approach 1");
		List<Integer> li = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> s = new HashSet<Integer>(li);
		if(s.size()==li.size()) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
		System.out.println("Approach 2:");
		Set<Integer> setData = new HashSet<>();
		boolean res = Arrays.stream(nums).anyMatch(num -> !setData.add(num));
		System.out.println(res);
		
	}

}
