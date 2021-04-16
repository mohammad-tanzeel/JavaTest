package com.coreJava;

public class TryCatchExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=9/0;
			System.out.println("result ="+ i);
		} catch(Exception e) {
			System.out.println("Exception occerd");
		}
		finally {
			System.out.println("test finally ");
		}
	}

}
