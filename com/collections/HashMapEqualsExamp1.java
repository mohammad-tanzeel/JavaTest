package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEqualsExamp1 {
	public static void main(String[] args) {
		
		String p1 = "Aa";  //2112
		String p2 = "BB";  //2112 
		
		System.out.println("p1"+p1.hashCode());
		System.out.println("p2"+p1.hashCode());
		
		Map<String,String> concept = new HashMap();
		concept.put(p1,"Hello..");
		concept.put(p2,"Hello World...");

		concept.put("tanzeel1","Hello..");
		concept.put("taneel2","Hello World...");
		System.out.println("Size: "+concept.size());

		concept.forEach((k,v) -> System.out.println("Key: "+k+", Value: "+v));
		 
//		List<String> names = Arrays.asList("AAA","BBB");
//		List<String> names = getAllNames();
		
		concept.forEach((k,v) -> {
			System.out.println("Key: "+k+", Value: "+v);
			if(k.equals("tanzeel1")) {
				concept.remove(k);
			}
		});	 
		
//		Set<String> lAllKeys = 
	}
	
//	public static List<String> getAllNames(){
//		List<String> names =new ArrayList<>();
//		names.add("Abc");
//		return names;
//	}

} 