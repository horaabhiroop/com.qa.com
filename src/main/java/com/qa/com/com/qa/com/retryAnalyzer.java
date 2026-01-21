package com.qa.com.com.qa.com;

import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer{
	
	private int count =0;
	private static final int maxCount =3;
	

	@Override
	public boolean retry(ITestResult result) {
		while(count<maxCount) {
			count++;
			return true;
			
			
		}
		return false;
		
	}

}
