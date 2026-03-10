class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int temp;
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]]){
                temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k){
                return k;
            }
        }
        return nums.length;
    }
}
