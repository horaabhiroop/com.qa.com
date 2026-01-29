package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class findLonelyNum {

	public static List<Integer> findLonely(int[] nums) {

		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : nums) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}

		List<Integer> ls = new ArrayList<>();

		for(int num : nums) {
			if(freq.get(num) ==1 && !freq.containsKey(num - 1) && !freq.containsKey(num + 1)) {
				ls.add(num);
			}
		}
		return ls;

	}

	public static void main(String[] args) {

		int[] nums = { 2, 2, 3, 4 };
		System.out.println(findLonely(nums));
	}

}
