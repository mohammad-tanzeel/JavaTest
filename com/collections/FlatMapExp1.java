package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
        List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");

        List<List<String>> mergeList = new ArrayList<List<String>>();
        
        List<List<String>> hogwarts = new ArrayList<List<String>>(); 
        hogwarts.add(houseGryffindor);
        hogwarts.add(houseHufflepuff);
        hogwarts.add(houseRavenclaw);
        hogwarts.add(houseSlytherin);
        
        
        System.out.println(hogwarts);
        
//        hogwarts.stream().flatMap(hlist -> hlist.stream()).collect(Collectors.toList()).forEach(System.out::println);
        hogwarts.stream().flatMap(hlist -> hlist.stream()).filter(x -> !x.equals("Harry")).forEach(System.out::println);
	}

}
