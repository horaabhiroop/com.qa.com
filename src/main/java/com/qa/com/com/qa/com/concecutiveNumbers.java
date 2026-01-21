package com.qa.com.com.qa.com;

public class concecutiveNumbers {

	public static void main(String[] args) {

		
		String a = "aaabbbcccccddaaa";
		
		int counter =1 ;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i < a.length(); i++){
			
			if(a.charAt(i-1) == a.charAt(i)) {	
				counter++;
			}
			else {
			sb.append(a.charAt(i-1));
			sb.append(counter);
			counter=1;
		}
		}
		//to print the last char and it's counter!
		sb.append(a.charAt(a.length() - 1));
		sb.append(counter);
		
		System.out.println(sb);
	}
}
