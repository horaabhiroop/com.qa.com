package com.qa.com.com.qa.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchBar {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		
//		for(int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}
		
		for(WebElement ws : list) {
			System.out.println(ws.getText());
			System.out.println(ws.getAttribute("href"));
		}
		
		//driver.quit();

	}

}
