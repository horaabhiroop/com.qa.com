package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class firstDuplicateNum {

	/*
	 * Input: [2, 1, 3, 5, 3, 2] Output: 3
	 */

	public static int duplicates(int[] arr) {

		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i < arr.length; i++) {
			if(set.contains(arr[i])) {
				return arr[i];
			}
			set.add(arr[i]);
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 1, 3, 5, 3, 2 };

		System.out.println(duplicates(arr));

	}

}
