class Solution {
    public int maxProduct(int n) {
        int len=(int)Math.log10(n)+1;
        int digit[]=new int[len];
        int i=0;
        while(n>0){
            digit[i]=n%10;
            n/=10;
            i++;
        }
        int max=Integer.MIN_VALUE;
        for(int k=0;k<len;k++){
            for(int j=0;j<len;j++){
                if(k==j){
                    continue;
                }
                int product=digit[k]*digit[j];
                if(product>max){
                    max=product;
                }
            }
        }
        return max;
    }
}
