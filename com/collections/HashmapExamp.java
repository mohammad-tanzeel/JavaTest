package com.collections;

import java.util.HashMap;
import java.util.Set;

class Employes {
	private String name;
	public Employes(String name) {
		this.name = name;
	}
	
//	@Override
//	public int hashCode() {
//		return (this.name == null?0 : this.name.hashCode());
//	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
public class HashmapExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employes, String> hm = new HashMap<Employes, String>();
		hm.put(new Employes("a"), "Tanzeel");
		hm.put(new Employes("b"), "Tanzeel1");
		hm.put(new Employes("a"), "empl OVERRIDDEN");
		System.out.println(hm.size());
//		System.out.println(hm.get(new Employes("a")));

//		for( hm.keySet()) {
			
		}
	}

//}
