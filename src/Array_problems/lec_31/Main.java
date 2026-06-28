package Array_problems.lec_31;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Missing Elements From An Array With Duplicates
    static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int value = Math.abs(nums[i]);
            int pos = value - 1;
            if(nums[pos] > 0){
                nums[pos] = -nums[pos];
            }
        }
        for (int j = 0; j < n; j++) {
            if(nums[j] > 0){
                int valueAtThisIndex = j + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }
    static void main() {
        int[] nums = {1, 4, 4, 6, 1, 2};
        System.out.println(findDisappearedNumbers(nums));

    }
}
