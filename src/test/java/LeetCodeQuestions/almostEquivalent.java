package LeetCodeQuestions;

public class almostEquivalent {

	public static boolean checkAlmostEquivalent(String word1, String word2) {
		int freq[] = new int[26];

		if (word1.length() != word2.length()) {
			return false;
		}

		for (char ch : word1.toCharArray()) {
			freq[ch - 'a']++;
		}

		for (char ch : word2.toCharArray()) {
			freq[ch - 'a']--;
		}
		
		for(int a: freq) {
			if(a > 3) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String a = "aaaa";
		String b = "a";
		
		System.out.println(checkAlmostEquivalent(a, b));
	}

}
