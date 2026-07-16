class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max=nums[0];
        int prefixgcd[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            prefixgcd[i]=gc(max,nums[i]);
        }
        Arrays.sort(prefixgcd);
        int l=0,r=n-1;
        long sum=0;
        while(l<r){
                 sum+=gc(prefixgcd[l],prefixgcd[r]);
            l++;r--;
        }
        return sum;
    }
    public static int gc(int x,int y){
        int a,b;
        if(x>y){
            a=x;
            b=y;
        }else{
            a=y;
            b=x;
        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
