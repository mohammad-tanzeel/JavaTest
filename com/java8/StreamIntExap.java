package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntExap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"1","2","3","abc"};
		
		Stream<String> strram1 = Arrays.stream(str);
		
		List<Integer> list = strram1.filter(x->x.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
