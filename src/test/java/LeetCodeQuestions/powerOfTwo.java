package LeetCodeQuestions;

public class powerOfTwo {

	public static boolean isPowerOfTwo(int n) {
		
		 // base cases
	    if (n == 1) return true; 
	    if (n <= 0 || n % 2 != 0) return false;
	    
	    return isPowerOfTwo(n/2);
	}

	public static void main(String[] args) {

		System.out.println(isPowerOfTwo(2));
	}

}
