package com.qa.com.com.qa.com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NonRepeatingChar {

	public static void main(String[] args) {
		
		String a = "aabb";
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i < a.length(); i++) {
			char ch = a.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char c: map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}
	}

}
