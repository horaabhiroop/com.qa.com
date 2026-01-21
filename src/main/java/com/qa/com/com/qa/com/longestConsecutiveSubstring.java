package com.qa.com.com.qa.com;

public class longestConsecutiveSubstring {
	
	public static String longest(String s1) {
		
		int currentLength =1;
		int start=0;
		int max=1;
		int maxStart =0;
		
		
		for(int i=1; i< s1.length(); i++) {
			
			if((int)s1.charAt(i) == (int) s1.charAt(i-1)+1) {
				currentLength++;
			}
			else {
				currentLength = 1;
				start = i;
			}
			
			if(currentLength>max) {
				max = currentLength;
				maxStart = start;
			}
			
		}
		 return s1.substring(maxStart, maxStart + max);
		
	}

	public static void main(String[] args) {

		String s1 = "abcdxyzabc";
		
		System.out.println(longest(s1));
		
		
		
		
		
	}

}
