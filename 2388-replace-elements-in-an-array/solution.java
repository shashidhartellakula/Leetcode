class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
       Map<Integer,Integer> pos=new HashMap<>();
       for(int i=0;i<nums.length;i++){
            pos.put(nums[i],i);
       }

       for(int op[]:operations){
         int old=op[0];
         int newval=op[1];

         int idx=pos.get(old);
         nums[idx]=newval;
        pos.remove(old);
         pos.put(newval,idx);
       }

       return nums;
    }
}
