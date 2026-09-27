package Recursion.lec_73;
import java.util.*;

public class Main {
    static boolean isSafeToPlace(int rowIndex, int colIndex, int n, char[][] board){
        //check left horizontal
        int row = rowIndex;
        int col = colIndex;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            //row index me koi change ni krna
            //col ki value zero tk travel kregi
            col--;
        }

        //check left upper diagonal
        row = rowIndex;
        col = colIndex;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row = row - 1;
            col = col - 1;
        }

        //check left lower diagonal
        row = rowIndex;
        col = colIndex;
        while(row < n && col >= 0){
            if(board[row][col] == 'Q') return false;
            row = row + 1;
            col = col - 1;
        }

        return true;
    }
    static void solve(char[][] board, int n, int colIndex, List<List<String>> ans){
        //base case
        if(colIndex >= n){
            //iska mtlb -> board pr merko ek valid arrangement mil gyi h
            //is valid arrangement ko ans me store krlo
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        //ek case mai solve krta hu baki recursion sambhal lega
        //current column ke har cell pe jake ya fir current column k har row pr jakar
        //queen place kr dunga and rest recurion ko de dunga
        for(int rowIndex = 0; rowIndex < n; rowIndex++){
            if(isSafeToPlace(rowIndex, colIndex, n, board)){
                //place queen
                board[rowIndex][colIndex] = 'Q';
                //baki bacha hua recursion ko dedo
                solve(board, n, colIndex + 1, ans);
                //backtracking
                board[rowIndex][colIndex] = '.';
            }
        }
    }
    static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        int colIndex = 0;

        List<List<String>> ans = new ArrayList<>();

        solve(board, n, colIndex, ans);

        return ans;
    }

    static void main() {
        System.out.println(solveNQueens(4));
    }
}
