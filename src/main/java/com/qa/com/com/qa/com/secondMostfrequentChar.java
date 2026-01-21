package com.qa.com.com.qa.com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class secondMostfrequentChar {

	public static void main(String[] args) {
		
		String input  = "aabbccddeee";
		
		int largestNo = 0;
		int secondLargestNo=0;
		
	    char largestChar = '\0';
	    char secondLargestChar = '\0';
		
		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		for(int i=0; i < input.length(); i++) {
			char ch = input.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		for(char c: hm.keySet()) {
			int freq = hm.get(c);
			if(largestNo<freq) {
				secondLargestNo = largestNo;
				secondLargestChar = largestChar;
				
				largestNo = freq;
				largestChar = c;
			}
			else if(secondLargestNo<freq && freq != largestNo) {
				secondLargestNo = hm.get(c);
				secondLargestChar = c;
			}
		}
		System.out.println(secondLargestChar);
	}

}
