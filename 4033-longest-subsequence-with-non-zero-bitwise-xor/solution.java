class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int ans=0;
        boolean hazero=false;
        for(int i=0;i<n;i++){
            ans^=nums[i];
            if(nums[i]!=0){
                hazero=true;
            }
        }

        if(!hazero){
            return 0;
        }
        if(ans!=0){
            return n;
        }
        return n-1;

    }
}
