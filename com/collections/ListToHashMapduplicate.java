package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListToHashMapduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   	String[] arr = {"BB", "AA", "AA", "CC", "BB", "AA"};
//    	List<String> list = Arrays.asList(arr);
	   	HashMap<String, Integer> hm = new HashMap<>();
    	Arrays.sort(arr);
    	int size = arr.length;
    	int count = 0;
    	for(int i=0;i<size;i++) {
    		
        	for(int j=i+1;i<size;i++) {
    		System.out.println(arr[i]);
    		if(arr[i]==arr[j]) {
    			count++;    			
    		} else {
    			count = 1;
    		}
    		hm.put(arr[i], count);
        	}
    	}
    	
    	System.out.println(hm);
	}

}
