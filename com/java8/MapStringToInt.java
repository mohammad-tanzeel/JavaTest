package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> numberlist = Arrays.asList("1","2","5","8","9","10");
		
		List<Integer> evennumber = numberlist.stream().map(s->Integer.valueOf(s)).filter(x->x%2==0).collect(Collectors.toList());
		
		System.out.println(evennumber);
	}

}
