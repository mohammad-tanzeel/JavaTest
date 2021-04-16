package com.collections;

import java.util.ArrayList;

public class ArrayListExamp {
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(2);
		m(l);
	}
	
	static void m(ArrayList<? super Double> l) {
		System.out.println(l.get(0));
		System.out.println(l.get(1));
	}
}
