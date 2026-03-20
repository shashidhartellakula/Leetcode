class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] newmatrix=new int[r][c];
        int row=0,col=0;
        if(m*n==r*c){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    newmatrix[row][col]=mat[i][j];
                    col++;
                    if(col==c){
                        col=0;
                        row++;
                    }
                }
            }
            return newmatrix;
        }else{
            return mat;
        }
    }
}
