class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<Math.pow(2,n);i++){

            List<Integer> in=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    in.add(nums[j]);
                }
            }
            ls.add(in);
        }
        return ls;
    }
}
