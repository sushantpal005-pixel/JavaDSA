package Recursion.lec_71;
import java.util.*;

public class Main {
    static boolean isSafeToMove(int newX, int newY, int n, int[][] maze, boolean[][] visited){
        if(newX < 0 || newX >= n || newY < 0 | newY >= n){
            //out of bound wala case
            return false;
        }
        else if(maze[newX][newY] == 0){
            //blocked wala case
            return false;
        }
        else if(visited[newX][newY] == true){
            //already visited wala case
            return false;
        }
        else{
            return true;
        }
    }
    static void solve(int[][] maze, int srcX, int srcY, int destX, int destY, boolean[][] visited, ArrayList<String> ans, String path){
        //base case
        if(srcX == destX && srcY == destY){
            ans.add(path);
            return;
        }
        visited[srcX][srcY] = true;
        int n = maze.length;
        //ab i have 4 movement
        //up
        int newX = srcX - 1;
        int newY = srcY;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            //to baki recursion sambhal lega
            solve(maze, newX, newY, destX, destY, visited, ans, path + "U");
        }
        //down
        newX = srcX + 1;
        newY = srcY;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            //baki recursion sambhal lega
            solve(maze, newX, newY, destX, destY, visited, ans, path + "D");
        }
        //left
        newX = srcX;
        newY = srcY - 1;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            //baki recursion sambhal lega
            solve(maze, newX, newY, destX, destY, visited, ans, path + "L");
        }
        //right
        newX = srcX;
        newY = srcY + 1;
        if(isSafeToMove(newX, newY, n, maze, visited)){
            //baki recursion sambhal lega
            solve(maze, newX, newY, destX, destY, visited, ans, path + "R");
        }
        //kyuki maine charo direction try krli h
        //to ab mujhe vapas return krna h
        //to mujhe undo wala step krna pdega
        //undo wala step -> backtracking h
        visited[srcX][srcY] = false;
        //ye mai bar bar bhul jata hu
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int srcX = 0;
        int srcY = 0;
        int n = maze.length;
        int destX = n - 1;
        int destY = n - 1;
        boolean[][] visited = new boolean[n][n];

        ArrayList<String> ans = new ArrayList<>();

        String path = "";
        //if srcX is a blocked cell or dest is a blocked cell
        if(maze[0][0] == 0 || maze[n-1][n-1] == 0) return ans;

        solve(maze, srcX, srcY, destX, destY, visited, ans, path);
        Collections.sort(ans);
        return ans;
    }
}
