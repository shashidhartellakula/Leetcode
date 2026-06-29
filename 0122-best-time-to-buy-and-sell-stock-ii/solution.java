class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n=prices.length;
        int pro=0;
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                pro+=prices[i]-min;
                min=prices[i];
            }
        }
        return pro;
    }
}
