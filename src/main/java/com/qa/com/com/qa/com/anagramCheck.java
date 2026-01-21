package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class anagramCheck {
	
	static boolean anagramCheck(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] freq = new int[256];
		
		for(char c: s1.toCharArray()) freq[c]++;
		for(char c: s2.toCharArray()) freq[c]--;
		
		for(int c:freq) {
			if(c != 0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		String input1 = "hello";
		String input2 = "world";
		
		System.out.println(anagramCheck(input1, input2));
	}

}
