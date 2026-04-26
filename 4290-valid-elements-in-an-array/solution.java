class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> lis=new ArrayList<>();
        int n=nums.length;
        if(n==1){
            lis.add(nums[0]);
            return lis;
        }
        int[] premax=new int[n];
        int[] sufmax=new int[n];
        premax[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            premax[i]=Math.max(premax[i-1],nums[i-1]);
        }
        sufmax[n-1]=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            sufmax[i]=Math.max(sufmax[i+1],nums[i+1]);
        }
        for(int i=0;i<n;i++){
            if(i==0||i==n-1 || nums[i]>premax[i] || nums[i]>sufmax[i]){
                lis.add(nums[i]);
            }
        }
        return lis;
    }
}
