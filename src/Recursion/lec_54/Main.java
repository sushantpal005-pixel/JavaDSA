package Recursion.lec_54;

public class Main {
    //factorial using recursion
    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    //power of 2 using recursion
    public static int powerOfTwo(int n){
        if(n == 0) return 1;
        return 2 * powerOfTwo(n-1);
    }

    //fibonacci number
    public static int fibonacci(int n){
        //base case
        if(n == 0) return 0;
        if(n == 1) return 1;

        int ans = fibonacci(n-1) + fibonacci(n-2);
        return ans;
    }

    //print the elements of array recursively
    public static void print(int[] arr, int index){
        if(index == arr.length) return;
        System.out.println(arr[index]);
        print(arr, index + 1);
    }

    //calculate the sum of array elements recursively
    public static int sumOfArray(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumOfArray(arr, index + 1);
    }

    //print elements from 1 to n using recursion
    public static void print1toN(int start, int end){
        if(start > end) return;
        System.out.println(start);
        print1toN(start + 1, end);
    }
    static void main() {
        System.out.println(factorial(5));
        System.out.println(powerOfTwo(5));
        System.out.println(fibonacci(4));
        int[] arr = {1, 2, 3, 4, 5};
        print(arr, 0);
        System.out.println(sumOfArray(arr, 0));
        print1toN(0, 10);
    }
}
