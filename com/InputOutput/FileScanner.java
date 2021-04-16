package com.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
//		try {
		File fl =new File("E:\\Tanzeel\\Java\\ProjectNew2\\TestProject\\TestLines.txt");
		Scanner sc = new Scanner(fl);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());			
		}
		sc.close();		
//		} catch (FileNotFoundException e) {
			// TODO: handle exception
//			e.printStackTrace();
//		}
	}

}
