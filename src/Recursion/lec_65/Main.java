package Recursion.lec_65;

public class Main {
    static boolean solve(int[] nums, int index){
        //base case
        //reached destination
        if(index == nums.length - 1) return true;
        //destination se aage nikl gya
        if(index >= nums.length) return false;
        //stuck hone wali situation
        if(nums[index] == 0) return false;

        //ab mai ek case solve krunga baki recursion sambhal lega
        int jumpValue = nums[index];
        //jummpValue => max jump possible from current position
        boolean overallAns = false;
        for(int jump = 1; jump <= jumpValue; jump++){
            boolean recAns = solve(nums, index + jump);
            overallAns = overallAns || recAns;
        }
        return overallAns;
    }
    static boolean canJump(int[] nums) {
        int index = 0;
        boolean ans = solve(nums, index);
        return ans;
    }

    static void main() {
        System.out.println(canJump(new int[]{1, 1, 3}));
    }
}
