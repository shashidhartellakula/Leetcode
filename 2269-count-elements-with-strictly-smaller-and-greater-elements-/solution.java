class Solution {
    public int countElements(int[] nums) {
        int n=nums.length;
        int maxval=Integer.MIN_VALUE;
        int minval=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<minval){
                minval=num;
            }

            if(num>maxval){
                maxval=num;
            }
        }
        int count=0;
        for(int num:nums){
            if(num>minval && num<maxval){
                count++;
            }
        }
        return count;
    }
}
