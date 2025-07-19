class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        boolean[] isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        if(n>0) isPrime[0]=false;
        if(n>1) isPrime[1]=false;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        long Asum=0,Bsum=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]){
                Asum+=nums[i];
            }else{
                Bsum+=nums[i];
            }
        }
        return Math.abs(Asum-Bsum);
    }
}
