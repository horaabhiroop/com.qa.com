package LeetCodeQuestions;

public class IndexOfFirstOccurance {

	public static int strStr(String haystack, String needle) {

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if(haystack.substring(i, i+needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		String haystack = "";
		String needle = "";
		
		System.out.println(strStr(haystack, needle));
		
	}

}
