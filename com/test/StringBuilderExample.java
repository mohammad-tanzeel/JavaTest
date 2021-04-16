package com.test;

class StringBuilderExample{  
public static void main(String args[]){  
	
	StringBuilder sb = new StringBuilder("Hello");
	sb.append(" Java");
	//System.out.println(sb);
	sb.replace(1, 3, "Java");
	System.out.println(sb);

	}
}
