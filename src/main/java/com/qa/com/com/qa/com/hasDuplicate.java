package com.qa.com.com.qa.com;

public class hasDuplicate {

	public static int hasDuplicate(int[] nums) {

		int cand = 0;
		int point = 0;

		for (int i = 0; i < nums.length; i++) {
			if (point == 0) {
				cand = nums[i];
			} else if (cand == nums[i]) {
				point++;
			} else {
				point--;
			}
		}
		return cand;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 2, 2 };
		System.out.println(hasDuplicate(arr));
	}

}
