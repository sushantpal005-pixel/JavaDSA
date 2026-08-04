package Binary_Search.lec_50;

public class Main {
    static class InfinityArray {

        int[] arr;

        InfinityArray(int[] arr) {
            this.arr = arr;
        }

        public int get(int index) {
            if (index >= arr.length) {
                return Integer.MAX_VALUE;
            }

            return arr[index];
        }
    }

    static int unboundedSearch(InfinityArray arr, int target){
        if(arr.get(0) == target){
            return 0;
        }
        int i = 1;
        while(arr.get(i) <= target){
            i = i * 2;
        }
        if(arr.get(i) > target){
            int s = i/2;
            int e = i;
            //normal binary search use krlo ab
            while(s <= e){
                int mid = s + (e - s) / 2;
                if(arr.get(mid) == target){
                    return mid;
                }
                if(arr.get(mid) > target){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
        }
        else{
            return -1;
        }
        return -1;
    }

    static void main() {
        InfinityArray arr = new InfinityArray(new int[]{
                2, 5, 8, 11, 14, 17, 20, 23, 26, 29,
                32, 35, 38, 41, 44, 47, 50, 53, 56, 59,
                62, 65, 68, 71, 74, 77, 80, 83, 86, 89,
                92, 95, 98, 101, 104, 107, 110, 113, 116, 119,
                122, 125, 128, 131, 134, 137, 140, 143, 146, 149,
                152, 155, 158, 161, 164, 167, 170, 173, 176, 179,
                182, 185, 188, 191, 194, 197, 200, 203, 206, 209,
                212, 215, 218, 221, 224, 227, 230, 233, 236, 239,
                242, 245, 248, 251, 254, 257, 260, 263, 266, 269,
                272, 275, 278, 281, 284, 287, 290, 293, 296, 299
        });

        int target = 293;

        System.out.println(unboundedSearch(arr, target));
    }
}

