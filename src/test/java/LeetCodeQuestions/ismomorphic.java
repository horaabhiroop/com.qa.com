package LeetCodeQuestions;

import java.util.HashMap;

public class ismomorphic {
	
	public static boolean isValid(String s1, String s2) {
		
		HashMap<Character, Character> map = new HashMap<>();
		
		if(s1.length() != s2.length()) return false;
		
		for(int i=0; i < s1.length(); i++) {
			
			char key = s1.charAt(i);
			char value = s2.charAt(i);
			
			if(map.containsKey(key)) {
				//value to value comparsion
				if(value != map.get(key)) {
					return false;
				}
			}
			else {
				//Only value comparsion
				if(map.containsValue(value)) {
					return false;
				}
				else {
					map.put(key, value);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isValid("egg", "add"));
	}

}
