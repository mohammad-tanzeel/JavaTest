package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str2 = {"1","2", "3", "4", "5", "Test"};
		
		Stream<String> strm =Arrays.stream(str2);
//		List<String> list2 = strm.filter(s->s.matches("[0-9]+")).collect(Collectors.toList());
		List<Integer> list3 = strm.filter(s->s.matches("[0-9]")).map(Integer::valueOf).collect(Collectors.toList());
		
		
//		System.out.println(list2);
		System.out.println(list3);

		String[] str = { "1", "2", "3", "abc", "&" };

		Stream<String> stream = Arrays.stream(str);
		List<String> list = stream.filter(s->s.matches("[0-9]+"))
				.collect(Collectors.toList());
		
		String[] str1 = { "1", "2", "3", "abc" };

		Stream<String> stream1 = Arrays.stream(str);

		List<Integer> list1=stream1.filter(s->s.matches("[0-9]+"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		

		System.out.println(list);
		System.out.println(list1);
	}

}
