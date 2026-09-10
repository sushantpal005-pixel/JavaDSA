package Recursion.lec_62;

public class Main {
    static int solve(int[] coins, int amount){
        //base case
        if(amount == 0) return 0;
        //invalid amount wala case
        if(amount < 0) return Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        //mere pas ek amount h and mai is amount ke liye sare coins ko try krunga, i will make sure that i am trying each and every possible combination to find the min coin count
        for (int coin : coins){
            int recursionKaAns = solve(coins, amount-coin);
            if(recursionKaAns != Integer.MAX_VALUE){
                //valid case -> recursionKaAns != MAX_VALUE
                int totalCoinsUsed = recursionKaAns + 1;
                mini = Math.min(mini, totalCoinsUsed);
            }
        }
        return mini;
    }
    static int coinChange(int[] coins, int amount) {
        int ans = solve(coins, amount);
        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }

    static void main() {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }
}
