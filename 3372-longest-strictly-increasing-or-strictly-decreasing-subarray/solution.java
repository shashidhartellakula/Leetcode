class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=0;
        if(nums.length==0){
            return 0;
        }
        int maxlen=1;
        int count2=1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            
            
            if(nums[i]<nums[i+1]){
                count+=1;
               
                count2=1;
            }else if(nums[i]>nums[i+1]){
                count2+=1;
                
                count=1;
            }else{
                count=1;
                count2=1;
            }
            maxlen=Math.max(maxlen,ans=Math.max(count,count2));
        }

        return maxlen;
    }
}
