package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class findTheMissingNumber {

	public static void main(String[] args) {
		
		int [] input={2,4,6,7,8,9,15};
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int a:input) {
			set.add(a);
		}
		
		for(int i= input[0]; i< input[input.length-1]; i++) {
			if(!set.contains(i)) {
				list.add(i);
			}
		}
		
		System.out.println(list);
	}

}
