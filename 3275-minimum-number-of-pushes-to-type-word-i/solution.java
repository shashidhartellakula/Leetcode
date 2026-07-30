class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n==0){
            return 0;
        }
        int ans=0;
        if(n<=8){
            ans=n;
        }else if(n<=16){
            ans=(n-8)*2+8;
        }else if(n<=24){
            ans=8+8*2+(n-16)*3;
        }else{
            ans=8+8*2+8*3+(n-24)*4;
        }
        return ans;
    }
}
