package com.collections;

import java.util.HashMap;

public class CountDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1 = "aabbbccccddddd";
//		
//		HashMap<Character, Integer> hp = new HashMap();
//		
//		int count = 0;
//		for(int k =0 ; k<s1.length(); k++) {
//			
//			if(hp.containsKey(c)) {
//
//			hp.put(s1.charAt(k), count);
//			System.out.println(s1.charAt(k));
//			
//			count++;
//		}

		String str1 = "abbcccdddd";
		char[] char1 =str1.toCharArray();
//		System.out.println(char1);
		HashMap<Character, Integer> hp1 = new HashMap();
		
		int count =1;
		for(char ch : char1) {
			
//			System.out.println(ch);
			if(hp1.containsKey(ch)) {
			hp1.put(ch, ++count);
			} else {
				hp1.put(ch, 1);
			}
		}
		System.out.println(hp1);
        String blogName = "abbcccdddd";
        char[] chars = blogName.toCharArray();
         
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : chars) 
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        
        System.out.println(map);
	    String s="mmababctamantlslmag";
	    int distinct = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.println(s.charAt(i)+""+distinct);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        distinct = 0;
	    }

	}
	
}
