class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        
        int dp1[]=new int[nums.length];
        Arrays.fill(dp1,-1);
        

        int case1=helper(nums,0,n-2,dp);
        int case2=helper(nums,1,n-1,dp1);

        return Math.max(case1,case2);
    }

    public int helper(int nums[],int i,int end,int dp[]){

        if(i>end){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int pick=nums[i]+helper(nums,i+2,end,dp);
        int notpick=helper(nums,i+1,end,dp);

        dp[i]= Math.max(pick,notpick);

        return dp[i];
    }
}
