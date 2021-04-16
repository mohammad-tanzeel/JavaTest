package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilterExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> list = Arrays.asList("geeks", "gfg", "g", 
                "e", "e", "k", "s"); 
        List<String> ans = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ans);
	}
}
