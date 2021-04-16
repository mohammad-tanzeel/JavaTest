package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str={"1","2","3","abc"};
		
		Stream<Integer> number;
        int[] result = Arrays.stream(str).filter(x -> isNumeric(x)).mapToInt(Integer::parseInt).toArray();
        System.out.println("Size: "+result.length);
		for(int x: result)
			System.out.print(x+", ");

	}

	private static boolean isNumeric(String param) {
		boolean isDigit = false;
		char[] array = param.toCharArray();
		for(char ch: array) {
			isDigit = true;
			if(!Character.isDigit(ch)) {
				isDigit = false;
				break;
			}			
		}
		return isDigit;
	}
}

