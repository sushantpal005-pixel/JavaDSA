package Binary_Search.lec_39;

public class Main {
    //find Pivot in a rotated sorted array
    static int findPivotIndex(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        if(nums[0] < nums[n-1]){
            //no effective solution
            return -1;
        }

        //binary search wala logic
        while(s <= e){
            int mid = s + (e-s) / 2;

            if (nums[mid] <= nums[n-1]){
                //iska mtlb l2 wali line pe hai
                //ans to l2 wali line pe hai
                //iska mtlb move to l1, or left
                e = mid - 1;
            }
            else {
                //mid mera l1 pe hi hai
                //store ans and move right
                ans = mid;
                s = mid + 1;
            }

        }
        return ans;
    }
    static int binarySearch(int[] nums, int start, int end, int target) {
        int n = nums.length;
        int mid = start + (end - start) / 2;

        while(start <= end){
            //compare target with midValue
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                //go to right side
                start = mid + 1;
            }
            else{
                //target < nums[mid]
                end = mid - 1;
            }
            //update mid
            mid = start + (end - start) / 2;
        }
        //if this line reached then target is not found
        return -1;
    }
    static int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        int n = nums.length;

        // if pivotIndex = -1, then array is sorted
        if(pivotIndex == -1){
            int ans = binarySearch(nums, 0, n-1, target);
            return ans;
        }
        else{
            //array is not sorted, array is rotated sorted
            //array can be divided in l1 and l2

            //indexes for l1
            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if(target >= nums[startArray1] && target <= nums[endArray1]){
                int ans = binarySearch(nums, startArray1, endArray1, target);
                return ans;
            }

            //indexes for l2
            int startArray2 = pivotIndex + 1;
            int endArray2 = n-1;
            if(target >= nums[startArray2] && target <= nums[endArray2]){
                int ans = binarySearch(nums, startArray2, endArray2, target);
                return ans;
            }

        }
        return -1;
    }
    public static void main(){
        int arr[] = {50, 60, 70, 10, 20, 30, 40};
        System.out.println(search(arr, 70));
    }
}
