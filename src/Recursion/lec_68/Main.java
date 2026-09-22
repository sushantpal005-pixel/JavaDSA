package Recursion.lec_68;
import java.util.*;
public class Main {
//    //subset 1
//    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans){
//        if(index >= nums.length){
//            //sussequence ready h -> output wali list me
//            //iss subsequence ko store krna h, ans me
//            ans.add(new ArrayList<>(output));
//            return;
//        }
//        //include-exclude pattern
//        int currValue = nums[index];
//        //include
//        output.add(currValue);
//        solve(nums, index + 1, output, ans);
//        //backtracking step
//        output.remove(output.size()-1);
//
//        //exclude
//        solve(nums, index + 1, output, ans);
//    }
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> output = new ArrayList<>();
//        int index = 0;
//        solve(nums, index, output, ans);
//        return ans;
//    }

    //subset 2
    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans){
        if(index >= nums.length){
            //subsequence ready h -> output wali list me
            //iss subsequence ko store krna h, ans me
            ans.add(new ArrayList<>(output));
            return;
        }
        //include-exclude pattern
        int currValue = nums[index];
        //include
        output.add(currValue);
        solve(nums, index + 1, output, ans);
        //backtracking step
        output.remove(output.size()-1);


        //assume currValue = 3
        //3 3 3 3 4
        //while excluding, ignore to same elements and move on to the new element
        //ye exclude wala logic ek assumption pe based hai
        while(index + 1 < nums.length && nums[index] == nums[index + 1]){
            index++;
        }

        //exclude
        solve(nums, index + 1, output, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, index, output, ans);
        return ans;
    }
}
