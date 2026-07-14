package Binary_Search.lec_41;

public class Main {
    static boolean isValidAnswer(int arr[], int k, long maxPages){
        // check whether mid or maxPages is a valid ans or not
        int studentCount = 1;
        long pages = 0;

        for(int i = 0; i < arr.length; i++){
            if(pages + arr[i] <= maxPages){
                //means current book can be assigned
                //as it is not out of limit
                //then assign
                pages = pages + arr[i];
            }
            else{
                //current student ko current book
                //cannot be assigned wala case
                studentCount++;
                if(studentCount > k || arr[i] > maxPages){
                    return false;
                }
                else{
                    //can assign to new student
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }
    static int findPages(int[] arr, int k) {

        //to find a valid answer books count must be greater than equals to students present
        if(arr.length < k){
            return -1;
        }
        // code here
        int n = arr.length;
        long s = 1;
        long sum = 0;


        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        long e = sum;

        long ans = -1;

        while(s <= e){
            long mid = s + (e-s) / 2;
            if(isValidAnswer(arr, k, mid)){
                //true wala case
                ans = mid;
                e = mid - 1;
            }
            else{
                //false wala case
                s = mid + 1;
            }
        }
        return (int) ans;
    }

    static void main() {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(findPages(arr, 2));
    }
}
