package com.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class MostRepeatedWordCount {

	public static void main(String[] args) throws Exception {
		String line;
		// Opens file in read mode
		FileReader file = new FileReader("E:\\Test.txt");
		BufferedReader br = new BufferedReader(file);

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
//		int duplicateCount = 0;
//		int mostRepeatedWordCount = 0;
//		String mostRepeatedWord="";

		while ((line = br.readLine()) != null) {
			String string[] = line.toLowerCase().split(" "); // split using space
			for (String wordStr : string) {
				// System.out.println(wordStr);
				wordStr = wordStr.toLowerCase().replace(" ", "");
				// System.out.println(wordStr);

				int key=1;
				if (hashmap.containsKey(wordStr)) {
					// this is duplicate count
//					duplicateCount++;
					key=hashmap.get(wordStr);
					key++;
					hashmap.put(wordStr, key);
					//System.out.println("key =="+key+" ,wordStr="+wordStr);
					//most repeated count
//					if(key>mostRepeatedWordCount) {
//						mostRepeatedWordCount=key;
//						mostRepeatedWord=wordStr;
//					}
				} else {
					hashmap.put(wordStr, key);
				}
			}
		}
		br.close();
		//System.out.println(hashmap);
//		System.out.println("most Repeated Word : "+mostRepeatedWord);
//		System.out.println("mostRepeatedWordCount : "+mostRepeatedWordCount);
//		System.out.println("or mostRepeatedWordCount : "+hashmap.get(mostRepeatedWord));
//		System.out.println("total duplicate count : "+duplicateCount);
		System.out.println(hashmap);
	}
}
