package Recursion;
import java.util.*;
public class lec_66 {
    static int solve(List<List<Integer>> triangle, int rowIndex, int colIndex){
        //base case
        if(rowIndex == triangle.size() - 1){
            //jis value pe khade ho usse path me include krdena and vapas jao
            return triangle.get(rowIndex).get(colIndex);
        }
        //ek case hum solve krenge baki recursion sambhal lega
        int downAns = solve(triangle, rowIndex + 1, colIndex);
        int diagonolAns = solve(triangle, rowIndex + 1, colIndex + 1);
        int finalAns = triangle.get(rowIndex).get(colIndex) + Math.min(downAns, diagonolAns);
        return finalAns;
    }
    static int minimumTotal(List<List<Integer>> triangle) {
        int rowIndex = 0;
        int colIndex = 0;
        int ans = solve(triangle, rowIndex, colIndex);
        return ans;
    }
}
