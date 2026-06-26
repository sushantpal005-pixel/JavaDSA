package Array_problems.lec_29;

import java.util.Arrays;

public class Main {
    //Problem-1
    static int[] sortArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                //swap
                arr[i] = 0;
                arr[j] = 1;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
        return arr;
    }

    //Problem-2
    static int missingNumber(int[] arr){
        int xorSum = 0;
        for (int n : arr) {
            xorSum = xorSum ^ n;
        }
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    //Problem-3
    static int uniqueElement(int[] arr){
        int unique = 0;
        for (int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }
    static void main() {
        int arr[] = {1, 2, 3, 4, 4, 1, 3};
        System.out.println(uniqueElement(arr));


//        int arr[] = {0, 1, 2, 3, 4, 5, 6};
//        System.out.println(missingNumber(arr));


//        int arr[] = {1, 0, 1, 0, 0, 1, 0};
//        int ans[] = sortArray(arr);
//        System.out.println(Arrays.toString(ans));
    }
}
