class Solution {
    public int maxProfit(int[] prices) {
        int max=0,minprice=Integer.MAX_VALUE;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }else{
                max=Math.max(price-minprice,max);
            }
        }
        return max;
    }
}
