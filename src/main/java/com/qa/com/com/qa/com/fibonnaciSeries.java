package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class fibonnaciSeries {

	public static boolean isIsomorphic(String s1, String s2) {

		Map<Character, Character> map = new HashMap<>();

		if (s1.length() != s2.length())
			return false;

		for (int i = 0; i < s1.length(); i++) {

			char key = s1.charAt(i);
			char value = s2.charAt(i);

			if (map.containsKey(key)) {
				if (value != map.get(key)) {
					return false;
				}
			} else {
				if (map.containsValue(value)) {
					return false;
				} else {
					map.put(key, value);
				}
			}

		}
		return true;

	}

	public static int isPrefixOfWord(String sentence, String searchWord) {

		String[] arr = sentence.split(" ");

		int len = searchWord.length();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() >= len) {
				if (arr[i].substring(0, len).equals(searchWord)) {
					return i + 1;
				}
			}

		}
		return -1;
	}

	public static int[] plusOne(int[] digits) {

		// [9] -> [1, 0]

//		Input: digits = [1,2,3]
//		Output: [1,2,4]

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}

	public static int reverse(int x) {

//		Input: x = 123
//		Output: 321
		int sum = 0;
		while (x != 0) {
			int reverse = x % 10;
			sum = (sum * 10) + reverse;
			x /= 10;
		}
		return sum;
	}

	public static int lengthOfLastWord(String s) {

		int j = s.length() - 1;

		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(j) != ' ') {
				if (s.charAt(i) == ' ') {
					return s.substring(i, j).length();
				}
			} else {
				j--;
			}
		}
		return -1;
	}

	public static int[] searchRange(int[] nums, int target) {

		int[] result = new int[2];

		result[0] = result[1] = -1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				result[0] = i;
				while (i < nums.length && nums[i + 1] == target) {
					i++;
					result[1] = i;
					break;
				}
			}
		}
		return result;

	}

	public static boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> map = new HashMap<>();

		String[] input = s.split(" ");
		char[] ch = pattern.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(ch[i])) {
				if (!input[i].equals(ch[i])) {
					return false;
				} else {
					if (map.containsValue(input[i])) {
						return false;
					}
					map.put(ch[i], input[i]);
				}
			}
		}
		return true;
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (String a1 : strs) {
			char[] ch = a1.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(a1);
		}

		return new ArrayList<>(map.values());
	}

	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : map.keySet()) {
			if (map.get(ch) <= 1) {
				return s.indexOf(ch);
			}
		}
		return -1;
	}

	public static int firstUniqCharByInt(String s) {

		int[] freq = new int[26];

		for (char ch : s.toCharArray()) {
			freq[ch - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

	public static int maxSubArrayLen(int[] nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<>();	
		map.put(0, -1);   // base case
		
		int res =0;
		int prefSum =0;
		
		for(int i=0; i < nums.length; i++) {
			res += nums[i];
			
			if(map.containsKey(prefSum - res)) {
				res = Math.max(prefSum, i - map.get(prefSum -k));
			}
			
			if(!map.containsKey(prefSum)) {
				map.put(prefSum, i);
			}
		}
		return res;
	}

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int a : nums) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		// 👇 Keep key + value together
		List<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());
		Collections.sort(arr, (a,b) -> b.getValue() - a.getValue());
		int[] result = new int[k];

		for (int i = 0; i < k; i++) {
			result[i] = arr.get(i).getKey();
		}
		return result;

	}
	
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		int right = 0;
		int maxLen =0;
		
		for(int i=0; i < s.length(); i++) {
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(right));
				right++;
			}
			set.add(s.charAt(i));
			maxLen = Math.max(maxLen, set.size());
		}
		return maxLen;
	}
	
	public static String common(String s1, String s2) {
		int n = Math.min(s1.length(), s2.length());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < n; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				sb.append(s1.charAt(i));
			}
			else {
				break;
			}
		}
		return sb.toString();
	}
	
	public static String commonPrefix(String[] args) {
		
		String res = args[0];
		for(int i=1; i < args.length; i++) {
			res=common(res, args[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		
		String[] a1 = {"flower", "flow", "floght"};
		System.out.println(commonPrefix(a1));
		
//		System.out.println(lengthOfLongestSubstring("pwwkew"));

//		int[] arr = { 4,1,-1,2,-1,2,3 };
//		
//		System.out.println(Arrays.toString(topKFrequent(arr, 2)));

//		System.out.println(maxSubArrayLen(arr, 3));

//		System.out.println(firstUniqCharByInt("loveleetcode"));

//		String[] key = {"eat","tea","tan","ate","nat","bat"};
//		
//		System.out.println(groupAnagrams(key));

//		int[] nums = { 1, 3 };
//		int target = 1;
//
//		System.out.println(Arrays.toString(searchRange(nums, target)));

//		System.out.println(wordPattern("abba", "dog cat cat dog"));

//		System.out.println(reverse(123));

//		System.out.println(lengthOfLastWord("a"));

//		reverse(-123);

		// System.out.println(isIsomorphic("egg", "adi"));

//		System.out.println(isPrefixOfWord("i am tired", "you"));

//		int[] arr = { 8, 9, 9, 9 };
//
//		System.out.println(Arrays.toString(plusOne(arr)));
	}

}
