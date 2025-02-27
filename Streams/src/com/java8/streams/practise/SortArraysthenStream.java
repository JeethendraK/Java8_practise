package com.java8.streams.practise;

import java.util.Arrays;

public class SortArraysthenStream {

	public static void main(String[] args) {
		int[] arr = new int[]{91125, 24389, 68921, 125, 42875, 15625};
		Arrays.parallelSort(arr);
		for(int a: arr) {
			System.out.println(a);
		}
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
	}

}
