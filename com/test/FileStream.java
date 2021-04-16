package com.test;
//Java program to illustrate Copying the file 
//and deleting the original file 
//import java.io.*; 
import java.io.File;
import java.io.FileNotFoundException;

public class FileStream {

	public static void main(String[] args) 
	{ 
		File file = new File("C:\\DataRetriever1\\test\\tests.txt"); 
		
        File file1=new File("C:\\\\DataRetriever1\\\\test\\");
        
        File[] fileNames=file1.listFiles();
        System.out.println(fileNames.length);
        if(fileNames.length>0) {
            for(int i=0;i<fileNames.length;i++){
            	fileNames[i].renameTo(new File("D:\\Tanzeel\\Java\\Files"+File.separator+fileNames[i].getName()));
            	 
            }
        }

		// renaming the file and moving it to a new location 
		if(file.renameTo 
		(new File("D:\\Tanzeel\\Java\\Files\\newFile.txt"))) 
		{ 
			// if file copied successfully then delete the original file 
//			file.delete(); 
			System.out.println("File moved successfully"); 
		} 
		else
		{ 
			System.out.println("Failed to move the file"); 
		} 

		
	} 

}



 
