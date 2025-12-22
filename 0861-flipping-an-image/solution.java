class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] b=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=image[i][n-j-1];
                if(b[i][j]==1){
                    b[i][j]=0;
                }else{
                    b[i][j]=1;
                }
            }
        }
        return b;
    }
}
