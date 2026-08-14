class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ls=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n){
            int num=nums[i];
            while(i<n-1 && nums[i]+1==nums[i+1]){

                i++;
            }
            if(num==nums[i]){
                ls.add(num+"");
            }else{
                String str=num+"->"+nums[i];
                ls.add(str);
            }
            
            i++;
        }
        return ls;
    }
}
