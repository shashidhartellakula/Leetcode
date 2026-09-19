class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int t=countsetbit(i);
            if(t==2||t==3||t==5||t==7||t==11||t==13||t==17||t==19||t==23){
                count++;
            }
        }
        return count;
    }
    int countsetbit(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }

}
