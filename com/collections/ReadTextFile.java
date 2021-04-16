package com.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class ReadTextFile {
	
	
	public static void main(String[] args) throws Exception {
		String line;
		// Opens file in read mode
		FileReader file = new FileReader("E:\\Test.txt");
		try(BufferedReader br = new BufferedReader(file)){
			
		

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		int duplicateCount = 0;
		// Reads each line
		while ((line = br.readLine()) != null) {
			String string[] = line.toLowerCase().split(" "); // split using space
			for (String wordStr : string) {
				// System.out.println(wordStr);
				wordStr = wordStr.replace(" ", "");
				// System.out.println(wordStr);

				if (hashmap.containsKey(wordStr)) {
					// this is duplicate count
					duplicateCount++;
					//System.out.println(duplicateCount + " ,duplicate words ==" + wordStr);
				} else {
					hashmap.put(wordStr, 1);
				}
			}
		}
		br.close();
		System.out.println("total duplicate count : "+duplicateCount);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		

	}
}
