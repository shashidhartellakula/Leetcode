class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=count(i);
        }
        return ans;
    }
    static int count(int num){
        int c=0;
        while(num>0){
            if((num&1)==1){
                c++;
            }
            num>>=1;
        }
        return c;
    } 
}
