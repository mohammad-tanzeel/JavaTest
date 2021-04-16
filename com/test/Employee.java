package com.test;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	  private String firstname;
	  private String lastname;
	  private int age;
	  
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return Integer.compare(age, e.age);
		
	}
	public Employee(String firstname, String lastname, int age) {
		setAge(age);
		setFirstname(firstname);
		setLastname(lastname);
	}
	
	
	  
	
}
