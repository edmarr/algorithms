package algorithms.resolved.leetcode;

public class BuySellStockI {
	public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int i = 0;
        while(i < prices.length){
            if(prices[i] < min){
                min = prices[i];
            }else if (prices[i]  - min > max){
                max = prices[i] - min;
            }
            i++;
        }
        return max;

	}

	public static void main(String[] args) {
		int[] arr = new int [] {2,1,2,0,1};
		System.out.println(new BuySellStockI().maxProfit(arr));
	}
}
