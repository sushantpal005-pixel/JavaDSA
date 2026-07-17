package Binary_Search.lec_43;

import java.util.Arrays;

public class Main {
    static boolean isValidAns(int[] stalls, int k, int minDistance) {
        //brute force

        return true;

    }
    static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int n = stalls.length;
        int ans = -1;

        int start = 0;
        int end = stalls[n-1] - stalls[0];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isValidAns(stalls, k, mid)){
                //hume ek possible soln mil gya
                //so store the ans and move to right
                ans = mid;
                start = mid + 1;
            }
            else{
                //mid ke sath is no possible arrangement to place
                //so move to left
                end = mid - 1;
            }
        }
        return ans;
    }

    static void main() {
        int[] arr = {1,2,8,4,9};
        System.out.println(aggressiveCows(arr, 3));
    }
}
