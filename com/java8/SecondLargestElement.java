package com.java8;

import java.util.*;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(2,3,6,7,10,19,21);
		
		
		list1.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
		
		
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		
		//Via Limit function
		list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
		
		System.out.println(list);
		
		// Via Optional and findFirst
//		Optional<Integer> ff = list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst();
		
		System.out.println(ff.get());
	}
}
