package com.qa.com.com.qa.com;

public class vowelAndConsonantCount {

	public static void main(String[] args) {
		
		int vowelCounter = 0;
		int consonantCounter =0;
		
		String str = "I love Java Programming";
		
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowelCounter++;
			}
			else {
				if((ch >= 'a' && ch <= 'z') || (ch>='A' && ch<='Z')) {
					consonantCounter++;
				}
			}
		}
		
		System.out.println("Vowel count " + vowelCounter);
		System.out.println("Consonants Count " + consonantCounter);
	}

}
