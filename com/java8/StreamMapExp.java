package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(3,5,7,9);
		list.stream().map(n -> n*3).forEach(System.out::println);
		
		List<String> list1 = new ArrayList<String>();
		Stream<String> stream = list1.stream();

		Stream<String> streamMapped = stream.map((value) -> value.toUpperCase());
		
		//System.out.println(streamMapped);

	}

}
