package com.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String csv = "Google, Apple, Samsung";
        int countWord = 0; 

		String[] element = csv.split(",");
//		System.out.println(element);
		
		List<String> fixedlength = Arrays.asList(element);
		System.out.println(fixedlength);
		
		ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<String> arrayList2 = new ArrayList<>();
		try (Scanner s = new Scanner(new File("E:\\Test.txt")).useDelimiter("\\s*-\\s*")) {
		    // \\s* in regular expressions means "any number or whitespaces".
		    // We could've said simply useDelimiter("-") and Scanner would have
		    // included the whitespaces as part of the data it extracted.
			
		    while (s.hasNext()) {
		    	String line = s.nextLine();
		    	
//		        arrayList.add(line);
		        String wordList[] = line.split(" ");
                countWord += wordList.length; 
                for (int i = 0; i < wordList.length; i++) {
                	arrayList.add(wordList[i]);
                    // If the name is already in the set, remove it.
//                    if (arrayList.add(wordList[i])) {
//                        edited += names[i] + " ";
//                    }
                }

//		        arrayList2 = Arrays.asList(str);
//		        System.out.println(str);
		    }
//		    arrayList2 = Arrays.asList(wordList);
		    System.out.println(arrayList);
		    System.out.println(countWord);
		}
		catch (FileNotFoundException e) {
		    // Handle the potential exception
		}
	}
}
