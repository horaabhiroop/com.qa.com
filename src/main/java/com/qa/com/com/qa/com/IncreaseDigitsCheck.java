package com.qa.com.com.qa.com;

import java.util.Arrays;

public class IncreaseDigitsCheck {

	public static void main(String[] args) {

		
//		For digits = [1, 2, 3], the output should be solution(digits) = [1, 2, 4];
//		For digits = [1, 2, 9], the output should be solution(digits) = [1, 3, 0];
//		For digits = [9, 9, 9], the output should be solution(digits) = [1, 0, 0, 0]
		
		int[] digits = {9,2,9};
		
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				System.out.println(Arrays.toString(digits));
	             return;
			}
			 digits[i] = 0;
			}
			
		
		int[] result = new int[digits.length+1];
		result[0] = 1;
		
		System.out.println(Arrays.toString(result));
	}

}
