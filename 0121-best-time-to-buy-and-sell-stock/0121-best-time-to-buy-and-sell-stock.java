class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i]>sell){
                sell = prices[i];
                if (profit < sell - buy){
                    profit = sell - buy;
                }
            }
            if (prices[i]<buy){
                buy = prices[i];
                sell = 0; 
            }
        }
        return profit;
    }
}