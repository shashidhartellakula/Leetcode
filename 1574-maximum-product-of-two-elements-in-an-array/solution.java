class Solution {
    public int maxProduct(int[] nums) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>fmax){
                smax=fmax;
                fmax=nums[i];
            }else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        return (fmax-1)*(smax-1);
    }
}
