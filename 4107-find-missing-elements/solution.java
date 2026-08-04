class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        int n=nums.length;
        //Arrays.sort(nums);
        HashSet<Integer> h=new HashSet<>();
        for(int num:nums){
            h.add(num);
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }

        for(int i=min+1;i<max;i++){
            if(!h.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}
