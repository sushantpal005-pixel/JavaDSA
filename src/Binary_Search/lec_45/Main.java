package Binary_Search.lec_45;

public class Main {
    static boolean isValidAns(int totalPratas, int[] cooks, int timeLimit){
        int prataCount = 0;
        //ek ek krke har cook ke pas jayenge
        for (int i = 0; i < cooks.length; i++) {
            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;

            //agr currentCookRank -> R
            // 1*R, 2*R, 3*R, .....
            //cook krna start karwao
            while(timeTaken <= timeLimit){
                if(timeTaken + j * currentCookRank <= timeLimit){
                    //iska mtlb mai ye prata bana skta hu
                    timeTaken = timeTaken + j*currentCookRank;
                    prataCount++;
                    j++;
                }
                else{
                    //iska mtlb current prata time limit ke ander nhi ban skta
                    break;
                }
            }
            //jb ye loop khatam hota h, to ye ith cook jitne prate bna skta tha,
            //unko totalPrataCount me add kr chuka hota h
            if(prataCount >= totalPratas){
                return true;
            }
        }
        if(prataCount >= totalPratas){
            return true;
        }
        else{
            return  false;
        }
    }

    static int minTimeToCookPratas(int p, int[] cook, int n){
        //p -> no. of pratas to cook
        //n -> no. of cooks

        int maxRank = -1;
        for (int i = 0; i < cook.length; i++) {
            if(cook[i] > maxRank){
                maxRank = cook[i];
            }
        }

        int s = 0;
        int e = maxRank * (p * (p+1) / 2);
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(isValidAns(p, cook,mid)){
                //store ans
                ans = mid;
                //move to left
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }

    static void main() {
        int[] arr = {1,2,3,4};
        System.out.println(minTimeToCookPratas(10, arr, 4));
    }
}
