package com.qa.com.com.qa.com;

import java.util.HashMap;
import java.util.List;

public class longestCommonPrefix {

	public static String common(String s1, String s2) {

		StringBuilder sb = new StringBuilder();

		int n = Math.min(s1.length(), s2.length());

		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				sb.append(s1.charAt(i));
			} else {
				break;
			}
		}
		return sb.toString();
	}

	public static String longestCommonPrefix(String[] arr) {
		String first = arr[0];

		for (int i = 1; i < arr.length; i++) {

			first = common(first, arr[i]);
		}
		return first;
	}

public static List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s1 : strs){
            char[] ch = s1.toCharArray();
            Arrays.sort(ch);
            map.computeIfAbsent(ch, k -> new ArrayList<>)
        }
    }
}

	public static void main(String[] args) {

		String[] arr = { "flower", "flow", "florning" };

		System.out.println(longestCommonPrefix(arr));

	}

}
