class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            int digit=nums[i];
            int rev=0;
            while(digit>0){
                rev=rev*10+(digit%10);
                digit/=10;
            }
            set.add(rev);
        }

        return set.size();
    }
}
