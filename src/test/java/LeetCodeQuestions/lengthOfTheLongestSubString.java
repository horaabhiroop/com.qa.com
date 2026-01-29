package LeetCodeQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class lengthOfTheLongestSubString {

	public static int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
		int right = 0;
		Set<Character> set = new LinkedHashSet<>();

		for (char ch : s.toCharArray()) {
			while(set.contains(ch)) {
				set.remove(s.charAt(right));
				right++;
			}
			set.add(ch);
			maxLen = Math.max(maxLen, set.size());
		}
		return maxLen;
	}

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abba"));
		
	}
}
