package com.qa.com.com.qa.com;

public class largestWordInAString {

	public static void main(String[] args) {

		String str = "I love Java Programming";
		
		int start =0;
		int end=0;
		int maxCount=0;
		int initalCounter=0;
		String largestWord = "";
		
		while(end<str.length()) {
			if(str.charAt(end) != ' ') {
				end++;
				initalCounter++;
			}
			else {
				if(initalCounter > maxCount) {
					maxCount = initalCounter;
					largestWord = str.substring(start,end);
				}
				start = end+1;
				end = start;
				initalCounter=0;
			}
		}
		  // CHECK LAST WORD (VERY IMPORTANT)
		  if (initalCounter > maxCount) {
		        largestWord = str.substring(start);
		    }
		
		System.out.println(largestWord.length());
		
	}

}
