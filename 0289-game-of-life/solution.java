class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;

        List<int[]> todie=new ArrayList<>();
        List<int[]> toliv=new ArrayList<>();

        int[][] dir={
            {-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}
        };

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int neigbor=0;

                for(int d[]:dir){
                    int nr=i+d[0];
                    int nc=j+d[1];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && board[nr][nc]==1){
                        neigbor++;
                    }
                }

                if(board[i][j]==1){
                    if(neigbor<2 || neigbor >3){
                        todie.add(new int[]{i,j});
                    }
                }
                else{
                    if(neigbor==3){
                        toliv.add(new int[]{i,j});
                    }
                }

            }

            
        }
        for(int upd[]:todie){
                board[upd[0]][upd[1]]=0;
            }
            for(int upd[]:toliv){
                board[upd[0]][upd[1]]=1;
            }
    }
}
