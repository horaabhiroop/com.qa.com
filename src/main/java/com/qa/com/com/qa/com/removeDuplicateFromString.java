package com.qa.com.com.qa.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateFromString {

	public static void main(String[] args) {
		
		String str = "Java is fun and Java is powerful and fun";
		
		String[] s1 =str.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(int i=0; i < s1.length; i++) {
			if(!set.contains(s1[i])) {
				set.add(s1[i]);
			}
		}
		String s2 =String.join(",", set).replace(",", " ");
		System.out.println(s2);
		
		
	}

}
