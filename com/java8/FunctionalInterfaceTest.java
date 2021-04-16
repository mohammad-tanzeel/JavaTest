package com.java8;


@FunctionalInterface
public interface FunctionalInterfaceTest {
	void sum();
	
	static void print() {
		System.out.println("Test print");
	}
	
	default void display() {
		System.out.println("Test Display");
	}
}
