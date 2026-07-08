package Binary_Search.lec_38;

public class Main {
    static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] < arr[mid+1]){
                //main ascending order wale part me hu
                //iska mtlb mai left part me hu
                //or mujhe pta h ans right me h
                //to move right side
                s = mid + 1;
            }
            else{
                //arr[mid] >= arr[mid+1]
                //iska mtlb mai right part me hu
                //iska mtlb mai ek potential soln pr khada hu
                ans = mid;
                //now i have to find the final solution
                //mujhe pta h right part descending order wala h
                //to bda no. agr exist krta h, to pkka left me hi milega
                //move left side
                e = mid - 1;
            }
        }

        return ans;
    }

    static void main() {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
