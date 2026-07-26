class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int n=series1.length;
        int m=series2.length;

        int i=0,j=0;
        int v1=series1[0][1];
        int v2=series2[0][1];
        ArrayList<List<Integer>> sol=new ArrayList<>();

        while(i<n && j<m){
            if(series1[i][0]<series2[j][0]){
                sol.add(Arrays.asList(series1[i][0],v1+v2));
                i++;
                v1=(i<n) ? series1[i][1]:0;
            }else if(series1[i][0] > series2[j][0]){
                sol.add(Arrays.asList(series2[j][0],v1+v2));
                j++;
                v2=(j<m) ? series2[j][1]:0;
            }else{
                sol.add(Arrays.asList(series1[i][0],v1+v2));
                i++;
                j++;
                v1=(i<n)?series1[i][1]:0;
                v2=(j<m)?series2[j][1]:0;
            }
        }

        while(i<n){
            sol.add(Arrays.asList(series1[i][0],v1));
            i++;
            v1=(i<n)?series1[i][1]:0;
            
        }
        while(j<m){
            sol.add(Arrays.asList(series2[j][0],v2));
            j++;
            v2=(j<m)?series2[j][1]:0;
        }
        return sol;
    }
}
