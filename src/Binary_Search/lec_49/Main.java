package Binary_Search.lec_49;

public class Main {
    static int getFirstOccIndex(int[][] arr, int rowIndex){
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int target = 1;
        int ans = -1;
        //handling case where there is no ones inside the row
        if(arr[rowIndex][totalCol-1] == 0){
            //means there is no ones inside the row
            return totalCol;
        }
        else{
            //1 exists inside the row
            int s = 0;
            int e = totalCol - 1;
            while(s <= e){
                int mid = s + (e - s) / 2;
                if(arr[rowIndex][mid] == 0){
                    //move to righ
                    s = mid + 1;
                }
                else{
                    ans = mid;
                    //move left
                    e = mid - 1;
                }
            }
        }
        return ans;
    }

     static int rowWithMaxOnes(int[][] mat){
         int totalRow = mat.length;
         int totalCol = mat[0].length;
         int maxi = -1;
         int maxOneWaliRowIndex = -1;
        //move to each row and for each row
         // find the first occurent
         //using the FO will calculate the count of 1's
         //update the maxi variable or the ans index variable basis on that
         for(int row = 0; row < totalRow; row++){
             //for each row, find FO
             int firstOccIndex = getFirstOccIndex(mat, row);
             //calculate no of 1's
             int oneCount = totalCol - firstOccIndex;
             //update maxi and ans index variable basis on count
             if(oneCount != 0 && oneCount > maxi){
                 //ho skta h k curren row hi answer ho
                 maxi = oneCount;
                 maxOneWaliRowIndex = row;
             }
         }
         return maxOneWaliRowIndex;
     }
}
