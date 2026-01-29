package LeetCodeQuestions;

public class reverseOnlyLetters {
	
	public static String reverseOnlyLetters(String s) {
		
		char[] ch =s.toCharArray();
		int i=0;
		int j=ch.length-1;
		
		while(i<j) {
			if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])) {
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
			else if(!Character.isLetter(ch[i])) {
				i++;
			}
			else {
				j--;
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {

		String s = "a-bC-dEf-ghIj";
		
		System.out.println(reverseOnlyLetters(s));
	}

}
