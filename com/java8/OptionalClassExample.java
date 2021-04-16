package com.java8;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String args[]) {
	
	String[] s =  new String[5];
	s[0] = "Mohd";
	s[1] = "Tanzeel";
//	System.out.println(s[2]);
	Optional<String> obj = Optional.ofNullable(s[2]);
	if(obj.isPresent()) {
		System.out.println("Yes found");
	} else {
		System.out.println("Not found");
	}
	
	}
}
