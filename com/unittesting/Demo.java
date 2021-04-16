package com.unittesting;

public class Demo {
	
	public boolean compareString(String first, String second) {
		if(first.equalsIgnoreCase(second)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String concatMyString(String first, String second) {
		return first.concat(second);
	}
	
	public int squree(int n) {
		return n*n;
	}
}
