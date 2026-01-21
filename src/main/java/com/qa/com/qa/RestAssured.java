package com.qa.com.qa;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;

public class RestAssured {

	public static void main(String[] args) {

		String BASE_URL = null;
		String validApiKey = null;

		String user_id = given().header("api-key", "validApiKey").header("Content-Type", "application/json")
				.body("{\n" + "  \"user_name\": \"John Doe\",\n" + "  \"user_email\": \"john.doe@company.com\",\n"
						+ "  \"designation\": \"Junior Developer\",\n" + "  \"departmentId\": \"DEPT001\",\n"
						+ "  \"status\": \"active\"\n" + "}\n" + "")
				.when().post(BASE_URL + "/users").then().statusCode(201).extract().jsonPath().getString("id");

		JsonPath res = given().header("api-key", "validApiKey").header("Content-Type", "application/json").when()
				.get(BASE_URL + " /users/" + user_id).then().statusCode(200).body("departmentId", equalTo("DEPT001"))
				.body("designation", equalTo("Junior Developer")).extract().jsonPath();

		JsonPath putRes = given().header("api-key", "validApiKey").header("Content-Type", "application/json")
				.body("{ \"designation\": \"Senior Developer\" }").when().put(BASE_URL + "/users/" + user_id).then()
				.statusCode(200).body("designation", equalTo("Senior Developer")).extract().jsonPath();

		JsonPath getRes = given().header("api-key", validApiKey).header("Content-Type", "application/json").when()
				.get(BASE_URL + "/users/" + user_id).then().statusCode(200)
				.body("designation", equalTo("Senior Developer")).extract().jsonPath();

		List<String> resList = given().header("api-key", validApiKey)
				.header("Content-Type", "application/json").when().get(BASE_URL + "/users?department=DEPT001").then()
				.extract().jsonPath().getList("users.id");
		
		Assert.assertTrue(resList.contains(user_id));
	}

}
