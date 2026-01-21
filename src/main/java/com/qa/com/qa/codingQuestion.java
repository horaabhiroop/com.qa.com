package com.qa.com.qa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class codingQuestion {

	public static String reverse(String a) {

		// SDET

		char[] ch = a.toCharArray();

		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}

	public static boolean palindromeCheck(String a) {

		if (a == null) {
			return false;
		}

		char[] ch = a.toCharArray();
		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			if (ch[i] == ch[j]) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;

	}

	public static Character firstNonRepeatingChar(String input) {

		if (input == null || input.isEmpty()) {
			return null;
		}

		char[] ch = input.toLowerCase().toCharArray();

		int[] freq = new int[256];

		for (char c : ch) {
			freq[c]++;
		}

		for (char c : ch) {
			if (freq[c] == 1) {
				return c;
			}
		}
		return null;
	}

	public static Map<Character, Integer> findDuplicateChars(String input) {

		Map<Character, Integer> result = new HashMap<>();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		if (input == null || input.isEmpty()) {
			return result;
		}

		for (char c : input.toCharArray()) {
			if (c == ' ') {
				continue;
			}
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : map.keySet()) {
			if (map.get(c) > 1) {
				result.put(c, map.get(c));
			}
		}

		return result;

	}
	
	public static boolean areAnagrams(String s1, String s2) {
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		
		int[] freq = new int[26];
		
		if(ch1.length != ch2.length) {
			return false;
		}
		
		for(char c : ch1) {
			freq[c - 'a']++;
		}
		for(char c: ch2) {
			freq[c - 'a']--;
		}
		
		for (int count : freq) {
	        if (count != 0) {
	            return false;
	        }
	    }
		return true;	
	}

	public static void main(String[] args) {

//		System.out.println(String.valueOf(reverse("SDET")));
//		
//		System.out.println(palindromeCheck("MADAN"));

//		System.out.println(firstNonRepeatingChar("swiss"));

//		System.out.println(findDuplicateChars("programming"));
		
		System.out.println(areAnagrams("Listen", "Silent"));
	}

}
