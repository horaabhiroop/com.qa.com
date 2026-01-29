package LeetCodeQuestions;

public class isSubsequence {

	public static boolean isSubsequence(String s, String t) {
		if (s.length() == 0)
			return true;
		int j = 0;

		for (int i = 0; i < t.length() && j < s.length(); i++) {
			if (t.charAt(i) == s.charAt(j)) {
				j++;
			}
		}
		if (j == s.length()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String s = "ace";
		String t = "abcde";

		System.out.println(isSubsequence(s, t));

	}

}
