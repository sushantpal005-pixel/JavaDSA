package Recursion.lec_75;

public class Main {
    static void merge(int arr[], int s, int e, int mid){
        int leftArrLen = mid - s + 1;
        int rightArrLen = e - mid;

        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        //copy the left half content of arr into leftArr
        int k = s;
        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[k];
            k++;
        }
        //copy the right half content of arr into rightArr
        k = mid + 1;
        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[k];
            k++;
        }

        //merge ka exact logic
        int i = 0;
        int j = 0;
        k = s;
        while(i < leftArrLen && j < rightArrLen){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        //if left array is fully consumed and right is not consumed yet
        //then copy remaining elements of right array into the ans array
        while(j < rightArrLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        //if rightt array is fully consumed and left is not consumed yet
        //then copy remaining elements of left array into the ans array
        while (i < leftArrLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
    }
    static void mergeSort(int arr[], int s, int e){
        if(s >= e) return;  //invalid arrary and single array

        //break into two halves
        int mid = (s + e)/ 2;
        //lets sort the left array
        mergeSort(arr, s, mid);
        //lets sort the right array
        mergeSort(arr, mid + 1, e);
        //merge both the halves
        merge(arr, s, e, mid);
    }

    static void main() {
        mergeSort(new int[]{4, 8923, 342, 1, 2, 5}, 0, 5);
    }
}
