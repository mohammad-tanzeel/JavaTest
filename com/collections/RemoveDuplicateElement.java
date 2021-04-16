package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		
		List<Integer> ls2 = Arrays.asList(intArray);
			
		LinkedHashSet<Integer> lhs = new LinkedHashSet(ls2);
		
		System.out.println(lhs);
		
//		List<Integer> ls1 = 
		List<String> ls = new ArrayList();
		ls.add("Tanzeel");
		ls.add("Ahasan");
		ls.add("Tanzeel");
		ls.add("Hassan");
		
		System.out.println(ls);
//		Mehod1
//		Set<String> sortedlist = new LinkedHashSet<String>(ls);
//		System.out.println(sortedlist);
		
//		Method2
//		List newls = new ArrayList<>();
//		for(String name : ls) {
//			if(!newls.contains(name)) {
//				newls.add(name);
//			}
//		}
//		System.out.println(newls);

//		Method3
//		Set<String> newset = new HashSet<>();
//		newset.addAll(ls);
//		System.out.println(newset);

//		newset.clear();

//		Method4
		List<String> dusplicatStr = ls.stream().distinct().collect(Collectors.toList());
		System.out.println(dusplicatStr);
		
	}

}
