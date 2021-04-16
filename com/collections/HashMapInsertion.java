package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapInsertion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Map<String,String> capitalCities = new HashMap<String,String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    HashMap<String, String> results = new HashMap();
	    results.put("FirstYear", "Pass");
	    results.put("ThirdYear", "Pass");
	    results.put("SecondYear", "Fail");
	    for (String result : results.keySet()) {
	     System.out.println(result + " => " + results.get(result));
	    }

	}
}
