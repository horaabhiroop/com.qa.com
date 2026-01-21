package com.qa.com.com.qa.com;

import java.util.HashMap;

public class countCharInString {

	public static void main(String[] args) {
		
		String str = "I love Java Programming";
		HashMap<Character, Integer> hm = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(!hm.containsKey(ch)) {
		    hm.put(ch, hm.getOrDefault(ch, 0)+1);
		    sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
