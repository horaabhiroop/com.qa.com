package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class dsds {

	public static String list(int target) {
		List<Integer> list = new ArrayList<>(Arrays.asList(100, 20, 30, 40, 40, 50, 60, 70, 100, 100, 100));

		int count = 0;

		for (int a : list) {
			if (a >= target) {
				count++;
			}
		}
		int a = (count * 100) / list.size();
		return String.valueOf(a) + "%";
	}

	public static void nextGreaterElement(int[] a, int[] b) {
		// [1,3,4,2]
		// [ ,-1]

		Stack<Integer> s1 = new Stack<>();

		int[] result = new int[a.length];

		for (int i = a.length - 2; i >= 0; i--) {

			//// Remove all elements smaller or equal to current
			/// 1. Array not empty
			/// 2. a[i] is greater than the last element in stack
			while (!s1.isEmpty() && s1.peek() <= a[i]) {
				s1.pop();
			}
			// If stack empty → no greater element
			result[i] = s1.isEmpty() ? -1 : s1.peek();

			s1.push(a[i]);
		}
		for (int val : result) {
			System.out.print(val + " : ");
		}
	}

	public static Character nonRepeatingChar(String s) {

		int freq[] = new int[256];

		if (s == null || s.isEmpty()) {
			return '#';
		}

		for (char c : s.toCharArray()) {
			freq[c]++;
		}

		for (int i = 0; i < freq.length; i++) {

			if (freq[s.charAt(i)] == 1) {
				return s.charAt(i);
			}
		}
		return Character.valueOf('#');

	}

	public static String removeOutermostParanthesis(String a) {
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();

		if (a == null || a.isEmpty())
			return "";

		for (char c : a.toCharArray()) {
			if (c == '(') {
				if (!st.isEmpty()) {
					sb.append(c);
				}
				st.push(c);
			} else {
				st.pop();
				if (!st.isEmpty()) {
					sb.append(c);
				}
			}
		}
		return sb.toString();

	}

	public static void FirstAndlastOccurance(String s, char target) {
		// amazonaanazzz,
		int firstocc = -1;
		int lastOcc = -1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == target) {
				if (firstocc == -1) {
					firstocc = i;
				}
				lastOcc = i;
			}
		}
		System.out.println("FIRST" + firstocc);
		System.out.println("LAST" + lastOcc);

	}

	public static int LongestSubString(String s) {

		int last = 0;
		int maxCount = 0;

		if (s.length() == 0 || s.isEmpty())
			return 0;

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
				System.out.println("--->>>" + set.size());
				maxCount = Math.max(maxCount, set.size());
			} else {
				set.remove(Character.valueOf(s.charAt(last)));
				last++;
				i--;
			}
		}
		return maxCount;
	}

	public static int findDuplicateElements(int[] a, int n) {
		int[] freq = new int[n];

		for (int a1 : a) {
			freq[a1]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 2) {
				return i;
			}
		}
		return -1;
	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

		// nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

		int i = nums1.length - 1;

		while (m > 0 && n > 0) {

			if (nums1[m - 1] > nums2[n - 1]) {
				nums1[i--] = nums1[m - 1];
				m--;

			} else {
				nums1[i--] = nums2[n - 1];
				n--;
			}
		}
		if (m > 0) {
			nums1[i--] = nums1[m--];
		}
		if (n > 0) {
			nums1[i--] = nums2[n--];
		}
		return nums1;
	}

	public static int removeElement(int[] nums, int val) {

//		Input: nums = [3,2,2,3], val = 3
//				Output: 2, nums = [2,2,_,_]
		int nonVal = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[nonVal] = nums[i];
				nonVal++;
			}
		}
		return nonVal;
	}

	public static int removeDuplicates(int[] nums) {

//		 Input: nums = [1,1,2]
//		 Output: 2, nums = [1,2,_]
		int repeat = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				nums[repeat] = nums[i];
			}
		}
		return repeat;
	}

	public static int removeDuplicates11(int[] a) {
		int k = 2;

		for (int i = 2; i < a.length; i++) {
			if (a[i] != a[k - 2]) {
				a[k] = a[i];
				k++;
			}
		}
		return k;

	}

	public static int majorityElement(int[] nums) {

//		 Input: nums = [2,2,1,1,1,2,2]
//		 Output: 2

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int a : nums) {
			hm.put(a, hm.getOrDefault(a, 0) + 1);
		}

		int len = nums.length / 2;

		for (int a : hm.keySet()) {
			if (hm.get(a) > len) {
				return a;
			}
		}
		return 0;

	}

	public static int majorityElement2(int[] nums) {

		int candidate = 0;
		int point = 0;

		for (int i = 0; i < nums.length; i++) {

			if (point == 0) {
				candidate = nums[i];
			}
			if (candidate == nums[i]) {
				point++;
			} else {
				point--;
			}

		}
		return candidate;
	}

	public static int[] rotate(int[] nums, int k) {

		int n = nums.length;

		k = k % n;

		// rotate whole array
		reverse(nums, 0, n - 1);
		// rotate the left part
		reverse(nums, 0, k - 1);
		// rotate the right part
		reverse(nums, k, n - 1);

		return nums;

	}

	public static int[] reverse(int[] nums, int i, int j) {
		while (i <= j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		return nums;
	}

	public static int romanToInt(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		int lastValue = map.get(s.charAt(s.length() - 1));
		result += lastValue; // add last character first

		for (int i = s.length() - 2; i >= 0; i--) {

			int current = map.get(s.charAt(i));

			if (current < lastValue) {
				result -= current;
			} else {
				result += current;
			}
			lastValue = current; // update reference

		}
		return result;
	}

	public static void main(String[] args) {

		String s = "MCMXCIV";

		System.out.println(romanToInt(s));

//		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
//
//		System.out.println(Arrays.toString(rotate(nums, 3)));

//		System.out.println(majorityElement2(nums));

//		System.out.println(removeDuplicates11(nums));

//		int[] nums = {1,1,2};
//		System.out.println(Arrays.toString(removeDuplicates(nums)));

//		int[] nums = { 3, 2, 2, 3 };
//		int val = 3;
//
//		System.out.println(removeElement(nums, val));

//		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//		int m = 3;
//		int[] nums2 = { 2, 5, 6 };
//		int n = 3;
//
//		System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

	}

}
