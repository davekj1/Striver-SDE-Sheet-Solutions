class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int max=0;
        while(right<prices.length){
            if(prices[left]>prices[right]){
                left=right;
            }
            max=Math.max(prices[right]-prices[left],max);
            right++;
        }
        return max;
    }
}