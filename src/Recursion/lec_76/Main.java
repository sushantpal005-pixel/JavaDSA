package Recursion.lec_76;

public class Main {
    static int merge(int[] arr, int s, int e, int mid){
        //leftArray and rightArray create kiye the,
        //jisme humne original array se values copy ki thi
        int leftArrLen = mid - s + 1;
        int rightArrLen = e - mid;

        int[] leftArr = new int[leftArrLen];
        int[] rightArr = new int[rightArrLen];

        int k  = s;
        for(int i = 0; i < leftArrLen; i++){
            leftArr[i] = arr[k];
            k++;
        }
        k = mid + 1;
        for(int j = 0; j < rightArrLen; j++){
            rightArr[j] = arr[k];
            k++;
        }
        //merge ka logic
        int i = 0;
        int j = 0;
        k = s;
        int invCount = 0;
        while(i < leftArrLen && j < rightArrLen){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[j];
                k++;
                j++;
            }
            else{
                //leftArr[i] > rightArr[j]
                //merge wala logic
                arr[k] = rightArr[j];
                j++;
                k++;
                //inversion ka logic
                invCount = invCount + (leftArrLen - i);
            }
        }
        while(i < leftArrLen){
            arr[k] = leftArr[i];
            k++;
            i++;
        }
        while(j < rightArrLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        return invCount;
    }
    static int mergeSort(int arr[], int s, int e){
        if(s > e) return 0;
        if(s == e) return 0;
        //break in two parts
        int mid = (s + e) / 2;
        //left array sort karwate h rec se
        int leftInversions = mergeSort(arr, s, mid);
        //right array sort karwate h rec se
        int rightInversions = mergeSort(arr, mid + 1, e);
        //merge both sored part
        int intermediateInversions = merge(arr, s, e, mid);
        int invCount = leftInversions + rightInversions + intermediateInversions;
        return invCount;
    }

    static int inversionCount(int arr[]){
        int s = 0;
        int e = arr.length - 1;
        int ans = mergeSort(arr, s, e);
        return ans;
    }
    static void main() {

    }
}
