package LeetCodeQuestions;

public class findTheDiffernce {

	public static char findTheDifference(String s, String t) {

		String input = s.concat(t);
		char ch = ' ';

		for (int i = 0; i < input.length(); i++) {
			ch ^= input.charAt(i);
		}
		return ch;
	}

	public static void main(String[] args) {

		String s = "abcd";
		String t = "abcdE";

		System.out.println(findTheDifference(s, t));
	}

}
