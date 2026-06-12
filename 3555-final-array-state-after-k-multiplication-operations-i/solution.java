class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        while(k-->0){

            int minidx=0;
            int min=nums[0];
            for(int i=1;i<n;i++){
                if(nums[i]<min){
                    minidx=i;
                    min=nums[i];
                }
            }

            nums[minidx]=min*multiplier;
        }

        return nums;
    }
}
