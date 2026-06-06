class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        long at=0;
        long start=intervals[0][0];
        long end=intervals[0][1];
        int m=intervals.length;

        for(int i=1;i<m;i++){
            if(intervals[i][0]<= end+1){
                end=Math.max(end,intervals[i][1]);
            }else{
                at+=end-start+1;
                start=intervals[i][0];
                end=intervals[i][1];
                
            }
        }

        at+=end-start+1;
        long bulbs=(brightness+2L)/3L;

        return bulbs*at;
    }
}
