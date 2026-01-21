package com.qa.com.com.qa.com;

public class mixCharAndNumber {
	
	static String mixChartoInt(String data) {
		int counter =1;
		StringBuilder s = new StringBuilder();
		
		for(int i=1; i < data.length(); i++) {
			
			if(data.charAt(i-1) == data.charAt(i)) {
				counter++;
			}
			else {
				s.append(data.charAt(i-1));
				s.append(counter);
				counter=1;
			}
		}
		s.append(data.charAt(data.length()-1));
		s.append(counter);
		
		return s.toString();
		
	}
	
//	static String mixIntToChar(String s) {
//		
//	}

	public static void main(String[] args) {

		
		String data="mmmaaabbba";
		
		//System.out.println(mixChartoInt(data));
		
		
		String d1 ="m3a3b3a1";
		
		StringBuilder sb = new StringBuilder();
		
		int count=0;
		
		for(int i=0; i < d1.length(); i++) {
			
			char c = d1.charAt(i);
			i++;
			
			count = d1.charAt(i)-'0';
			
			for(int j=0; j<count; j++ ) {
				sb.append(c);
			}
			
			
		}
		System.out.print(sb);	
	}

}
