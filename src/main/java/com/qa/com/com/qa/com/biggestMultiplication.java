package com.qa.com.com.qa.com;

public class biggestMultiplication {

	public static void main(String[] args) {
		
		int[] a = {-2,-3,6,0};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i < a.length; i++) {
			
			int product = 1;
			
			for(int j=i; j < a.length; j++) {
				
				 product *= a[j];
				 max = Math.max(product, max);
			}
		}
		System.out.println(max);
	}

}
