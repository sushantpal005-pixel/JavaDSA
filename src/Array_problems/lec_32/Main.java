package Array_problems.lec_32;

public class Main {
    static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            //sum check krte h
            sum = sum + nums[i];
            //maxi update krte h
            maxi = Math.max(maxi, sum);
            //sum check krte h for -ve value
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }

    static void main() {
        int[] arr = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(arr));
    }
}
