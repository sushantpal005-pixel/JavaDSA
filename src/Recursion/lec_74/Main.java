package Recursion.lec_74;

public class Main {
    static boolean findEmptyCell(char[][] board, int[] emptyCell){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    //store empty cell ki row
                    emptyCell[0] = i;
                    //store empty cell ki col ka index
                    emptyCell[1] = j;
                    return true;
                }
            }
        }
        //khi pr bhi empty cell nhi mila to mai line no 14 pe aa jaunga
        return false;
    }
    static boolean isSafeToPlace(char[][] board, char charValue, int rowIndex, int colIndex){
        //rules:
        //check for horizontal or same row
        //row index sb cell ke liye same rhega
        //and col ka index 0 to <9 tk move krega
        for(int col = 0; col < 9; col++){
            if(board[rowIndex][col] == charValue) return false;
        }
        //check for vertical or same column
        //col index sb cell ke liye same rhega
        //and row ka index 0 to <9 tk move krega
        for(int row = 0; row < 9; row++){
            if(board[row][colIndex] == charValue) return false;
        }
        //check for current 3*3 wala sub box
        //ye h main part
        int startRow = rowIndex - rowIndex % 3;
        int startCol = colIndex - colIndex % 3;

        //travel over that 3*3 wala box
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if(board[actualRow][actualCol] == charValue) return false;
            }
        }
        return true;
    }
    static boolean solveSudokuHelper(char[][] board){
        //base case
        //mai tab manunga ki mera puzzle solved h, jb sare empty space fill ho gye honge
        //when there is no empty space inside the board, then the problem is solved
        int[] emptyCell = new int[2];
        if(!findEmptyCell(board, emptyCell)){
            return true;
        }
        //if lets say i found a empty cell
        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        for(int value = 1; value <= 9; value++){
            char charValue = (char)(value + '0');
            if(isSafeToPlace(board, charValue, rowIndex, colIndex)){
                //place krdo
                board[rowIndex][colIndex] = charValue;
                //baki recursion sambhal lega
                if(solveSudokuHelper(board) == true) {
                    return true;
                }
                //agr recursion solve nhi kr paya or wapas aagya
                //current value ko undo kro or backtracking wala step kro
                board[rowIndex][colIndex] = '.';
            }
        }
        //not able to solve the problem
        return false;
    }
    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }
}
