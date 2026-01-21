package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.HashMap;

public class MappingAccToLength {

	public static void main(String[] args) {

		
		String[] a = {"come", "up", "let", "puh", "yup", "yo"};
		
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		
		for(int i=0; i< a.length; i++) {
			int len = a[i].length();
			
			if(!map.containsKey(len)) {
				map.put(len, new ArrayList<>());
			}
			map.get(len).add(a[i]);
		}
		System.out.println(map);
	}

}
