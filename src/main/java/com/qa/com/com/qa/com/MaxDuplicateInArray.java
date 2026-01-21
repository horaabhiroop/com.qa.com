package com.qa.com.com.qa.com;

import java.util.HashMap;

public class MaxDuplicateInArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 2, 3};
		
		int count =0;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		for(int a1 : hm.values()) {
			
			if(a1>1) {
				count += a1 - 1;
			}
		}
		System.out.println(count);
		
	}

}
