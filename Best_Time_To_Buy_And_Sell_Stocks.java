public class Best_Time_To_Buy_And_Sell_Stocks {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int max_profit = 0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]<min)
            {
                min = prices[i];
            }
            profit = prices[i] - min;
            if(profit > max_profit)
                max_profit = profit;

        }

        return max_profit;

    }
}
