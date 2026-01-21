package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class pratice {
	
	static String reversal(String s) {
		char[] ch =s.toCharArray();
		
		int j = ch.length-1;
		int i=0;
		while(i<j) {
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return String.valueOf(ch);
	}
	
	

	public static void main(String[] args) {
		
		
		String str = "I love Java Programming";
		StringBuilder sb = new StringBuilder();
		
		int start =0;
		int end =0;
		int maxCounter =0;
		int counter =0;
		
		
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				counter++;
			}
		}
	}

}
