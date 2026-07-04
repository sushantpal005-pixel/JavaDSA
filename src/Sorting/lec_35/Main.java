package Sorting.lec_35;

import java.util.Arrays;

public class Main {
    //Bubble Sort
    static int[] bubbleSort(int[] arr){  // T.C. -> O(n^2)
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {  //rounds
            for (int j = 0; j < n-i-1; j++) {  //for comparing adjacent elements
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    //Selection Sort
    static int[] selectionSort(int[] arr){ //T.C - O(n^2)
        int n = arr.length;
        //outer loop -> for rounds
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            //inner loop -> comparison of arr[j] and arr[minIndex]
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //after comparison, swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    //Insertion Sort
    static int[] insertionSort(int[] arr){ //T.C - O(n^2)
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int prev = i-1;
            int currValue = arr[i];
            while(prev >= 0 && currValue < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //now empty space is available so place currValue
            arr[prev+1] = currValue;
        }
        return arr;
    }
    static void main() {
        int[] arr = {6,5,1,3};
        System.out.println("Insertion Sort: " + Arrays.toString(insertionSort(arr)));
        System.out.println("Selection Sort: " + Arrays.toString(selectionSort(arr)));
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSort(arr)));
    }
}
