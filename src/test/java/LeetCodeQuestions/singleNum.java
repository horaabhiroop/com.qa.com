package LeetCodeQuestions;

public class singleNum {
	
	public static int singleNumber(int[] nums) {
		
		int sum =0;
		
		for(int i=0; i < nums.length; i++) {
			sum ^= nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] nums = {4,1,2,1,2};
		
		System.out.println(singleNumber(nums));
	}

}
