package com.test;

import java.io.File;
import java.nio.file.Files;

public class CopyFiles {
	
	public static void main(String[] args) {
		File orignalfile = new File("E:\\Tanzeel\\Java\\ProjectNew2\\TestProject\\com\\test\\data.txt");
		File newfile = new File("E:\\Tanzeel\\Java\\ProjectNew2\\TestProject\\com\\test\\Backup.txt");
		
		try {
			Files.copy(orignalfile.toPath(), newfile.toPath());
			System.out.println("Copied");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
	
}
