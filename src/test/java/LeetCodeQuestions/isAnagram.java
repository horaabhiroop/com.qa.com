package LeetCodeQuestions;

public class isAnagram {

	public static boolean isAnagram(String s, String t) {
		
		 if (s.length() != t.length()) return false;

		int[] freq = new int[26];

		for (char ch : s.toCharArray()) {
			freq[ch - 'a']++;
		}

		for (char ch : t.toCharArray()) {
			freq[ch - 'a']--;
		}

		for (int a : freq) {
			if (a != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String a= "ab";
		String b = "a";
		
		System.out.println(isAnagram(a, b));
	}

}
