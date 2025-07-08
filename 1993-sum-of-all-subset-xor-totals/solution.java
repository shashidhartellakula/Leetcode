class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int tot=(int)Math.pow(2,n);
        int res=0;
        int sum=0;
        for(int i=0;i<tot;i++){
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    res^=nums[j];
                }
            }
            sum+=res;
            res=0;
        }
        
        return sum;
    }
}
