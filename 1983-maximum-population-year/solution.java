class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year=new int[2051];
        for(int[] log:logs){
            year[log[0]]++;
            year[log[1]]--;
        }

        int currpop=0;
        int maxpop=0;
        int yr=0;

        for(int i=1950;i<=2050;i++){
            currpop=currpop+year[i];
            if(currpop>maxpop){
                maxpop=currpop;
                yr=i;
            }
        }
        return yr;
    }
}
