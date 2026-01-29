package LeetCodeQuestions;

import java.util.Arrays;

public class reverseVowels {
	
	public static boolean isVowel(char c) {
		if(c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
				c == 'i' || c == 'I' ||
				c == 'o' || c == 'O' ||
				c == 'u' || c == 'U' ) {
			return true;
		}
		return false;
	}
	
	public static String reverseVowels(String s) {
		
		char[] ch = s.toCharArray();
		int i=0; 
		int j= s.length()-1;
		
		while(i < j) {
			if(isVowel(ch[i]) && isVowel(ch[j])){
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
			else if(!isVowel(ch[i])) {
				i++;
			}
			else {
				j--;
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {

		System.out.println(reverseVowels("aA"));
	}

}
