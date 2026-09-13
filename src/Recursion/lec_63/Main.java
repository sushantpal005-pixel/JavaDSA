package Recursion.lec_63;

public class Main {
    static boolean solve(int target, int[] nums, int index){
        if(target == 0){
            return true;
        }
        if(target < 0){
            return false;
        }
        if(index >= nums.length){
            return false;
        }
        //include exclude pattern
        boolean includeKaAns = solve(target - nums[index], nums, index + 1);
        boolean excludeKaAns = solve(target, nums, index + 1);
        return includeKaAns || excludeKaAns;
    }
    static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if((sum & 1) == 1) return false;     //odd hai to return false
        int index = 0;
        int target = sum / 2;
        boolean ans = solve(target, nums, index);
        return ans;
    }

    static void main() {

    }
}
