package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public class sortTheHashMapByValues {

	public static void main(String[] args) {

		Map<String, Integer> hm = new LinkedHashMap<>();
		
		hm.put("one", 5);
		hm.put("two", 3);
		hm.put("five", 1);
		
		List<Map.Entry<String, Integer>> ls = new ArrayList<>(hm.entrySet());
		
		Collections.sort(ls, (a,b) -> a.getValue()-b.getValue());
		
		for(Map.Entry<String, Integer> entry:ls) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
