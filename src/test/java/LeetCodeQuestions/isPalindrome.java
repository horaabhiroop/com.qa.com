package LeetCodeQuestions;

public class isPalindrome {

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		int sum = 0;
		int orgValue = x;

		while (x > 0) {

			sum = sum * 10 + x % 10;
			x = x / 10;
		}
		
		return sum == orgValue;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(10));
	}

}
