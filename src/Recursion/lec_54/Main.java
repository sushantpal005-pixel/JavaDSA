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
    static void main() {
        System.out.println(factorial(5));
        System.out.println(powerOfTwo(5));
        System.out.println(fibonacci(4));
    }
}
