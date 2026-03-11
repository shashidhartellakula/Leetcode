class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
                ans.add(k+1);
            }
        }
        return ans;
    }
    static void swap(int nums[],int first,int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
}
