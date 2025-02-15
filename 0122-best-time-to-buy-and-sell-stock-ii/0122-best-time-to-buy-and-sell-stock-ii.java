class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int buyStock = prices[0];

        for (int i = 0; i < prices.length-1; i++ ){
            // NullPointException 
            int currentStock = prices[i];
            int tomorrowStock = prices[i+1];
            // int dafStock = prices[i+2];     
            if (tomorrowStock - currentStock < 0){
                continue;
            }      
            if (prices[i+1] > prices[i]){
                totalProfit += (prices[i+1] - prices[i]);
            }
        }
        return totalProfit;
    //     if (totalProfit >= prices[prices.length - 1] - prices[0]){
    //         return totalProfit;
    //     }else{
    //         return prices[prices.length - 1] - prices[0];
    //     }
    // }
    }
}