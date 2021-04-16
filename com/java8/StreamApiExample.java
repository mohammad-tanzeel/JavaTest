package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExample {

	public static void main(String args[]) {
		
		List<String> names = new ArrayList<String>();
		names.add("Jamsh");
		names.add("Negan");
		names.add("Jamshed3");
		names.add("Jamshed4");
		
		int count = 0;
		for(String str : names) {
			if(str.length()<6) {
				count++;
			}
		}
		
		long count1 = names.stream().filter(str->str.length()<6).count();
		
		System.out.println("There are "+count+" string with length");
		System.out.println("There are "+count1+" string with length for java 8");
	}

}
