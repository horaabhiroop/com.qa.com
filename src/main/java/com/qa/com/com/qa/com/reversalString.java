package com.qa.com.com.qa.com;

import java.util.Arrays;

public class reversalString {

	public static void main(String[] args) {
		
		String input ="Java";
		char[] abc = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		int start =0;
		int end =input.length()-1;
		
		while(start<end) {
			char ch = abc[start];
			abc[start]=abc[end];
			abc[end]=ch;
			start++;
			end--;
		}
		String reversal = new String(abc);
		System.out.println(reversal);
	}

}
