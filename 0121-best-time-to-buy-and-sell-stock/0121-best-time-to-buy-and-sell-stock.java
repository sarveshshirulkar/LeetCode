class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maximumProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                maximumProfit = Math.max(maximumProfit, prices[i] - minPrice);
            }
        }
        return maximumProfit;
    }
}