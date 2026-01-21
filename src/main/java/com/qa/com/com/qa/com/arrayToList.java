package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToList {

	public static void main(String[] args) {

		
		int num[] = {128,138,88,81,181,131,122,155};
		
		List<Integer> list = new ArrayList<Integer>();
		
//		for(int i=0; i < num.length ; i++) {
//			if(num[i] % 10 == 8 || num[i] % 10 == -8) {
//				list.add(num[i]);
//			}
//		}
//		
//		int[] arr = new int[list.size()];
//		
//		for(int i=0; i < arr.length; i++) {
//			arr[i]= list.get(i);
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i < num.length; i++) {
			
			if(String.valueOf(num[i]).contains("8")) {
				list.add(num[i]);
			}
		}
		
//		int[] arr = new int[list.size()];
//		
//		for(int i=0; i < arr.length; i++) {
//			arr[i]= list.get(i);
//		}
		
		//Integer[] ab = list.toArray(new Integer[0]);
		
		Integer[] ab1 = list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(ab1));
		
		
 	}

}
