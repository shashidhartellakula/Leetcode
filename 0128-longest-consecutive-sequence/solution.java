class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int currcount=1;
                while(set.contains(current+1)){
                    current++;
                    currcount++;
                }
                count=Math.max(count,currcount);
            }
            
        }
        return count;
    }
}
