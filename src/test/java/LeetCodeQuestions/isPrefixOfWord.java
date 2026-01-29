package LeetCodeQuestions;

public class isPrefixOfWord {
	
	public static int isPrefixOfWord(String sentence, String searchWord) {
		
		String[] arr = sentence.split(" ");
		
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i].length() >= searchWord.length()) {
				if(arr[i].substring(0, searchWord.length()).equals(searchWord)) {
					return i+1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println(isPrefixOfWord("i am tired", "you"));
	}

}
