package Binary_Search.lec_37;

public class Main {
    static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] >= target){
                //store ans
                ans = mid;
                //move to left
                e = mid -1;
            }
            else{
                //right move
                s = mid + 1;
            }
        }
        return ans;
    }

    static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] <= target){
                //move to right
                s = mid + 1;
            }
            else{
                //arr[mid] > target
                //store ans
                ans = mid;
                //move left
                e = mid - 1;
            }
        }
        return ans;
    }

    static int countFreq(int[] arr, int target) {
        // code here
        int lbIndex = getLowerBound(arr, target);
        int ubIndex = getUpperBound(arr, target);
        int ans = ubIndex - lbIndex;
        return ans;

    }

    static void main() {
        int[] arr = {10, 20, 30, 30, 30, 30, 30, 40, 50};
        int target = 30;
        System.out.println(countFreq(arr, target));
    }
}
