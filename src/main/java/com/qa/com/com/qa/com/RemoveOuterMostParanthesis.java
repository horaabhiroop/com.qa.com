package com.qa.com.com.qa.com;

import java.util.Arrays;

public class RemoveOuterMostParanthesis {

	public static void main(String[] args) {

		int[] a = { 0, 1, 5 };
		int[] b = { 2, 6, 7 };

		int result[] = new int[a.length + b.length];  //CORRECTED

		int i = a.length - 1;
		int j = b.length - 1;
		
		int k = result.length - 1;
		
		while(i>=0 && j >=0) {
			if(a[i]>b[j]) {
				result[k--] = a[i--];
			}
			else {
				result[k--] = b[j--];
			}
		}
		
		while(i >= 0) {
			result[k--] = a[i--];
		}
		while(j >= 0) {
			result[k--] = b[j--];
		}

		System.out.println(Arrays.toString(result));
	}

}
