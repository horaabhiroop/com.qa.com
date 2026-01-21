package com.qa.com.com.qa.com;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String input = "Java";
		boolean isPalindrome = true;
		
		
		int start = 0;
		int end = input.length()-1;
		while(start<end) {
			if(input.charAt(start) != input.charAt(end)) {
				isPalindrome= false;	
				break;
			}
			start++;
			end--;
		}
		
		System.out.println("Is the String Palindrome : " + isPalindrome);
	}

}
