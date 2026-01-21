package com.qa.com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class vhba {

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<>();
		for (String s1 : strs) {
			Arrays.sort(strs);
			String key = new String(s1);
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s1);
		}
		return new ArrayList<>(map.values());
	}

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[k];

		for (int a : nums) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		List<Integer> list = new ArrayList<Integer>(map.keySet());
		list.sort((a, b) -> map.get(b) - map.get(a));

		for (int i = 0; i < k; i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static int[] productExceptSelf(int[] nums) {

		// int[] nums = {1,2,4,6};
		// {[48,24,12,8]}

		int n = nums.length;
		int[] result = new int[n];

		result[0] = 1; // 1 0 0 0

		// Left Array
		for (int i = 1; i < nums.length; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
//		System.out.println(Arrays.toString(result));

		// Right array
		int rightSum = 1;

		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * rightSum;
			rightSum = rightSum * nums[i];
		}

		return result;
	}

	public static int longestConsecutive(int[] nums) {

		// [2,20,4,10,3,4,5]
		Set<Integer> set = new HashSet<>();

		if (nums.length == 0)
			return 0;

		for (int a : nums) {
			set.add(a);
		}
		int longest = 0;

		for (int a : set) {
			if (!set.contains(a - 1)) {
				int currentNum = a;
				int currentStreak = 1;

				while (set.contains(currentNum + 1)) {
					currentNum++;
					currentStreak++;
				}

				longest = Math.max(currentStreak, longest);
			}
		}
		return longest;
	}

	public static boolean isPalindrome(String s) {

		// Input: s = "Was it a car or a cat I saw?"

		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
		}
		String input = sb.toString().toLowerCase();

		int i = 0;
		int j = input.length() - 1;
		char[] ch = input.toCharArray();

		while (i < j) {
			char c1 = ch[i];
			ch[i] = ch[j];
			ch[j] = c1;
			i++;
			j--;
		}

		return new String(ch).equals(input);
	}

	public static int[] twoSum(int[] nums, int target) {

		int i = 0;
		int j = nums.length - 1;

		if (nums.length < 2) {
			return new int[] { -1, -1 };
		}

		while (i < j) {
			int sum = nums[i] + nums[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {
				return new int[] { i, j };
			}
		}
		return new int[] { -1, -1 };
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);

		if (nums == null | nums.length < 3) {
			return new ArrayList<>();
		}
		Set<List<Integer>> set = new HashSet<>();

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					set.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return new ArrayList<>(set);
	}

	public static int maxArea(int[] heights) {

		int left = 0;
		int right = heights.length-1;
		int maxArea = 0;
		
		while(left < right) {
			int area = Math.min(heights[left], heights[right]) * (right-left);			
			maxArea = Math.max(maxArea, area);
		if(heights[left] < heights[right]) {
			left++;
		}
		else {
			right--;
		}
		}
		return maxArea;
	}

	public static void main(String[] args) {

//		int[] nums = { 1,7,2,5,4,7,3,6 };
//
//		System.out.println(maxArea(nums));

//		int[] numbers = { 1, 2, 3, 4 };
//		int target = 3;
//
//		System.out.println(Arrays.toString(twoSum(numbers, target)));

//		String input = "1Was it a car or a cat I saw1?";
//
//		System.out.println(isPalindrome(input));

//		int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
//		int k = 2;

//		System.out.println(longestConsecutive(nums));
		
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,2,2,3,4,1,2,3));
		
		Set<Integer> set = new LinkedHashSet<Integer>(ar);
		
		ArrayList<Integer> arr = new ArrayList<>(set);
		
		System.out.println(arr);
		
	}

}
