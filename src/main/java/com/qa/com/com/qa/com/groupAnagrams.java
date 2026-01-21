package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<>();

		for (String a : strs) {
			char[] ch = a.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			map.computeIfAbsent(key, k -> new ArrayList<String>()).add(a);

		}
		return new ArrayList<>(map.values());
	}

	public static int removeElement(int[] nums, int val) {

		List<Integer> result = new ArrayList<Integer>();
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				count++;
				result.add(nums[i]);
			}
		}
		System.out.println(result);
		return count;
	}

	public static void main(String[] args) {
		
		int[] nums = {1,1,2,3,4};
		
		System.out.println(removeElement(nums, 1));

	}

}
