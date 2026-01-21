package com.qa.com.com.qa.com;

public class reverseWithoutSpaces {

	public static void main(String[] args) {
		
		String str = "g nimm argo rPavaJevolI";
		
		char[] ch = str.toCharArray();
		
		char[] input = new char[ch.length];
		
		//1st loop to add spaces in the input array
		
		for(int i=0; i< ch.length; i++) {
			if(ch[i] == ' ') {
				input[i] = ch[i];
			}
		}
		
		//2nd loop to add while ignoring the spaces in the resultant array
		
		int j= input.length-1;
		
		for(int i=0; i < ch.length; i++) {
			
			if(ch[i] != ' ') {
				
				//Find next non space spot
				while(input[j] == ' ') {
					j--;
				}
				input[j]=ch[i];
				j--;
			}
		}
		System.out.println(String.valueOf(input));
	}

}
