package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class abc {

	public static Character repeatCount(String input) {
		int[] freq = new int[256];

		for (int i = 0; i < input.length(); i++) {
			freq[input.charAt(i)]++;
		}

		for (int i = 0; i < input.length(); i++) {
			if (freq[input.charAt(i)] == 1) {
				return input.charAt(i);
			}
		}
		return null;
	}

	public static Character repeatCountUsingHashMap(String input) {
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
		}
		for (char c : map.keySet()) {
			if (map.get(c) == 1) {
				return c;
			}
		}
		return null;
	}

	public static int[] SecondLargest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

//		if(arr.length<2) {
//			return -1;
//		}

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];
			} else if (secondLargest < arr[i] && largest != arr[i]) {
				secondLargest = arr[i];
			}
		}
		if (secondLargest != Integer.MIN_VALUE)
			return new int[] { -1, -1 };

		return new int[] { largest, secondLargest };
	}

	public static int[] removeDuplicates(int[] arr) {
		// 0,0,0,1,1,2,2,2,3,4,4

		int nonRepeat = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] != arr[i]) {
				arr[nonRepeat] = arr[i];
				nonRepeat++;
			}

		}
		System.out.println(nonRepeat);
		return arr;
	}

//	public static Set<Integer> removeDuplicatesUsingSet(int[] arr) {
//		
//		Set<Integer> set = new LinkedHashSet<Integer>();
//		
//		for(int a:arr) {
//			set.add(a);
//		}
//		return set;
//	}

	public static void removes2Duplicates(int[] arr) {

		// [1,1,1,2,2,3]
		int non = 2;

		for (int i = 2; i < arr.length; i++) {

			if (arr[i] != arr[non - 2]) {
				arr[non] = arr[i];
				non++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static int removeElement(int[] arr, int target) {
		// [3,2,2,3]
		int repeat = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != target) {
				System.out.println("--" + arr[i]);
				int temp = arr[i];
				arr[i] = arr[repeat];
				arr[repeat] = temp;
				repeat++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(repeat);
		return repeat;

	}

	public static String reverseString(String s) {
		char[] ch = s.toCharArray();

		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
			i++;
			j--;
		}
		return new String(ch);
	}

	public static int buyAndSellStock(int[] arr) {

		int minPrice = arr[0];
		int maxProfit = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < minPrice) {
				minPrice = arr[i];
			} else {
				maxProfit = Math.max(maxProfit, arr[i] - minPrice);
			}
		}
		return maxProfit;
	}

	public static void mergeSortedArrays(int[] a, int[] b) {

		// 4,5,7,0,0,0
		// 2,5,6

		int m = 2;
		int n = b.length - 1;
		int i = a.length - 1;

		while (m >= 0 && n >= 0) {
			if (a[m] > b[n]) {
				a[i--] = a[m--];
			} else {
				a[i--] = b[n--];
			}
		}
		if (n >= 0) {
			a[i--] = b[n--];
		}
		System.out.println(Arrays.toString(a));

	}

	public static void moveZerosToEnd(int[] a) {
		// 0,1,0,1,1,1,0,0,0,0

		int repeat = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				int temp = a[i];
				a[i] = a[repeat];
				a[repeat] = temp;
				repeat++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void maxConcecutive(int[] a) {
		int count = 0;
		int maxCount = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] == a[i]) {
				count++;
				maxCount = Math.max(maxCount, count);
			} else {
				count = 0;
			}
		}
		System.out.println(maxCount);
	}

	public static void singleNum(int[] a) {
		// 2,2,1
		int[] freq = new int[100];

		for (int i = 0; i < a.length; i++) {
			freq[a[i]]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[a[i]] == 1) {
				System.out.println(a[i]);
				return;
			}
		}
	}

	public static void singleNumXOR(int[] a) {
		int result = 0;

		for (int a1 : a) {
			result ^= a1;
		}
		// x^x =0
		// x^0 =x
		System.out.println(result);
	}

	public static boolean isSubSeq(String s1, String s2) {
		int i = 0;
		int j = 0;

		// s1 = abc
		// s2 = ahbgdc

		while (i < s1.length() && j < s2.length()) {

			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}

		}

		if (i == s1.length()) {
			return true;
		}
		return false;
	}

	public static int IndexOfFirstOccu(String s1, String s2) {
		// sadbutsad
		// sad

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				s1.substring(i, i + 2).equals(s2);
				return i;
			}
		}
		return -1;
	}

	public static String reverse(String a) {
		char[] ch = a.toCharArray();
		int i = 0;
		int j = a.length() - 1;

		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(ch);
	}

	public static int lengthOfTheLastWord(String a) {

		int j = a.length() - 1;

		// ignore the trailing spaces, to find the value of j
		while (j >= 0 && !Character.isLetter(a.charAt(j))) {
			j--;
		}

		if (j < 0)
			return 0;

		int i = j;

		while (i >= 0 && Character.isLetter(a.charAt(i))) {
			i--;
		}
		String word = a.substring(i + 1, j + 1);
		return word.length();
	}

	public static void lengthOfWordLast(String a) {
		int count = 0;
		int n = a.length() - 1;

		while (n >= 0) {
			if (a.charAt(n) != ' ') {
				count++;
			} else if (count > 0) {
				break;
			}
			--n;
		}
		System.out.println(count);
	}

	public static ArrayList<String> findWordsHavingChar(String[] words, char c) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {

			if (words[i].indexOf(c) >= 0) {
				list.add(words[i]);
			}
		}
		return list;
	}

	public static int countCharInWords(String a, String b) {

		// jewels = "aA", stones = "aAAbbbb"

		int count = 0;

		Set<Character> set = new HashSet<>();

		for (char c : a.toCharArray()) {
			set.add(c);
		}

		for (char c : b.toCharArray()) {
			if (set.contains(c)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static int countfreqOfVowelsConco(String s) {

		int maxVowelCount = 0;
		int maxConsoCount = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : map.keySet()) {

			char ch = c;
			int count = map.get(c);

			if (isVowel(c)) {
				maxVowelCount = Math.max(maxVowelCount, count);
			} else {
				maxConsoCount = Math.max(maxConsoCount, count);
			}
		}
		return maxVowelCount + maxConsoCount;

	}

	public static void SplitABalanceString(String s) {

		// RLRRLLRLRL
		int count = 0;
		int pair = 0;

		for (char c : s.toCharArray()) {
			if (c == 'R') {
				count++;
				System.out.println("Adding pair count" + count);
			} else if (c == 'L') {
				System.out.println("Sub pair count" + count);
				count--;
			}
			if (count == 0) {
				pair++;
			}

		}
		System.out.println(pair);

	}

	public static String reverseStr(String s, int k) {

		// s = "abcdefg", k = 2
		// "bacdfeg"
		String s1 = s.substring(0, k);
		String s2 = reverse(s1);
		String s3 = s.substring(k);

		return s2 + s3;
	}

	public static String largestOddNumber(String num) {

		// 52
		int a = Integer.valueOf(num);

		while (a > 0) {
			if (a % 2 == 0) {
				a = a / 10;
			} else {
				return String.valueOf(a);
			}
		}
		return "";

	}

	public static String longestCommonPrefix(String[] strs) {
		// strs = ["flower","flow","flight"]

		String first = strs[0];
		String output = "";

		for (int i = 1; i < strs.length; i++) {
			if (first.charAt(i) == strs[i].charAt(i)) {
				output += first.charAt(i);
			} else {
				break;
			}
		}
		return output;
	}

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

		int[] result = new int[k];

		for (int i = 0; i < k; i++) {
			result[i] = list.get(i).getKey();
		}

		return result;

	}

	public static int maxProfit(int[] prices) {

		int smallest = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (smallest > prices[i]) {
				smallest = prices[i];
			} else {
				maxProfit = Math.max(maxProfit, prices[i] - smallest);
			}
		}
		return maxProfit;

	}

	public static int lengthOfLongestSubstring(String s) {

		int right = 0;
		int maxLen =0;

		Set<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			while (set.contains(key)) {
				set.remove(s.charAt(right));
				right++;
			}
			set.add(key);
			maxLen = Math.max(maxLen, i-right+1);
		}
		return maxLen;
	}
	
	  public static int characterReplacement(String s, int k) {
		  
		  //s = "XYYX", k = 2
		  
		  HashMap<Character> 
		 
		  for(int i=0; i < s.length(); i++) {
			  
		  }
		  
		  
	        
	    }

	public static void main(String[] args) {

		String s = "abcabcbb";

		System.out.println(lengthOfLongestSubstring(s));

//		int[] nums = { 1, 2, 2, 3, 3, 3 };
//
//		System.out.println(Arrays.toString(topKFrequent(nums, 2)));

	}

}
