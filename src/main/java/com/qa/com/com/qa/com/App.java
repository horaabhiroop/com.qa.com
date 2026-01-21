package com.qa.com.com.qa.com;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	int[] input={2,4,6,7,8,9,15};
    	
    	Set<Integer> set = new LinkedHashSet<>();
    	List<Integer> list = new ArrayList<>();
    	
    	//Pushing the values present in the string in the set! 
    	for(int i=0; i < input.length; i++) {
    		set.add(input[i]);
    	}
    	
    	for(int i= input[0]; i<= input[input.length-1]; i++) {
    		if(!set.contains(i)) {
    			list.add(i);
    		}
    	}
    	System.out.println(list);
    }
}
