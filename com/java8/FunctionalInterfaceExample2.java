package com.java8;

import java.io.IOException;
import java.io.PrintWriter;

interface FunctionalInterface2 {
	
    public void execute();

    public default void print(String text) {
        System.out.println(text);
    }

    public static void print(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }

}

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {
		FunctionalInterface2 lambda = () -> {
		    System.out.println("Executing...");
		};
	}
}

