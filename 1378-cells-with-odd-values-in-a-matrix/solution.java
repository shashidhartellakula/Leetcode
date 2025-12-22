class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] a=new int[m][n];
        for(int[] idx:indices){
            int r=idx[0];
            int c=idx[1];
            for(int i=0;i<m;i++){
                a[i][c]++;
            }
            for(int j=0;j<n;j++){
                a[r][j]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
