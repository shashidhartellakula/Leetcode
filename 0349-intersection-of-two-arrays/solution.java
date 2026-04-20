class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int num:nums1){
            h.add(num);
        }
        for(int num:nums2){
            if(h.contains(num)){
                res.add(num);
            }
        }
        int len=res.size();
        int[] ans=new int[len];
        int i=0;
        for(int num:res){
            ans[i++]=num;
        }
        return ans;
    }
}
