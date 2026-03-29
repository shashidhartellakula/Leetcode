class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int r=rStart,c=cStart;
        int res[][]=new int[rows*cols][2];
        int idx=0;
        res[idx++]=new int[]{r,c};
        int steps=1;
        while(idx < rows*cols){
            for(int i=0;i<steps;i++){
                c++;
                if(r>=0 && r<rows && c<cols && c>=0){
                    res[idx++]=new int[]{r,c};
                }
            }
            for(int i=0;i<steps;i++){
                r++;
                if(r>=0 && r<rows && c<cols && c>=0){
                    res[idx++]=new int[]{r,c};
                }
            }
            steps++;
            for(int i=0;i<steps;i++){
                c--;
                if(r>=0 && r<rows && c<cols && c>=0){
                    res[idx++]=new int[]{r,c};
                }
            }
            for(int i=0;i<steps;i++){
                r--;
                if(r>=0 && r<rows && c<cols && c>=0){
                    res[idx++]=new int[]{r,c};
                }
            }
            steps++;
        }
        return res;
    }
}
