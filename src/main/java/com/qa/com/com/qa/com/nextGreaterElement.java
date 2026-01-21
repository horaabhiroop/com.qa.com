package com.qa.com.com.qa.com;

import java.util.Stack;

public class nextGreaterElement {

	public static void main(String[] args) {

		
		int[] a= {4,5,2,25};
		
//		for(int i=0; i < a.length; i++) {
//			
//			int nextGreater = -1;
//			
//			for(int j=i+1; j < a.length; j++) {
//				
//				if(a[j]>a[i]) {
//					nextGreater = a[j];
//					break;
//				}
//			}
//			System.out.println(a[i] + "   " + nextGreater);
//		}
		
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i < a.length; i++) {
			
			while(!stack.isEmpty() && a[i]>stack.peek()) {
				int smaller = stack.pop();
				System.out.println(smaller + ":" + a[i]);	
			}
			stack.push(a[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + ":" + "-1");
		}
		
		
	}


}
