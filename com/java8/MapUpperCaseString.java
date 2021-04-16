package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapUpperCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> alpha = Arrays.asList("Zain", "b", "c", "d");
        
        List<String> upperlist = 	alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        
        System.out.println(upperlist);
        
        
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        
        List<Integer> num2 = num.stream().map(x->x*2).collect(Collectors.toList());
        
        System.out.println(num2);
	}

}
