class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int i=prices.length-1;
        int j=discounts.length-1;

        double sum=0;
        while(i>=0 && j>=0){
            double pric=(prices[i]*(100.0-discounts[j]))/100.0;
            sum+=pric;

            i--;
            j--;
            
        }

        while(i>=0){
            sum+=prices[i];
            i--;
        }
        return sum;
    }
}
