class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int j=0;
        int n=nums.length;
        int length=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
                map.put(nums[j],map.get(nums[j])-1);
                j++;
            }

            length=Math.max(length,i-j+1);
        }
        return length;
    }
}
