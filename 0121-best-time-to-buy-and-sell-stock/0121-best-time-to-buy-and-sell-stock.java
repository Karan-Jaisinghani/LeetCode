class Solution {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = 0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            else if(prices[i] - buy>max){
                max= prices[i]-buy;
            }
        }
        return max;
    }
}