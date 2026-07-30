class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int n=board.length;
        for(int i=0;i<n;i++){
            Set<Character> s=new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(s.contains(board[i][j])){
                    return false;
                }
                s.add(board[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            Set<Character> s=new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(s.contains(board[j][i])){
                    return false;
                }
                s.add(board[j][i]);
            }
            
        }
        for(int row=0;row<9;row+=3){         
            for(int col=0;col<9;col+=3){
                Set<Character> s=new HashSet<>();
                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]=='.'){
                            continue;
                        }
                        if(s.contains(board[i][j])){
                            return false;
                        }
                        s.add(board[i][j]);
                    }
                }
            }
            
        }
        return true;
    }
}
