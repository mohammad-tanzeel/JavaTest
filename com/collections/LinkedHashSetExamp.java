package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet nlhs = new HashSet<>();
		
		  nlhs.add("B");
	      nlhs.add("A");
	      nlhs.add("C");
	      nlhs.add("E");
	      nlhs.add("D");
	      nlhs.add("H");
	    
		
	      LinkedHashSet hs = new LinkedHashSet();
	      
	      hs.add("B");
	      hs.add("A");
	      hs.add("C");
	      hs.add("E");
	      hs.add("D");
	      hs.add("H");
	      
	      System.out.println(hs);
	      
	      System.out.println(nlhs);

	}

}
