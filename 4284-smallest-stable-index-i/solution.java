class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pmax=new int[n];
        int[] smin=new int[n];
        pmax[0]=nums[0];
        for(int i=1;i<n;i++){
            pmax[i]=Math.max(pmax[i-1],nums[i]);
        }

        smin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            smin[i]=Math.min(smin[i+1],nums[i]);
        }

        for(int i=0;i<n;i++){
            int ans=pmax[i]-smin[i];
            if(ans<=k){
                return i;
            }
        }
        return -1;
    }
}
