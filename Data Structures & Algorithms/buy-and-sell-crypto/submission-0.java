class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0 ;
        int cur = prices[0] ;
        for(int i=1 ; i<prices.length ; i++){
            int profit = prices[i]-cur ;
            maxPro = Math.max(profit,maxPro) ;
            cur = Math.min(cur,prices[i]) ;
        }
        return maxPro ;
    }
}
