package Recursion.lec_77;

public class Main {
    static void quickSort(int[] arr, int s, int e){
        //base case
        if(s >= e) return;

        //partitioning
        int pivotIndex = partition(arr, s, e);
        //left part recursion se sort krva lo
        quickSort(arr, s, pivotIndex - 1);
        //right part recursion se sort krva lo
        quickSort(arr, pivotIndex + 1, e);


    }
    static int partition(int[] arr, int s, int e){
        //choose pivot element -> starting element, ending element, random element
        int pivotElement = arr[s];
        //is pivot element ko iski correct position pr rakhdo
        //count based approach, lomuto, hoare etc
         int count = 0;
         for(int i = s + 1; i < e; i++){
             if(arr[i] <= pivotElement){
                 count++;
             }
         }
         int correctPosition = s + count;
         //place pivot element at its correct position
        //swap pivot element with element that is present at its correct position
        int temp = arr[correctPosition];
        arr[correctPosition] = arr[s];
        arr[s] = temp;

        //ab bs left and right me make sure krna h k chote or bde element respectively placed krde
        int i = s;
        int j = e;
        while(i < correctPosition && j > correctPosition){
            //left part me jitne bhi shi element h
            //un elements ko ignore kro or i ko move kro
            while(arr[i] <= pivotElement) i++;
            //right part me jitne bhi shi element h
            //un elements ko ignore kro or j ko move kro
            while(arr[j] > pivotElement) j--;
            //ap ek aisi jagah khade h jha mujhe, arr[i], arr[j] ko swap krna chahiye
            if(i < correctPosition && j > correctPosition){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return correctPosition;
    }
}
