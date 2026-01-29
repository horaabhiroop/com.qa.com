package LeetCodeQuestions;

import java.util.Arrays;

public class searchRange {

	public static int[] searchRange(int[] nums, int target) {
//		Input:  nums = [5,7,7,8,9,10], target = 8
//		Output: [3,4]
		int[] result = new int[] { -1, -1 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				result[0] = i;

				if (i < nums.length && nums[i + 1] == target) {
					i++;
					result[1] = i;
					break;
				}

			}
		}
		return result;

	}

	public static int findFirstOcc(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;
		int id = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				id = mid;
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return id;

	}

	public static int findLastOcc(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int id = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				id = mid;
				low = mid + 1;
			} else if (nums[mid] < target) {
				low = mid +1;
			} else {
				high = mid-1;
			}

		}
		return id;
	}

	public static void main(String[] args) {

		int[] nums = {5,7,7,8,8,8,8,8,8,10};
		int target = 8;
		
		int[] result = new int[2];
		result[0] = findFirstOcc(nums, target);
		result[1] = findLastOcc(nums, target);
		
		System.out.println(Arrays.toString(result));

	}

}
