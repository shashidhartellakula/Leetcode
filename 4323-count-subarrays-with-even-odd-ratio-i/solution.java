class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int oddcount=0;
            int evecount=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    evecount++;
                }else{
                    oddcount++;
                }
                if(oddcount==0){
                    continue;
                }
                if(evecount*b*1L <= oddcount*a*1L){
                count++;
                }
            }
            
        }
        return count;
    }
}
