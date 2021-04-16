package com.exception;

public class ExceptionExamp1 {
	
	static String str = "";
	public static void main(String[] args) {
		try {
		str += "a";
		
		} 
		finally {
			str +="c";
		}
		System.out.println(str);
	}
}
