package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(50,25,36,48,59));
        arrayIntegers.stream().filter(x-> x > 48).sorted().collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println(sortedList);
		
	}

}
