import java.util.*;

class Solution {
    List<List<String>> result = new ArrayList<>();
    public boolean isSafe(char[][] board, int row, int col){
        // vertically up
        for (int i = row - 1; i >= 0; i--){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonally left
        for (int i = row - 1, j = col - 1; i >=0 && j >=0; i--, j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonally right
        for (int i = row - 1, j = col + 1; i>=0 && j < board.length; i--, j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public void nQueens(char[][] board, int row){
        List<String> temp = new ArrayList<>();
        if (row == board.length){
            for (int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }
            result.add(temp);
        }
        for (int j = 0; j < board.length; j++){
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '.';
            }
        }

        
    }
    public List<List<String>> solveNQueens(int n) {
       char[][] board = new char[n][n];

       for (char[] row : board){
        Arrays.fill(row, '.');
       }
       
        nQueens(board, 0);
        return result;

        

    }
}