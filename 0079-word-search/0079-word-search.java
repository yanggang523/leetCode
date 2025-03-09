class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == word.charAt(0)){
                    if (find(board, word, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }


    private boolean find(char[][] board, String word, int row, int column, int index){
        if (index == word.length()){ // word 한 바퀴 성공
            return true;
        }
        if (row < 0 || row >= board.length){
            return false;
        }
        if (column < 0 || column >= board[0].length){
            return false;
        }
        if (board[row][column] != word.charAt(index)){
            return false;
        } 

        char temp = board[row][column];
        board[row][column] = '#';

        boolean found = find(board, word, row + 1, column, index + 1) || 
                        find(board, word, row - 1, column, index + 1) || 
                        find(board, word, row, column + 1, index + 1) || 
                        find(board, word, row, column - 1, index + 1);

        board[row][column] = temp;

        return found;

    }
}