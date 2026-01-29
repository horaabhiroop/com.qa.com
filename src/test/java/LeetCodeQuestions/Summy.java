package LeetCodeQuestions;

public class Summy {
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		int[] freq = new int[26];
		
		for(char ch : magazine.toCharArray()) {
			freq[ch - 'a']++;
		}
		
		for(char ch : ransomNote.toCharArray()) {
			if(freq[ch - 'a']<1) {
				return false;
			}
			freq[ch - 'a']--;
		}
		
		return true;
	}
	
	public static boolean isPalindrome(int x) {

        int org = x;
        int sum =0;

        while(x < 0){
            sum = sum*10 + x%10;
            x = x/10;
        }
        return org==sum;
    }


	public static void main(String[] args) {

		String a = "a";
		String b = "b";
		//System.out.println(canConstruct(a, b));
		
		System.out.println(isPalindrome(121));
		
	}

}
