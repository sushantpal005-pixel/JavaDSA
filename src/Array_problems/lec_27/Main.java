package Array_problems.lec_27;

public class Main {
    //Problem-1
    static double getAverage(int[] arr){
        double sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        return sum/arr.length;
    }

    //Problem-2
    static int[] mulBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];
        for (int i=0; i<size; i++){
            int element = arr[i];
            int newElement = element*10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    //Problem-3
    static boolean find(int target, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    //Problem-4
    static int max(int arr[]){
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        return maxi;
    }

    //Problem-5
    static int[] getPosNegSum(int arr[]){
        int posSum = 0;
        int negSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                posSum = posSum + arr[i];
            }
            else {
                negSum = negSum + arr[i];
            }
        }
        int ans[] = {posSum, negSum};
        return ans;
    }

    //Problem-6
    static int[] count0and1(int arr[]){
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros = zeros + 1;
            }
            else {
                ones = ones + 1;
            }
        }
        int ans[] = {zeros, ones};
        return ans;
    }

    //Problem-7
    static int getUnsortedElement(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[i+1]){
                return arr[i+1];
            }
        }
        return -1;
    }
    static void main() {

        int arr[] = {1,2,5,4,9};
        System.out.println(getUnsortedElement(arr));

//        int arr[] = {0, 1, 0, 0, 1};
//        int ans[] = count0and1(arr);
//        System.out.println("no. of zeros: " + ans[0]);
//        System.out.println("no. of ones: " + ans[1]);


//        int arr[] = {1, -3, 5, 7, -9};
//        int ans[] = getPosNegSum(arr);
//        System.out.println("Positive sum : " + ans[0]);
//        System.out.println("Negative sum : " + ans[1]);

//        System.out.println(max(arr));



//        int arr[] = {1,3,5,7,8};
//        boolean ans = find(8, arr);
//        System.out.println(ans);


//
//        int arr[] = {1,2,3,4,5};
//        int ans[] = mulBy10(arr);
//        System.out.println("Printing ans array: ");
//        for(int i : ans){
//            System.out.println(i);
//        }



//        int[] arr = {2,4,1,3};
//        System.out.println(getAverage(arr));

    }
}
