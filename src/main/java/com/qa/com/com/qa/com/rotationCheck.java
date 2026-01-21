package com.qa.com.com.qa.com;

public class rotationCheck {
	
	static boolean rotateCheck(String a, String b) {
		
		if(a.length() != b.length()) {
			return false;
		}
		
		String temp = a+a;
		
		if(temp.contains(b)) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		String  a = "waterbottle";
		
		String b = "erbottlewat";
		
		System.out.println(rotateCheck(a,b));
	}

}
