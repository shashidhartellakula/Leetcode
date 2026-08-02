class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        HashSet<Integer> rows=new HashSet<>();
        HashSet<Integer> cols=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int row:rows){
            for(int i=0;i<n;i++){
                matrix[row][i]=0;
            }
        }
        for(int col:cols){
            for(int j=0;j<m;j++){
                matrix[j][col]=0;
            }
        }
    }
}
