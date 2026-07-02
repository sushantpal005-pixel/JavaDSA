package Array_problems.lec_33;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //prints the sum each of row in a 2D array
    static List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int row = 0; row < n; row++){
            int sum = 0;
            for (int col = 0; col < m; col++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;
    }

    //prints the sum of each column of 2D array
    static List<Integer> columnSums(int[][] arr){
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        for (int col = 0; col < m; col++) {
            int sum = 0;
            for (int row = 0; row < n; row++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;
    }

    //wave prints a matrix
    static void wavePrints(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int col = 0; col < n; col++) {
            if(col % 2 == 0){
                for (int row = 0; row < m; row++) {
                    System.out.println(arr[row][col]);
                }
            }
            else {
                for (int row = m-1; row >= 0; row--) {
                    System.out.println(arr[row][col]);
                }
            }
        }
    }

    //transpose of a matrix
    static int[][] transpose(int[][] arr){
        if(arr == null || arr.length == 0){
            return new int[0][0];
        }
        //for original matrix
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        //for new matrix
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;
        int ans[][] = new int[newTotalRows][newTotalCols];

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    static void main() {

//        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int ans[][] = transpose(arr);
//        System.out.println(Arrays.deepToString(ans));

//        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//        wavePrints(arr);

//        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(columnSums(arr));

//        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(rowSums(arr));


    }
}
