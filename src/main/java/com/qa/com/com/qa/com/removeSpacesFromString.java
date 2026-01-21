package com.qa.com.com.qa.com;

public class removeSpacesFromString {

	public static void main(String[] args) {

		String str = "I love Java Programming";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
