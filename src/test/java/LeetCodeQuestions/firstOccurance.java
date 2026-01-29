package LeetCodeQuestions;

public class firstOccurance {

	public static int strStr(String haystack, String needle) {

		for (int i = 0; i <= haystack.length()-needle.length(); i++) {
				if (haystack.substring(i, i+needle.length()).equals(needle)) {
					return i;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
 
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));
		

	}

}
