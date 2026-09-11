package Recursion.lec_64;

public class Main {
    static int solve(int sum, int target, int[][] mat, int row){
        //base case
        if(row >= mat.length){
            //invalid row index
            //sum is ready
            //calculate the diff between target and sum and store or return the min diff
            return Math.abs(target-sum);
        }
        //ek case khud solve kro baki recursion sambhal lega
        int mini = Integer.MAX_VALUE;
        //mai row index pe khada hu jisme multiple columns
        //pr value pdi hai and mai hr column ko one by one consider krunga or bar bar answers ka min leta rhunga
        for(int num : mat[row]){
            int ans = solve(sum + num, target, mat, row+1);
            mini = Math.min(mini, ans);
        }
        return mini;
    }
    static int minimizeTheDifference(int[][] mat, int target) {
        int row = 0;
        int sum = 0;
        int ans = solve(sum, target, mat, row);
        return ans;
    }

    static void main() {

    }
}
