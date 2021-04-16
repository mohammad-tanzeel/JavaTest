package com.collections;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateValueFromTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		try(Scanner s = new Scanner( new File("E:\\Test.txt"))){
			while(s.hasNext()) {
				String line = s.nextLine();
		        String wordList[] = line.split(" ");
		        int key = 1;
		        for(String newStr: wordList) {
		        	
		        	if(hashmap.containsKey(newStr)) {
		        		key = hashmap.get(newStr);
		        		key++;
		        		hashmap.put(newStr, key);
		        	} else {		        	
		        	hashmap.put(newStr, key);
		        	}
		        }
			}		
		} 
		catch (FileNotFoundException e) {
		    // Handle the potential exception
		}
		System.out.println(hashmap);
	}
}
