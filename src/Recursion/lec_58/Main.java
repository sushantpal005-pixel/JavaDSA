package Recursion.lec_58;

public class Main {
    //Binary Search using recursion
    static int solve(int[] arr, int target, int s, int e){
        if(s > e) return -1;
        //Processing or binary search logic
        int mid = s + (e - s) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target) e = mid - 1;
        else if(arr[mid] < target) s = mid + 1;
        //Recursive call
        return solve(arr, target, s, e);
    }
    static int binarySearch(int[] arr, int target){
          int s = 0;
          int e = arr.length - 1;
          return solve(arr, target, s, e);
    }

    static void main() {
        System.out.println(binarySearch(new int[]{2, 3, 4, 5, 6}, 6));
    }
}
