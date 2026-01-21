package com.qa.com.com.qa.com;

public class ReversalOnPlace {
	
	static String reverse(String str) {
		char[] s1 = str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			char c = s1[i];
			s1[i] = s1[j];
			s1[j]=c;
			i++;
			j--;
		}
		return new String(s1);
	}


	public static void main(String[] args) {
		
		//Do not use split.
		
      String input = "I love Java Programming";
      
      int start =0;
      int end =0;
      StringBuilder sb = new StringBuilder();
      
      while(end<input.length() ) {
    	  
    	  if(input.charAt(end) != ' ' && end < input.length()) {
    	  end++;
    	  }
    	  else {
    		  String temp =input.substring(start, end);
    		  sb.append(reverse(temp)).append(" ");
    		  start = end+1;
    		  end=start;
    		  
    	  }
    	  
	}
      if(start<input.length()) {
    	  String lastWord = input.substring(start);
    	  sb.append(reverse(lastWord));
      }
      System.out.println(sb);
	}
}
