class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int prefix[]=new int[n];
        int sufix[]=new int[n];
        prefix[0]=nums[0];
        sufix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]*prefix[i-1];
        }
        for(int j=n-2;j>=0;j--){
            sufix[j]=sufix[j+1]*nums[j];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                ans[i]=sufix[i+1];
            }else if(i==n-1){
                ans[i]=prefix[i-1];
            }else{
                ans[i]=prefix[i-1]*sufix[i+1];
            }
        }
        return ans;
    }
}
