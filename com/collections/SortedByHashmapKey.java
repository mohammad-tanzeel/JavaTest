package com.collections;

import java.util.*;

public class SortedByHashmapKey {

    static Map<String, Integer> map = new HashMap<>();
    
    // Function to sort map by Key
    public static void sortbykey()
    {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();
  
        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);
  
        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) 
            System.out.println("Key = " + entry.getKey() + 
                         ", Value = " + entry.getValue());        
    }
      

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// putting values in the Map
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
  
        // Calling the function to sortbyKey
        sortbykey();
	}

}
