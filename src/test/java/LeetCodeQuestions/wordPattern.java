package LeetCodeQuestions;

import java.util.HashMap;

public class wordPattern {

	public static boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> map = new HashMap<>();

		String[] str = s.split(" ");

		if (pattern.length() != str.length) {
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {

			char key = pattern.charAt(i);
			String value = str[i];

			if (map.containsKey(key)) {
				if (!value.equals(map.get(key))) {
					return false;
				}
			} else {
				if (map.containsValue(value)) {
					return false;
				}
				map.put(key, value);
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String pattern = "aaaa";
		String s = "dog dog dog dog";

		System.out.println(wordPattern(pattern, s));
	}

}
