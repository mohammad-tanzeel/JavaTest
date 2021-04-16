package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream = stringList.stream();

		Optional<String> reduced = stream.reduce((value, combinedValue) -> {
		    return combinedValue + " + " + value;
		});

		System.out.println(reduced.get());
		
		List<String> stringList1 = new ArrayList<String>();

		stringList1.add("One flew over the cuckoo's nest");
		stringList1.add("To kill a muckingbird");
		stringList1.add("Gone with the wind");
		
//		Stream<String> stream1 = stringList1.stream();
		stringList1.stream().forEach(s -> System.out.println(s));
		
//		System.out.println(stream1);

	}

}
