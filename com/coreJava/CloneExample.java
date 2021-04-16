package com.coreJava;

public class CloneExample implements Cloneable {
	// creates and returns a copy of this object
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	String name = "Microprocessor";

	public static void main(String[] args) {
		CloneExample obj1 = new CloneExample(); // creating object of class
		try {
			CloneExample obj2 = (CloneExample) obj1.clone();
			System.out.println(obj1.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
