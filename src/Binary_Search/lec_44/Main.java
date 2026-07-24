package Binary_Search.lec_44;

public class Main {

    static boolean isValidAns(int[] trees, int m, int maxHeight){
        long totalWoodCount = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > maxHeight){
                //cut kro
                long currentTreeWoodCollected = trees[i] - maxHeight;
                totalWoodCount += currentTreeWoodCollected;
            }
        }
        if(totalWoodCount >= m){
            return true;
        }
        else{
            return false;
        }
    }

    static int maxSawHeight(int[] trees, int m){
        int n = trees.length;
        int s = 0;
        int maxi = -1;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(trees[i] > maxi){
                maxi = trees[i];
            }

        }
        int e = maxi;

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(isValidAns(trees, m, mid)){
                //store ans
                ans = mid;
                //move to right
                s = mid + 1;
            }
            else{
                //move to left
                e = mid - 1;
            }
        }
        return ans;
    }

    static void main() {
        int[] arr = {20, 15, 10, 17};
        System.out.println(maxSawHeight(arr, 7));
    }
}
