class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            //for(int j=i;j<i+k;j++){
                if(map.containsKey(nums[i])){
                    int diff=map.get(nums[i])-i;
                    if(Math.abs(diff)<=k){
                        return true;
                    }
                }
           // }
            map.put(nums[i],i);
        }
        return false;
    }
}
