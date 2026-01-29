package LeetCodeQuestions;

public class missingNum {

	public static int missingNumber(int[] nums) {

		int n = nums.length;

		int sum = (n * (n + 1)) / 2;
		int actSum =0;

		for(int i=0; i < nums.length; i++) {
			actSum += nums[i]; 
		}
		return sum - actSum;
	}

	public static void main(String[] args) {

		int[] arr = {3,0,1};
		System.out.println(missingNumber(arr));
	}

}
