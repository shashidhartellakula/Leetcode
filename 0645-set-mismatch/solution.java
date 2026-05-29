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
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                rep=i;
                break;
            }
        }
        int org=n*(n+1)/2;
        int rep1=org-sum+rep;
        return new int[]{rep,rep1};
    }
}
