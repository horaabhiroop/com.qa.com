package com.qa.com.qa;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

public class Inter1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoes for men");
		
		driver.findElement(By.xpath("//input[@type='text']/parent::div/preceding-sibling::button")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		for(String a: set) {
			if(!a.equals(parent)) {
				driver.switchTo().window(a);
			}
		}
		
		driver.findElement(By.xpath("//input[@placeholder = 'Search Brand']")).sendKeys("Reebok");
		
		
		driver.findElement(By.xpath("//div[@title='REEBOK']/div/label")).click();
		
		driver.findElement(By.xpath("//div[.='Newest First']")).click();
		
		
	}

}
