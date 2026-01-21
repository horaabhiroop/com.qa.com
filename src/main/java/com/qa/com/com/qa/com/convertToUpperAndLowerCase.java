package com.qa.com.com.qa.com;

public class convertToUpperAndLowerCase {

	public static void main(String[] args) {
		
		
		String s = "I love Java Programming";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			//To convert all the char in Upper Case
			//Since the ASCII value of a & z are higher, so need to subtract 32
			if(c >= 'a' && c <= 'z') {
				char a = (char) (c-32);
				sb.append(a);
			}
			//To convert all the char's in lower case.
			//since the ASCII value of A & Z is lower, then need to add 32.
			if(c >= 'A' && c <= 'Z') {
				char a = (char) (c+32);
				sb.append(a);
			}
			else {
				sb.append(c);
			}
			//sb.append(" ");
	}
		System.out.println(sb);
	}

}
