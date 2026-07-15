package Binary_Search.lec_42;

public class Main {
    static boolean isValidSoln(int boards[], int k, int maxLength){
        // mid -> max length of boards, a painter can paint
        // > than that is not allowed
        // mid -> maxLength
        int painterCount = 1;
        int paintedLength = 0;
        for (int i = 0; i < boards.length; i++) {
            if(paintedLength + boards[i] <= maxLength){
                //asign that board to the painter
                paintedLength += boards[i];
            }
            else{
                //paintedLength + boards[i] > maxLength
                painterCount++;
                paintedLength = 0;
                if(painterCount > k || boards[i] > maxLength){
                    return false;
                }
                else{
                    //na to painterCount me koi dikkat hai
                    //na to maxLength me koi dikkat hai
                    //assign current board to current painer
                    paintedLength += boards[i];
                }

            }
        }
        //agr mai yha aagya hu, to iska mtlb ye h, ki boards ka entire array
        //successfully travel and assign ho chuka hai
        return true;
    }
    static int minTime(int[] boards, int k){
        int sum = 0;
        for (int i = 0; i < boards.length; i++) {
            sum += boards[i];
        }

        int ans = -1;
        int s = 0;
        int e = sum;

        while (s <= e){
            int mid = s + (e - s) / 2;

            if(isValidSoln(boards, k, mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                //not valid
                s = mid + 1;
            }
        }
        return ans;
    }


    static void main() {
        int[] arr = {10, 20, 30, 40};
        System.out.println(minTime(arr, 2));
    }
}
