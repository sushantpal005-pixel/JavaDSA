package Binary_Search.lec_46;

public class Main {
    static int findElementInNearlySortedArray(int[] arr, int k){
        int n = arr.length;

        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s + (e-s) / 2;
            if(mid - 1 >= 0 && arr[mid-1] == k)
                return mid-1;
            if(arr[mid] == k)
                return mid;
            if(arr[mid+1] == k)
                return mid+1;

            if(mid + 1 < n && k > arr[mid]){
                s = mid + 2;
            }
            else{
                e = mid - 2;
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {10, 30, 20, 50, 40, 70, 60, 80};
        System.out.println(findElementInNearlySortedArray(arr, 30));
    }
}
