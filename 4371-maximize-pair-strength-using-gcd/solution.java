class Solution {
    public long maxPairStrength(int[] nums) {
        long max=Long.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                int gc=gcd(nums[i],nums[j]);
                long ans=(1L*nums[i]*nums[j])/(1L*gc*gc);
                max=Math.max((long)ans,max);
            }
        }
        return max;
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
