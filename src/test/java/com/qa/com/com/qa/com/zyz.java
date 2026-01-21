package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class zyz {

	public static boolean isAnagrams(String s1, String s2) {

		int[] freq = new int[26];

		if (s1.length() != s2.length()) {
			return false;
		}

		for (char c : s1.toCharArray()) {
			freq[c - 'a']++;
		}
		for (char c : s2.toCharArray()) {
			freq[c - 'a']--;
		}

		for (int a : freq) {
			if (a > 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAnagaram2(String s1, String s2) {

		List<Character> list = new ArrayList<>();

		for (char c : s1.toCharArray()) {
			list.add(c);
		}

		for (char c : s2.toCharArray()) {
			if (list.contains(c)) {
				list.remove(Character.valueOf(c));
			} else {
				return false;
			}
		}
		return list.isEmpty();

	}

	// Find the First Repeated Character in a String | Input: "automation", →
	// Output: 'a'.

	public static Character firstRepeatedChar(String s1) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : map.keySet()) {
			if (map.get(c) >= 2) {
				return c;
			}
		}
		return null;
	}

	public static Character findTheDiff(String s, String y) {

		List<Character> list = new ArrayList<Character>();

		for (char c : s.toCharArray()) {
			list.add(c);
		}
		for (char c : y.toCharArray()) {
			if (list.contains(c)) {
				list.remove(Character.valueOf(c));
			} else {
				return c;
			}
		}
		return null;
	}

	public static char findTheDiff2(String s, String y) {

		int total = 0;

		for (char c : y.toCharArray()) {
			total += (int) c;
		}
		for (char c : s.toCharArray()) {
			total -= (int) c;
		}
		return (char) total;
	}

	public static String LongestCommonPrefix(String[] a) {

		if (a == null || a.length == 0)
			return "";

		String first = a[0];
		int x = 0;

		while (x < first.length()) {

			for (int i = 1; i < a.length; i++) {
				if (x >= a[i].length() || a[i].charAt(x) != first.charAt(x)) {
					return first.substring(0, x);
				}
			}
			x++;
		}
		return first.substring(0, x);
	}

	public static boolean isIsomorrphic(String s, String t) {

		if (s.length() != t.length())
			return false;

		Map<Character, Character> map = new LinkedHashMap<>();

		// If we insert a key, which is present in the map but the value of that key is
		// not mapping to the value which
		// I want to insert, return false;

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (map.containsKey(c1)) {

				// This condition is to validate the values of map and char
				if (map.get(c1) != c2) {
					System.out.println("+++");
					return false;
				}

			} else {

				if (map.containsValue(c2)) {
					return false;
				}
				map.put(c1, c2);
			}
		}
		return true;

	}

	public static String sortString(String a) {
		char[] ch = a.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

	public static void groupAnagram(String[] strs) {

		// ["eat", "tea", "tan", "ate", "nat", "bat"]

		Map<String, ArrayList<String>> map = new HashMap<>();

		for (String word : strs) {
			String key = sortString(word);

			map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
		}

		System.out.println(map);

	}
	
	public static HashMap<Integer, ArrayList<String>> groupingAccToLength(String[] strs) {
		//["one", "two", "three", "four", "six", "seven"]
		
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		
		
		
		for(int i=0; i < strs.length; i++) {
			int key = strs[i].length();
			 map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
		}
		return map;
	}
	
	  public static int mySqrt(int x) {

		  for (long i = 1; i * i <= x; i++) {
		        if ((i + 1) * (i + 1) > x) {
		            return (int) i;
		        }
		    }
	        return 0;
	    }
	  
	  public static int search(int[] nums, int target) {

	        int left = 0;
	        int right= nums.length-1;

	        while(left<right){
	            int middle = (left+right)/2;

	            if(target < middle){
	                right = middle -1;
	            }
	            else if(target > middle){
	                left = middle +1;
	            }
	            else if(middle == target){
	                return middle;
	            }
	        }
	        return -1;
	    }
	  
	  public static int sqrtUsingBinary(int x) {
		  if(x<2) return x;
		  
		  int left= 2;
		  int right= x/2;
		  int ans =0;
		  
		  while(left<=right) {
			  
			  int middle = (left+right)/2;
			  long square = (long) middle * middle;
			  
			  if(square == x) {
				  return middle;
			  }
			  else if(square < x) {
				 ans = middle;
				 left = middle + 1;
			  }
			  else {
				  right = middle - 1; 
			  }
			  
		  }
		  return ans;
	  }

	
	
	public static void main(String[] args) {

		// Input: "Listen" & "silent" -O/P true

		String s1 = "egg";
		String s2 = "add";
		String[] strs = { "one", "two", "three", "four", "six", "seven" };
		//groupAnagram(strs);
		//System.out.println(groupingAccToLength(strs));
		//System.out.println(mySqrt(20000000));
		
		System.out.println(sqrtUsingBinary(8));
		
//		String[] s = { "flower", "flower", "flower" };

		// System.out.println(isIsomorrphic(s1, s2));

		// System.out.println(isAnagrams(s1,s2));
		// System.out.println(isAnagaram2(s1, s2));

		// System.out.println(findTheDiff2(s1, s2));

	}

}
