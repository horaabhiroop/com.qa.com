package com.qa.com.com.qa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;


public class practice {
	
	public static int LargestSecond(int[] a) {
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i < a.length; i++) {
			if(a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			}
			else if((a[i]> secondLargest) && (a[i] < largest)) {
				secondLargest =a[i];
			}
		}
		return secondLargest;
	}
	
	
	
	
	public static int removeDuplicateElement(int[] a) {
		
		int nonRepeat = 1;
		
		for(int i=1; i < a.length; i++) {
			
			if(a[i-1] != a[i]) {
				a[nonRepeat] =a[i];
				nonRepeat++;
			}
		}
		return nonRepeat;
			
	}
	
	
	public static String removeDuplicateFromSortedArray(int[] a) {
		
		int k=2;// Don't care about the first two elements.
		
		for(int i=2; i < a.length; i++) {
			
			if(a[i] != a[k-2]) {
				a[k]=a[i];
				k++;
			}
		}
		return Arrays.toString(a);
		
	}
	
	public static int removeElement(int[] a, int targetValue) {
		
		int nonTarget=0;
		
		for(int i=0; i < a.length; i++) {
			if(a[i] != targetValue) {
				a[nonTarget] = a[i];
				nonTarget++;
			}
		}
		return nonTarget;
	}
	
	public static String moveZeroToEnd(int[] a) {
		int nonZero=0;
		
		for(int i=0; i < a.length; i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i]=a[nonZero];
				a[nonZero] = temp;
				nonZero++;
				
			}
		}
		return Arrays.toString(a);
	}
	
	public static String nonRepeatChar(String s) {
		
		char[] ch = s.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
		for(char c : map.keySet()) {
			if(map.get(c) == 1) {
				return String.valueOf(c);
			}
		}
		return "";
		
	}
	
	public static char nonRepeat(String s) {
		
		
		//Push the char in array
		
		int[] freq = new int[256];
		
		//pushed the char in the freq array
		for(int i=0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		
		//now will have to iterate to find the index having 1 
		for(int i=0; i < s.length(); i++) {
			if(freq[s.charAt(i)] ==1) {
				return s.charAt(i);
			}
		}
		return '-';
	}
	
	public static String reversal(String s) {
		//automation
		
		int i=0;
		int j=s.length()-1;
		char[] ch = s.toCharArray();
		while(i<j) {
			char temp = ch[i];
			ch[i]= ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(ch);
	}
	
	public static boolean anagaramCheck(String s1, String s2) {
		
		//s1 = "listen", s2 = "silent"
		
		if(s1.length() != s2.length()) return false;
		
		int[] freq = new int[256];
		
		for(int i=0; i < s1.length(); i++) {
			freq[s1.charAt(i)]++;
			freq[s2.charAt(i)]--;
		}	
		//need to check if freq array is empty.
		for(int a : freq) {
			if(a != 0) return false;
		}
		return true;
		
	}
	
	public static int duplicate(int[] a) {
		
		HashMap<Integer, Integer> hm = new LinkedHashMap<>();
		
		for(int a2 : a) {
			if(hm.containsKey(a2)) {
				return a2;
			}
			else {
				hm.put(a2, 1);
			}
		}
		return -1;
		
		
	}
	
	public static void missingNo(int[] a) {
		
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int i=0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		
		List<Integer> ls = new ArrayList<>();
		
		for(int i=a[0]; i< a[a.length-1]; i++) {
			
			if(!set.contains(a[i])) {
				ls.add(a[i]);
			}
		}
		System.out.println(ls);
	}

	public static void main(String[] args) {
		
		int[] a = {1, 2, 4, 5};
		
//		String input = "automation";
//		
//		String s1 = "listen";
//		String s2 = "silent";
//		System.out.println(anagaramCheck(s1, s2));
		
		missingNo(a);
		
	}

}
