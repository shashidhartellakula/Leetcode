class Solution {
    public boolean consecutiveSetBits(int n) {
        int count=0;
        int prev=0;

        while(n>0){
            int curr=n&1;
            if(curr==1 && prev ==1){
                count++;
            }

            prev=curr;
            n>>=1;
            
        }

        return count==1;
    }
}
