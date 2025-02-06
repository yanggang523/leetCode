class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int sellStock = 0;
        int buyStock = prices[0];

        for (int i = 0; i < prices.length; i++){
            if (buyStock <= prices[i]){
                if (sellStock < prices[i] && profit < (prices[i]-buyStock)){
                    sellStock = prices[i];
                    profit = sellStock - buyStock;
                }
           
            }else{
                buyStock = prices[i];   
                sellStock = 0; 
            }
        }
        return profit;
    }   
}