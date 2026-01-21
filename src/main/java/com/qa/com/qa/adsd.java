package com.qa.com.qa;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;

public class adsd {
	
	public static void rearrange(String[] arr) {
		
		Map<Set<Character>, Integer> map = new LinkedHashMap<>();
		
		for(String a1 : arr) {
			Set<Character> ch = a1.toCharArray();
			if(map.put(ch, map.getOrDefault(ch, 0) +1);
		}
		
		
		
	}

	public static void main(String[] args) {

		
		// List<String> "act","tac","tall","alt","cat"
		
		//O/p = "a","c","t" : 1 // "t","a","l" : 2
		act : 3
		
		
		
	}

}
