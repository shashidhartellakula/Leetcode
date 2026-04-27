class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }

        long divden=Math.abs((long) dividend);
        long divsor=Math.abs((long) divisor);
        int res=0;
        while(divden>=divsor){
            long temp=divsor;
            int multiple=1;
            while(divden>=(temp<<1)){
                temp <<=1;
                multiple <<=1;
            }
            divden-=temp;
            res+=multiple;
        }
        if((dividend<0)^(divisor<0)){
            res=-res;
        }
        return res;
    }
}
