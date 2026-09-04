package Recursion.lec_56;

public class Main {
    public static int climbStairs(int n) {
        //using recursion
        if(n == 1) return 1;
        if(n == 2) return 2;
        int ans = climbStairs(n-1) + climbStairs(n-2);
        return ans;
    }

    static void main() {
        System.out.println(climbStairs(3));
    }
}
