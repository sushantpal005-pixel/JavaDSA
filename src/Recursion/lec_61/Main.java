package Recursion.lec_61;

public class Main {
    public int solve(int amount, int[] coins, int index){
        //base case
        if(amount == 0) return 1;
        if(amount < 0) return 0;
        if(index >= coins.length) return 0;
        //ek case hum solve krenge,
        //baki recursion sambhal lega
        //man lo coins ki value 5 h and amount ki value 40 h
        //agr mai 5 ko include krlu to iska mtlb
        //remaining amount 40-5 i.e. 35 ho jayega
        int includeKaAns = solve(amount - coins[index], coins, index);

        //man lo amount 40 h or maine current coin ka use nhi kiya
        //iska mtlb main current coin ko exclude krra hu, to mujhe next coin pr move krna pdega

        int excludeKaAns = solve(amount, coins, index+1);

        int finalAns = includeKaAns + excludeKaAns;
        return finalAns;
    }
    public int change(int amount, int[] coins){
        int index = 0;
        int ans = solve(amount, coins, index);
        return ans;
    }
}
