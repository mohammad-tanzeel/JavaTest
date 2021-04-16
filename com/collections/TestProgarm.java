package com.collections;

import java.util.Arrays;

public class TestProgarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] number = {1, 2, 3, 34, 56,56};
			int[] newnumber = {};
			int size =number.length;
			int temp;
		Arrays.sort(number);
		
		int i=0;
		int j =0;
		try {
		for(i=0;i<size-1;i++) {
				if(number[i]!=number[i+1]) {
					temp = number[i];
					newnumber[i] = temp;
				}
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println(newnumber[newnumber.length-2]);
	}

}
