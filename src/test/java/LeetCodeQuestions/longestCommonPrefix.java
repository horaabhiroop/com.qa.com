package LeetCodeQuestions;

public class longestCommonPrefix {

	public static String common(String s1, String s2) {

		int n = Math.min(s1.length(), s2.length());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				sb.append(s1.charAt(i));
			}
		}
		return new String(sb);

	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		String input = strs[0];
		for(int i=1; i < strs.length; i++) {
			input = common(input, strs[i]);
			if(input.isEmpty()) return "";
		}
		return input;
	}

	public static void main(String[] args) {

		String[] strs = {"interspecies","interstellar","interstate"};
		System.out.println(longestCommonPrefix(strs));
		
	}

}
