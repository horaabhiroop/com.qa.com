package com.qa.com.com.qa.com;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveHover {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement menu = driver.findElement(By.xpath("//button[.='Copy Text']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(menu).perform();
		
//		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
//		
//		for(WebElement e : ls) {
//			System.out.println(e.getText());
//		}
	}

}
