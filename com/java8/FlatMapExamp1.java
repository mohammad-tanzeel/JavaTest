package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExamp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str1 = new String[][] {{"a","b"},{"c","d"},{"e","f"}};
		
		Stream<String[]> stream1 = Arrays.stream(str1);
		System.out.println(stream1);
		
		List<String[]> result = stream1.filter(x -> !x.equals("a")).collect(Collectors.toList());
		
		result.forEach(System.out::println);

		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		  List<String> collect = Stream.of(array)     // Stream<String[]>
		          .flatMap(Stream::of)                // Stream<String>
		          .filter(x -> !"a".equals(x))        // filter out the a
		          .collect(Collectors.toList());      // return a List

		  collect.forEach(System.out::println);

//		System.out.println(result);
	}

}
