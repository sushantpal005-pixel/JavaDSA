package Recursion.lec_67;

public class Main {
    static boolean solve(int[] arr, int k, int sum, int index){
        if(index >= arr.length){
            //subsequence ready h
            //or ye subs hum sum wale variable me track krre the
            //iska mtlb sum ko check krte h
            if(sum == k) return true;
            else return false;
        }

        //ek case hum solvee krenge baki recursion sambhal lega
        //include exclude pattern lgana h
        //exclude ka case
        boolean excludeKaAns = solve(arr, k, sum, index + 1);
        //include ka case
        boolean includeKaAns = solve(arr, k, sum + arr[index], index + 1);
        //agr donno me se kisi ka bhi true aajaye
        //to uper true bhej denge using OR operator
        boolean finalAns = excludeKaAns || includeKaAns;
        return finalAns;
    }
    static boolean checkSubsequenceSum(int[] arr, int k){
        int index = 0;
        int sum = 0;
        boolean ans = solve(arr, k, sum, index);
        return ans;
    }

    static void main() {
        System.out.println(checkSubsequenceSum(new int[]{1, 2, 3}, 5));
    }
}
