class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int freq[]=new int[3];

        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int index=0;

        while(freq[0]-->0){
            nums[index++]=0;
        }
        while(freq[1]-->0){
            nums[index++]=1;
        }
        while(freq[2]-->0){
            nums[index++]=2;
        }

    }
}
