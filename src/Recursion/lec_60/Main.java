package Recursion.lec_60;

public class Main {
    static int solve(int[] nums, int index){
        //base case
        if(index >= nums.length) return 0;
        //ek case hum solve krenge baki recursion sambhal lega
        //mai index 0 wale house pr hu
        //mere pas 2 choice h, include or exclude
        int includeAns = nums[index] + solve(nums, index + 2);
        int excludeAns = 0 + solve(nums, index + 1);
        int finalAns = Math.max(includeAns, excludeAns);
        return finalAns;
    }
    static int rob(int[] nums) {
        int index = 0;
        int ans = solve(nums, index);
        return ans;
    }

    static void main() {
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
    }
}
