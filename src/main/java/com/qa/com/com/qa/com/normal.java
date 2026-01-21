package com.qa.com.com.qa.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class normal {

	public static String reverseOnlyLetters(String a) {
		char[] ab = a.toCharArray();

		int i = 0;
		int j = ab.length - 1;

		while (i < j) {
			if (!Character.isLetter(ab[i])) {
				i++;
			} else if (!Character.isLetter(ab[j])) {
				j--;
			} else {
				char temp = ab[i];
				ab[i] = ab[j];
				ab[j] = temp;
				i++;
				j--;
			}

		}
		return String.valueOf(ab);
	}

	public static String reverse(String a) {
		int i = 0;
		int j = a.length() - 1;

		char[] ch = a.toCharArray();

		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(ch);
	}

	public static StringBuilder reverseEachWord(String a) {

		String[] a1 = a.split(" ");

		StringBuilder ab = new StringBuilder();

		for (int i = 0; i < a1.length; i++) {
			ab.append(reverse(a1[i]));
			ab.append(" ");
		}
		return ab;
	}

	public static boolean isPalindrome(String a) {

		int i = 0;
		int j = a.length() - 1;

		if (a.length() <= 1)
			return true;

		while (i < j) {
			if (a.charAt(i) != a.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}

		return true;
	}

	public static int longestPalindrome(String s) {

		int maxLength = 0;
		int length = 0;

		Set<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j <= s.length(); j++) {

				String sub = s.substring(i, j);
				if (isPalindrome(sub)) {
					if (maxLength < sub.length()) {
						maxLength = sub.length();
						set.clear();
						set.add(sub);
					}
				}

			}
		}
		System.out.println(set);
		return maxLength;
	}

	public static boolean validParanthesis(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char currentChar = s.charAt(i);

			if (currentChar == '[' || currentChar == '{' || currentChar == '(') {
				stack.push(currentChar);
			} else if (currentChar == ']' || currentChar == '}' || currentChar == ')') {

				if (stack.isEmpty())
					return false;

				char top = stack.pop();

				if (currentChar == ']' && top != '[' || currentChar == '}' && top != '{'
						|| currentChar == ')' && top != '(') {
					return false;
				}

			}
		}
		return stack.isEmpty();
	}

	public static void longestSubString(String s) {
		// s = "abcabcb"

		List<Character> list = new ArrayList<>();

		int start = 0;
		int maxLength = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (list.contains(ch)) {
				list.remove(0);
				start++;
			}

			list.add(ch);
			maxLength = Math.max(maxLength, list.size());

		}
		System.out.println(maxLength);
	}

	public static int count(int[] a) {
		// {1, 1, 0, 1, 1, 1};

		int count = 0;
		int maxCount = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				count++;
				maxCount = Math.max(maxCount, count);
			} else {
				count = 0;
			}
		}
		return maxCount;

	}

	public static int[] TwoSum(int[] a, int target) {

		List<Integer> list = new ArrayList<Integer>();

		// {2,6,5,8,11}
		// 14

		for (int i = 0; i < a.length; i++) {

			int complement = target - a[i];
			// 14-8

			if (!list.contains(complement)) {
				list.add(a[i]);
			} else {
				return new int[] { list.indexOf(complement), i };
			}
		}
		return new int[0];
	}

	public static void findAllSubArrays(int[] a) {

		// {1,2,3,4,5,6}

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				for (int k = i; k <= j; k++) {
					System.out.print(k + 1 + " ");
				}
				System.out.println();

			}
		}
	}

	public static int SumofArray(int[] a) {
		int add = 0;

		for (int a1 : a) {
			add += a1;
		}
		return add;
	}

	public static String patternProblem(int[] a) {

		// I/P - {2,1,4,1,5,3,3,5,1}
		// O/p - [25,23,22,18,17,12,9,6,1]

		int[] newInt = new int[a.length];

		// 25
		newInt[0] = SumofArray(a);
		int j = 0;

		for (int i = 1; i < a.length; i++) {
			newInt[i] = newInt[i - 1] - a[j];
			j++;
		}
		return Arrays.toString(newInt);

	}

	public static String moveZerosToEnd(int[] a) {

		int nonZero = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				int temp = a[i];
				a[i] = a[nonZero];
				a[nonZero] = temp;
				nonZero++;
			}
		}
		return Arrays.toString(a);
	}

	public static int secondLargest(int[] a) {
		int largest = Integer.MIN_VALUE;
		int secondL = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (largest < a[i]) {

				secondL = largest;
				largest = a[i];
			} else if (secondL < a[i] && largest != a[i]) {
				secondL = a[i];
			}

		}
		return secondL;
	}

	public static int[] removeDuplicates(int[] a) {

		// {0,0,1,1,1,2,2,3,3,3,4}

		if (a.length == 0)
			return new int[0];

		// 0,1
		int k = 1;

		for (int i = 1; i < a.length; i++) {

			if (a[i - 1] != a[i]) {
				a[k] = a[i];
				k++;
			}
		}
		return Arrays.copyOf(a, k);
	}

	public static int longestSubString1(String a) {

		// a = abcabcbb;

		int end = 0;
		int maxCount = 0;

		List<Character> list = new ArrayList<Character>();

		for (int start = 0; start < a.length(); start++) {

			// if element is not present add into the list.

			if (!list.contains(a.charAt(start))) {
				list.add(a.charAt(start));
				start++;
				maxCount = Math.max(maxCount, list.size());
			} else {
				list.remove(Character.valueOf(a.charAt(end)));
				end++;
			}
		}
		return maxCount;
	}

	public static boolean ValidAnagram(String a, String b) {

		int[] freq = new int[256];

		if (a.length() != b.length())
			return false;

		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();

		for (char c : c1) {
			freq[c]++;
		}
		for (char a1 : c2) {
			freq[a1]--;
		}

		for (int entry : freq) {
			if (entry != 0) {
				return false;
			}
		}
		return true;
	}

	public static String removeDuplicates2(int[] a) {

		Set<Integer> set = new HashSet<Integer>();

		for (int a1 : a) {
			set.add(a1);
		}

		int[] brew = new int[set.size()];
		int j = 0;

		for (int a2 : set) {
			brew[j++] = a2;
		}
		return Arrays.toString(brew);
	}

	public static boolean hasDuplicate(int[] a) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}

		for (int a1 : map.keySet()) {
			if (map.get(a1) > 1) {
				return true;
			}
		}
		return false;
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> hm = new HashMap();

		for (String s : strs) {

			char[] ch = s.toCharArray();

			Arrays.sort(ch);

			String s1 = new String(ch);

			hm.putIfAbsent(s1, new ArrayList<String>());
			hm.get(s1).add(s);
		}
		return new ArrayList<List<String>>(hm.values());

	}

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		
		List<Integer>[] buckets = new List[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
		}
		
		//adding freq and nums in bucket
		
		for(int key : hm.keySet()) {
			int freq = hm.get(key);
			if(buckets[freq] == null) {
				buckets[freq] = new ArrayList<>();
		}
			buckets[freq].add(key);
		}
		
		int[] result = new int[k];
		int index =0;
		
		for(int i= buckets.length-1; i >=0 && index < k; i--) {
			if(buckets[i] != null) {
				for(int num: buckets[i]) {
					result[index++]= num;
					if(index == k) break;
				}
			}
		}
		return result;

	}
	
	 public static int[] productExceptSelf(int[] nums) {
		 
		 int[] result = new int[nums.length];
		 int index =0;
		 int sum =1;
		 int temp = 1;
		 
		 for(int i=0; i < nums.length; i++) {
			 
			 temp = nums[i];
			 nums[i] =1;
			 
			 for(int a : nums) {
				 //System.out.println(a);
				 sum *= a;
			 }
			 result[index++] = sum;
			 sum =1;
			 nums[i] = temp;
		 }
		 return result;
    }

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4};
		

		System.out.println(Arrays.toString(productExceptSelf(a)));

	}

}
