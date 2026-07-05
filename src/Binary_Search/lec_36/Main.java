package Binary_Search.lec_36;

public class Main {
    static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
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

    static void main() {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 5));
    }
}
