package LeetCodeQuestions;

public class bestTimeToBuyAndSell {

	public static int maxProfit(int[] prices) {
		
		int smallest =Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0; i < prices.length; i++) {
			if(prices[i]<smallest) {
				smallest = prices[i];
			}
			else {
				maxProfit = Math.max(maxProfit, prices[i]-smallest);
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {

		int[] prices = {2,4,1};
		
		System.out.println(maxProfit(prices));
	}

}
