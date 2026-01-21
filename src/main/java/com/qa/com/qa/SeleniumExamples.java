package com.qa.com.qa;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExamples {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		//locator
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1500)", "");
		
		js.executeScript("arguments[0].scrollIntoView()", locator);
		
		
		
		//1. clicking on the radio button
		
//		driver.findElement(By.xpath("//div[@id='radio-btn-example']//label[2]/input")).click();
		

		//2. clicking on the drop down 
		
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		
//		Select sel = new Select(dropdown);
//		
//		sel.selectByValue("option2");
		

		//3. Checkbox Example
		
//		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		//4. Switch Window Example
		
//		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
//		
//		String parentWindow = driver.getWindowHandle();
//		
//		Set<String> set = driver.getWindowHandles();
//		
//		for(String a : set) {
//			if(!a.equals(parentWindow)){
//				driver.switchTo().window(a);
//				break;
//			}
//		}
//		String str = driver.getTitle();
//
//		System.out.println(str);
//		
//		driver.quit();
		
//		String html = driver.getPageSource();
//		
//		System.out.println(html);
//		
//		if(html.contains("404")) {
//			System.out.println("Page not found");
//		}
//		else {
//			System.out.println("Page found");
//		}
//		
//		driver.quit();
		
	}

}
