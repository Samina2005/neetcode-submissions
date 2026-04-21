class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i< 9 ; i++){
            for (int j = 0 ; j<9;j++){

                // check for the row
                char val = board[i][j];
                if (val == '.') continue;
                HashSet<Character> seenRow = new HashSet();
                for(int k = 0 ; k < 9 ; k++){
                    if(board[i][k] != '.'){
                        if(seenRow.contains(board[i][k])){
                            return false;
                        }else{
                            seenRow.add(board[i][k]);
                        }
                    }
                }

                // check for column 

                HashSet<Character> seenCol = new HashSet();
                for(int k = 0 ; k < 9 ; k++){
                    if(board[k][j] != '.'){
                        if(seenCol.contains(board[k][j])){
                            return false;
                        }else{
                            seenCol.add(board[k][j]);
                        }
                    }
                }

                // check for matrix
                HashSet<Character> seenMat = new HashSet();
                // var checking for which mat
                int row = i/3;
                int col = j/3;
                for(int l = row *3 ; l < row*3 + 3;l++){
                    for(int m = col*3 ; m < col*3 + 3 ; m++){
                        if(board[l][m] != '.'){
                            if(seenMat.contains(board[l][m])){
                                return false;
                            }else{
                                seenMat.add(board[l][m]);
                            }
                        }
                    }
                }


            }
        }
        return true;
    }
}
