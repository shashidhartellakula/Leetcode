class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                int sum=0;
                sum=landStartTime[i]+landDuration[i];
                sum=Math.max(sum,waterStartTime[j])+waterDuration[j];
                ans=Math.min(ans,sum);
                sum=0;
            }
        }
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                int sum=0;
                sum=waterStartTime[i]+waterDuration[i];
                sum=Math.max(sum,landStartTime[j])+landDuration[j];
                ans=Math.min(ans,sum);
                sum=0;
            }
        }
        
        return ans;
    }
}
