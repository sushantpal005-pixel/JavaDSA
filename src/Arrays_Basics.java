import java.util.Scanner;

public class Arrays_Basics {
    static void main(){
    // 2-D array
        //addition
//        int arr[][] = {{1,2,3},{1,2,3}};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum = sum + arr[i][j];
//            }
//        }
//        System.out.println("sum : " + sum);


        //multiplication
//        int arr[][] = {{1,2,3},{1,2,3}};
//        int mul = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                mul = mul * arr[i][j];
//            }
//        }
//        System.out.println("mul : " + mul);


//        // max value
//        int arr[][] = { { 1,2,3}, {21, 20, 19}};
//        int max = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] > max){
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println("max value: "+ max);

        //min value
        int arr[][] = { { 1,2,3}, {21, 20, 19}};
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min value: "+ min);





//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i <= arr.length-1; i++){
//            for (int j = 0; j <= arr[i].length-1; j++) {
//                System.out.println("Enter value for row " + i + " and colums " + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int rowIndex = 0; rowIndex <= arr.length-1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length-1; colIndex++) {
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        //declaration
//        int[][] arr;
//        //allocation
//        arr = new int[3][4];


        //init
        int[][] brr = {
                {1,2},
                {2,3,4,5},
                {3,4,6,5,8},
                {4,5}
        };
        int rowLength = brr.length;
        //int colLength = brr[0].length;
//        for (int row = 0; row <= rowLength-1; row++) {
//            //jaise hi mai kisi new row me aaya
//            //same pint pr maine uss row ka colLength find out krlunga
//            //current row -> brr[row]
//            //isme kitne colums -> brr[row].length
//            int colLength = brr[row].length;
//
//            for (int col = 0; col <= colLength-1; col++) {
//                System.out.print(brr[row][col] +" ");
//            }
//            System.out.println();
//        }
        //traversal in 2-D array
//        for (int rowIndex = 0; rowIndex <= brr.length-1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= brr[rowIndex].length-1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }





    // 1-D array
        //addition of all element
//        int arr[] = {10,20,30,40,50};
//        int sum = 0;
//        for (int i = 0; i <= arr.length-1; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println("sum: "+ sum);

        //multiplication of all element
//        int arr[] = {2, 3, 4, 5};
//        int mul = 1;
//        for (int i = 0; i <= arr.length-1; i++) {
//            mul = mul * arr[i];
//        }
//        System.out.println("multiplication: "+ mul);


        // find max in array
//        int arr[] = {4, 5, 3, 10};
//        int max = arr[0];
//        for (int i = 0; i <= arr.length-1; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println("max no. is : "+ max);

        //find min in array
//        int arr[] = {10, 4, 8, 2, 1};
//        int min = arr[0];
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println("min is "+min);
//        // declaration
//        int arr[];
//        // allocation
//        arr = new int[5];
//
//        //taking input
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i <= arr.length-1; i++) {
//            System.out.println("Enter value for index "+ i);
//            arr[i] = sc.nextInt();
//        }
//        for (int val : arr){
//            System.out.println(val);
//        }
        //init
        // int brr[] = {1, 2, 3};


//        for(int val : brr){
//            System.out.println(val);
//        }


//        for (int i = 0; i <= brr.length-1; i++) {
//            System.out.println(brr[i]);
//        }
//        System.out.println("value at 0 index " + brr[0]);
//        System.out.println("value at 1 index " + brr[1]);
//        System.out.println("value at 2 index " + brr[2]);
    }
}
