package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println(list.stream().reduce(0,(c,e) ->(c+e)));
		
	}

}
