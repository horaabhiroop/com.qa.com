package com.qa.com.com.qa.com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class reverseTheDigits {

	public static void main(String[] args) {

		
//		For sentence = "Man bites dog", the output should be
//		solution(sentence) = "dog bites Man”
		
//		String sentence = "Man bites dog";
//		
//		String[] s1 = sentence.split(" ");
//		
//		int i=0;
//		int j=s1.length-1;
//		
//		while(i<j) {
//			String temp = s1[i];
//			s1[i] = s1[j];
//			s1[j] = temp;
//			i++;
//			j--;
//		}
//		 String result = String.join(" ", s1);
//		 System.out.println(result);
		
		
//		For s = "abacabad", the output should be
//		solution(s) = 'c'.
		
		String s = "abacabad";
		
//		int[] freq = new int[26];
//		
//		// Frequency count
//		for(int i=0; i < s.length(); i++) {	
//			freq[s.charAt(i)-'a']++;
//		}
//		
//		//// Find first non-repeating character
//		for(int i=0; i<s.length(); i++) {
//			if(freq[s.charAt(i) - 'a'] == 1) {
//				System.out.println(s.charAt(i));
//				return;
//			}
//		}
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char c : map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println(c);
				return;
			}
		}


	}

}
