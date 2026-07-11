package Binary_Search.lec_40;

public class Main {
    //square root using binary search or binary search on answer
    static int mySqrt(int x) {
        int s = 1;
        int e = x;
        double ans = -1;

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
        double factor = 1;
        int totalPrecision = 3;
        for (int round = 1; round <= totalPrecision; round++) {
            factor = factor / 10;
            for (int i = 1; i <= 10 ; i++) {
                double newAns = ans + factor;
                  //equality code is ignored as of now, but make sure that you keep this in ur final code
//                if (newAns * newAns == x) {
//                    return newAns;
//                }
                if(newAns * newAns < x){
                    ans = newAns;
                }
                else{
                    break;
                }
            }
            System.out.println("is round ka ans is: " + Math.round(ans * 1000.0) / 1000.0);
        }
        System.out.println("final round ka ans is: " + Math.round(ans * 1000.0) / 1000.0);

        //returning dummy value
        return -1;
    }

    static void main() {
        System.out.println(mySqrt(56));
    }
}
