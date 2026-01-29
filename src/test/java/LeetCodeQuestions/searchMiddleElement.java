package LeetCodeQuestions;

public class searchMiddleElement {

	public static int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (nums[middle] == target) {
				return middle;
			}
			if(left <= middle) {
				
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		System.out.println(search(nums, target));
	}

}
