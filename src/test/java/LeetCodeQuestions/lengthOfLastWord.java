package LeetCodeQuestions;

public class lengthOfLastWord {

	public static int lengthOfLastWord(String s) {
//		s = "Hello World"
		int i = s.length() - 1;
		System.out.println("inital len" + i);
		while (i != ' ') {
			i--;
			break;
		}
		return i;
	}

	public static void main(String[] args) {
		
		System.out.println(lengthOfLastWord("hello world    "));

	}

}
