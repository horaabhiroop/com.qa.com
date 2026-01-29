package LeetCodeQuestions;

import java.util.Arrays;

public class moveZeros {
	
	public static int[] moveZeroes(int[] nums) {
		int nonZero=0;
		for(int i=0; i < nums.length; i++) {
			if(nums[i] != 0) {
				int temp= nums[i];
				nums[i] = nums[nonZero];
				nums[nonZero] = temp;
				nonZero++;
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] nums = {0,1,0,3,12};
		System.out.println(moveZeroes(nums));
	}

}
