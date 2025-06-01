class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n=nums.length;
        int totalsubset=1<<n;
        for(int mask=1;mask<totalsubset-1;mask++){
            long p1=1;
            long p2=1;
            boolean overflow1=false;
            boolean overflow2=false;
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0){
                    p1*=nums[i];
                    if(p1>target){
                        overflow1=true;
                        break;
                    }
                }
            }
            if(overflow1|| p1 !=target) continue;
            for(int i=0;i<n;i++){
                if((mask &(1<<i))==0){
                    p2*=nums[i];
                    if(p2>target){
                        overflow2=true;
                        break;
                    }
                }
            }
            if(!overflow2 && p2==target){
                return true;
            }
        }
        return false;
    }
}
