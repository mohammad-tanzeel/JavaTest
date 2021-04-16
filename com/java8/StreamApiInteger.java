package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiInteger {
	
	public static void main(String args[]) {
		
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        
        firstFivePrimeNumbers.stream().forEach(System.out::println); 
//		Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
//		numbers2.forEach(i -> System.out.print(i+","));
//        stream.forEach(p -> System.out.println(p));
        
	}

}
