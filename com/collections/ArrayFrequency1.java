package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class ArrayFrequency1
{
    public static void main(String[] args) {

    	String[] arr = {"BB", "AA", "AA", "CC", "BB", "AA"};
    	List<String> list = Arrays.asList(arr);
    	
    	Set<String> distinct = new HashSet<>(list);
    	
    	System.out.println(distinct);
    	for(String s:distinct) {
    		System.out.println(s+" : "+ Collections.frequency(list, s));
    	}
    	
//    	System.out.println(list);
    	
//        List<String> list = Arrays.asList("BB", "AA", "AA", "CC", "BB", "AA");
// 
//        Set<String> distinct = new HashSet<>(list);
//        for (String s: distinct) {
//            System.out.println(s + ": " + Collections.frequency(list, s));
//        }
    }
}
