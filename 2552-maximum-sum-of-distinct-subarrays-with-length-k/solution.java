class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        long ans=(map.size()==k) ? sum:0;
        
        for(int i=k;i<n;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int out=nums[i-k];
            sum-=out;

            map.put(out,map.get(out)-1);

            if(map.get(out)==0){
                map.remove(out);
            }

            if(map.size()==k){
                ans=Math.max(ans,sum);
            }
        }

        return ans;
    }
}
