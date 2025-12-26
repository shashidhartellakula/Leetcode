class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            int min=matrix[i][0];
            int cidx=0;
            for(int j=1;j<n;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    cidx=j;
                }
            }
            boolean islucky=true;
            for(int k=0;k<m;k++){
                if(matrix[k][cidx]>min){
                    islucky=false;
                    break;
                }
            }
            if(islucky){
                res.add(min);
            }
        }
        return res;
    }
}
