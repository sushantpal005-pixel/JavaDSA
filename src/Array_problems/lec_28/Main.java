package Array_problems.lec_28;

import java.util.Arrays;
import java.util.*;

public class Main {
    //Problem-1
    static int[] rev(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    //Problem-2
    static int[] shiftBy1(int[] arr){
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }

    //Problem-3
    static void printAlternate(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            if(i == j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    //Problem-4
    static int getMode(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
//        for(int i : freq.keySet()){
//            System.out.println(i + "->" + freq.get(i));
//        }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;
        for (int key : freq.keySet()){
            int currentKeyKiFrequency = freq.get(key);
            if(currentKeyKiFrequency > maxFreq){
                maxFreqWaliKey = key;
                maxFreq = currentKeyKiFrequency;
            }
        }
        return maxFreqWaliKey;
    }

    //Problem-5
    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(currentKey);
            if(currentFreq > highestFreq){
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(currentKey);
            if(lowestFreq > currentFreq){
                lowestNum = currentKey;
                lowestFreq = currentFreq;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }

//    //Problem-6
    static int[] shifByK(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n-k+i];
        }
        for (int i = n-k-1; i >= 0. ; i--) {
            arr[i+k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    //Problem-7
    static void union(int[] arr, int brr[]){
        HashSet<Integer> union = new HashSet<>();
        for (int num : arr){
            union.add(num);
        }
        for (int num : brr){
            union.add(num);
        }
        System.out.println(union);
    }

    static void main() {

//        int arr[] = {1,2,4,8,7};
//        int brr[] = {6,10,89,9,7,8};
//        union(arr,brr);

//        int arr[] = {1, 2, 3, 4, 5};
//        int ans[] = shifByK(arr, 2);
//        System.out.println(Arrays.toString(ans));
//        int arr[] = {1, 2, 2, 4, 4, 4, 8, 8};
//        int res[] = getHighestLowestFreqElement(arr);
//        System.out.println("Highest Frequency: " + res[0]);
//        System.out.println("Lowest Frequency: " + res[1]);
//        int arr[] = {1, 2, 2, 4, 5, 5, 5};
//        System.out.println(getMode(arr));

//        int arr[] = {1, 2, 3, 4, 5, 9};
//        printAlternate(arr);

//        int arr[] = {1, 2, 3, 4, 5, 9};
//        int ans[] = shiftBy1(arr);
//        System.out.println(Arrays.toString(ans));

//        int arr[] = {1, 2, 3, 4, 5, 9};
//        int res[] = rev(arr);
//        System.out.println(Arrays.toString(res));
    }
}
