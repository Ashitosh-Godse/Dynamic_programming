package DynamicProgramming;

public class Best_time_To_buy_and_Sell_Stock_I {
	public int maxProfit(int[] prices) {
        int MP=0;
        int profit=0;
        int MinSoFar=prices[0];
        for(int i=0;i<prices.length;i++){
            MinSoFar=Math.min(MinSoFar,prices[i]);
            profit=prices[i]-MinSoFar;
            MP=Math.max(MP,profit);
        }
        return MP;
    }

}
