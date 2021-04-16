package com.collections;

import java.util.HashMap;

class Employes1 {
	private String name;
	public Employes1(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
public class HashmapExamp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employes1, String> hm = new HashMap<Employes1, String>();
		hm.put(new Employes1("a"), "Tanzeel");
		hm.put(new Employes1("b"), "Tanzeel1");
		hm.put(new Employes1("a"), "empl OVERRIDDEN");
		System.out.println(hm.size());
		System.out.println(hm.get(new Employes("a")));
		
	}

}
