class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        
        int pro2=nums[0]*nums[1]*nums[n-1];
        int pro3=nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(pro2,pro3);
    }
}
