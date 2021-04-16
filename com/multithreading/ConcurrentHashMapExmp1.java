package com.multithreading;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExmp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ConcurrentHashMap<String, Integer>  mymap = new ConcurrentHashMap<String,  Integer>();   
        mymap.put("Java", Integer.valueOf(18));
        mymap.put("Scala", Integer.valueOf(10));
        mymap.put("C++", Integer.valueOf(31));
        mymap.put("C", Integer.valueOf(41));
        if(mymap.containsKey("Java")) {
        	
        }
        System.out.println(mymap);
	}

}
