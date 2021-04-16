package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,4,5,5,6,7,6);
		System.out.println(list);
//		list.stream().distinct().forEach(System.out::println);
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2 = list.stream().distinct().collect(Collectors.toList());
//		list1 = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list2);
		
	}

}
