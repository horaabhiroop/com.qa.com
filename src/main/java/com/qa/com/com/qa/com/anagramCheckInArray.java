package com.qa.com.com.qa.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class anagramCheckInArray {

	public static void main(String[] args) {
		
		String input = "hello apple pie";
		
		String[] words = input.split(" ");
		String result = "-1";
		int maxRepeat = 1;
		
		for(String word: words) {
			  Map<Character, Integer> freq = new HashMap<>();
			  
			  for(char c : word.toCharArray()) {
				  freq.put(c, freq.getOrDefault(c, 0) + 1);
			  }
			  
			  // Find max repeating character in this word
			  
			  int currentMax=1;
			  for(int count: freq.values()) {
				  if(count>currentMax) {
					  currentMax = count;
				  }
			  }
			  
			  // Update result if this word has higher repetition
			  if(currentMax>maxRepeat) {
				  maxRepeat = currentMax;
				  result = word;
			  }
			  
		}
		System.out.println(result);
		
	}

}
