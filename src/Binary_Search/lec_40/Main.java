package Binary_Search.lec_40;

public class Main {
    //square root using binary search or binary search on answer
    static int mySqrt(int x) {
        int s = 1;
        int e = x;
        int ans = -1;

        if(x == 0){
            return 0;
        }

        while(s <= e){
            int mid = s + (e-s)/2;

            if(mid  == x/mid){
                return mid;
            }
            else if(mid > x/mid){
                //move to left
                e = mid - 1;
            }
            else{
                //mid * mid < x
                //store the current ans and move to right
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    static void main() {
        System.out.println(mySqrt(49));
    }
}
