package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example3 {

	  public static void main(final String[] args) {
		  
		  final List<Employee> emp = new ArrayList<Employee>();
		  emp.add(new Employee("Mohd", "Tanzeel", 20));
		  emp.add(new Employee("Zain", "Khan", 56));
		  emp.add(new Employee("Mohd Hassan", "Khan", 4));
		  Collections.sort(emp);
		  System.out.println(emp);
		  
	  }

}
