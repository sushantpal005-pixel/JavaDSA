package Binary_Search.lec_47;

public class Main {
    static int singleNonDuplicates(int[] arr){
        int n = arr.length;

        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            //single element
            if(s==e){
                return arr[s];
            }
            //non single element array
            //check whether mid element is a ans or not
            int currentValue = arr[mid];
            int prevValue = -1;

            if(mid-1 >=0){
                prevValue = arr[mid - 1];
            }
            int nextValue = -1;
            if(mid+1 < n){
                nextValue = arr[mid+1];
            }

            if(currentValue != prevValue && currentValue != nextValue){
                return currentValue;
            }
            if(currentValue != prevValue && currentValue == nextValue){
                int startingIndexOfPair = mid;
                if(startingIndexOfPair % 2 != 0){
                    //startingIndex -> odd wala case
                    //ans left me hoga
                    e = mid - 1;
                }
                else{
                    //startingIndex -> even wala case
                    //
                    s = mid +1;
                }
            } else if (currentValue == prevValue && currentValue != nextValue) {
                int endingIndexOfPair = mid;
                if(endingIndexOfPair % 2 != 0){
                    //ending index is odd
                    //move to right
                    s = mid + 1;
                }
                else{
                    //ending index is even
                    //move to left
                    e = mid - 1;
                }
                
            }

        }
        return -1;
    }

    static void main() {
        int[] arr = {10, 10, 20, 20, 30, 30, 40, 40, 50, 60, 60};
        System.out.println(singleNonDuplicates(arr));
    }
}
