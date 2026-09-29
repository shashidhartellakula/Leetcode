class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<Math.pow(2,n);i++){

            List<Integer> in=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    in.add(nums[j]);
                }
            }
            
            if(!ls.contains(in)){
                ls.add(in);
            }
        }
        return ls;
    }
}
