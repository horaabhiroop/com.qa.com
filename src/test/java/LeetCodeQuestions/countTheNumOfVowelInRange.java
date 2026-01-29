package LeetCodeQuestions;

public class countTheNumOfVowelInRange {

	public static boolean isVowel(char ch){
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
	            return true;
	        }
	        return false;
	    }

	public int vowelStrings(String[] words, int left, int right) {

		int count = 0;

		for (left = 0; left <= right; left++) {
			char start = words[left].charAt(0);
			char end = words[left].charAt(words[left].length() - 1);

			if (isVowel(start) && isVowel(end)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
