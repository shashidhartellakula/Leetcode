class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<=nums[n-1];i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]>=i){
                    count++;
                }
            }
            if(count==i){
                return i;
            }
        }
        return -1;
    }
}
