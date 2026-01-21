package com.qa.com.com.qa.com;

import java.time.Duration;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.hamcrest.Matchers.*;

public class InPP {

	public static void main(String[] args) throws InterruptedException {
		
		//Write RestAssured code for the Create User API (POST /v2/add-user)
		
		String validApiKey = "";
		String BASE_URL = "";
		
		WebDriver driver = new ChromeDriver();
		
String user_id = given().
		header("api_key", validApiKey).
		header("Content-Type", "application/json").
		body("{\n"
				+ "  \"user_name\": \"John Doe\",\n"
				+ "  \"user_email\": \"john.doe@company.com\",\n"
				+ "  \"designation\": \"Junior Developer\",\n"
				+ "  \"departmentId\": \"DEPT001\",\n"
				+ "  \"status\": \"active\"\n"
				+ "}").when().post(BASE_URL + "/users").then().statusCode(201).extract().jsonPath().getString("id");

System.out.println("Added user is :" + user_id);

//Verify Creation (GET /users/{id})

 JsonPath str =  given().header("api-key", validApiKey).
                 header("Content-Type", "application/json").get(BASE_URL + "/users/" + user_id).then().statusCode(200).
                 body("departmentId", equalTo("DEPT001")).
                 body("designation", equalTo("Junior Developer")).extract().jsonPath();
                 

System.out.println(str.prettyPrint());


		


         
}
	
}