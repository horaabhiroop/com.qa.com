package com.qa.com.com.qa.com;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IsmorphicString {
	
	static boolean isIsomorphic(String s1, String s2) {
		
		if(s1.length() != s2.length()) return false;
		
		Map<Character, Character> map = new LinkedHashMap<>();
		Set<Character> mappedValues= new HashSet<>();
			
			for(int i=0; i < s1.length(); i++ ) {
				
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(i);
				
				if(!map.containsKey(c1)) {
					
					if(mappedValues.contains(c2)) {
						return false;
					}
					map.put(c1, c2);
					mappedValues.add(c2);
				}
				else {
					if(map.get(c1) != c2) {
						return false;
					}
				}
				
			}
			return true;
	}


	public static void main(String[] args) {

		String s1 = "foo";
		String s2 = "bar";
		
System.out.println(isIsomorphic(s1, s2));
	}

}
