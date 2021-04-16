package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReversArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList<>();
		
		list.add("100");
		list.add("200");
		list.add("300");
		list.add("400");
		list.add("500");
		
//		list.remove(2);
//		list.remove(3);
		
		list.set(3, "4");
		List slit = list.subList(1, 3);
		
		Stream<String> stream1;
		
		list.stream().forEach(ls -> System.out.println(ls));
		
		
		for(int i=list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
		
	}

}
