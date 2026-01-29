package LeetCodeQuestions;

public class reverseInteger {

	public static int reverse(int x) {
		int sum = 0;
		while (x != 0) {
			sum = sum*10 + (x % 10);
			if(Integer.MAX_VALUE > x/10 || Integer.MIN_VALUE < x/10) return 0;
			x /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(reverse(1534236469));
	}

}
