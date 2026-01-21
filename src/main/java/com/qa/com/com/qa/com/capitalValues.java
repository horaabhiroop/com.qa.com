package com.qa.com.com.qa.com;

public class capitalValues {

	public static void main(String[] args) {

		String data="i am a good boy"; 
		//O/p---->I aM A gooD boY
		
		String[] str = data.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < str.length; i++) {
			
			char c =Character.toUpperCase(str[i].charAt(str[i].length()-1));
			
			String s1 = str[i].substring(0, str[i].length()-1)+c;
			
			sb.append(s1);
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
