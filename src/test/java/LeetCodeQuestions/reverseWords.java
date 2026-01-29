package LeetCodeQuestions;

public class reverseWords {
	
	public static String reverseWords(String s) {
		String[] str = s.trim().split("\\s+");
		int i=0;
		int j=str.length-1;
		
		while(i<j) {
			String temp = str[i];
			str[i]=str[j];
			str[j]=temp;
			i++;
			j--;
		}
		StringBuilder sb = new StringBuilder();
		
		for(int ab=0; ab < str.length; ab++) {
			sb.append(str[ab]);
			if(ab < str.length-1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}

}
