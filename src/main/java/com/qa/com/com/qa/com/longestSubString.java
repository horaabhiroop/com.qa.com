package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class longestSubString {

	public static void main(String[] args) {

		
		String s = "abcabcbb";
		
		int start =0;
		int max_count = 0;
		
		Set<Character> list = new LinkedHashSet<>();
		
		for(int i=0; i < s.length(); i++) {
			//if it doesn't contain the char in the list, then add the char
			char ch = s.charAt(i);
			if(!list.contains(ch)) {
				list.add(ch);
				max_count = Math.max(max_count, list.size());
			}
			else {
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
				i--;
			}
		}
		
		System.out.println(max_count);
	}

}
