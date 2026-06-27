package Array_problems.lec_30;

import java.util.*;

public class Main {
    //Two sum
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i <=n-2 ; i++) {
            for (int j = i+1; j <=n-1 ; j++) {
                if (nums[i]+nums[j] == target){
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int[] ans = {};
        return  ans;
    }

    //Three sum
    static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n=nums.length;
        int target = 0;
        for (int i = 0; i <=n-2 ; i++) {
            for (int j = i+1; j <=n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if (nums[i] + nums[j] + nums[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(j);
                        temp.add(k);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }return new ArrayList<>(result);
    }

    //Remove duplicates
    static int removeDuplicates(int[] arr){
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(j < n){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }

    //First repeating element
    static int firstReapeating(int arr[]){
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) +1);
        }
        for(int num : arr){
            if(freq.get(num) > 1){
                return num;
            }
        }
        return -1;
    }

    //Find pivot element
    static int pivotIndex(int[] arr){
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        for(int i = 0; i < n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
    static void main() {
        int [] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));

//        int [] arr = {1, 2, 3, 1};
//        System.out.println(firstReapeating(arr));

//        int [] arr = {1, 2, 3, 4, 4};
//        System.out.println(removeDuplicates(arr));

//        int [] arr = {1, 2, 3, 4};
//        int ans[] = twoSum(arr, 7);
//        System.out.println(Arrays.toString(ans));

    }
}
