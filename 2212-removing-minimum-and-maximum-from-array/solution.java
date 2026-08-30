class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minidx=0;
        int maxidx=0;
        for(int i=0;i<n;i++){
           if(nums[i]<min){
            min=nums[i];
            minidx=i;
           } 
           if(nums[i]>max){
            max=nums[i];
            maxidx=i;
           } 
        }
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);
        int op1=right+1;
        int op2=n-left;
        int op3=(left+1)+(n-right);
        return Math.min(op1,Math.min(op2,op3));
    }
}
