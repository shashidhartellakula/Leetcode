class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int l=1;
        for(int k:map.keySet()){
            if(map.get(k)%3!=0){
                l=k;
            }
        }
        return l;
    }
}
