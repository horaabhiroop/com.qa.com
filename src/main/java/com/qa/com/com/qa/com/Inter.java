package com.qa.com.com.qa.com;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inter {

	public static void main(String[] args) throws InterruptedException {
		
		int[] a = {9,9,9}; //2,0,0
		
		for(int i=a.length-1; i >= 0; i--) {
			
			if(a[i]<9) {
				a[i]++;
				System.out.println(Arrays.toString(a));
				return;
			}
			else {
				a[i] = 0;
			}
		}
		int[] a1 = new int[a.length+1];
		a1[0] = 1;
		System.out.println(Arrays.toString(a1));
		
	}

}


