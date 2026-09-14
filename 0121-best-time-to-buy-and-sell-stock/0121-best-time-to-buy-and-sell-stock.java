class Solution {
    public int maxProfit(int[] prices) {
        int minval=prices[0];
        int maxval=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minval){
                minval=prices[i];
            }
            int profit=prices[i]-minval;

            if(profit>maxval){
                maxval=profit;
            }
        }
        return maxval;
    }
}