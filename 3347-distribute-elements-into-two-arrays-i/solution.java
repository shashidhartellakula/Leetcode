class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }
        int i=0;
        int j=0;
        while(j<l1.size()){
            ans[i]=l1.get(j);
            i++;j++;
        }
        int k=0;
        while(k<l2.size()){
            ans[i]=l2.get(k);
            i++;k++;
        }

        return ans;
    }
}
