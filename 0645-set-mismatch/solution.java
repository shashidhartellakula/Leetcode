class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int freq[]=new int[n+1];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            sum+=nums[i];
        }
        int rep=0;
        int rep1=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                rep=i;
                
            }
            if(freq[i]==0){
                rep1=i;
            }
        }
        
        return new int[]{rep,rep1};
    }
}
