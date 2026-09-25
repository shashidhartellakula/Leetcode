class Solution {
    public int xorOperation(int n, int start) {
        

        int nums[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            nums[j]=start+(2*i);
            j++;
        }
        int ans=nums[0];
        for(int i=1;i<j;i++){
            ans^=nums[i];
        }
        return ans;
    }
}
