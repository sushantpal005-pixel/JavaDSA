package Recursion.lec_57;

public class Main {
    //print name 10 times using recursion
    static void myName(int n){
        if(n == 0) return;
        System.out.println("Sushant");
        myName(n - 1);
    }
    //print 1 to n using recursion
    static void print1ToN(int count, int n){
        if(count > n) return;
        System.out.println(count);
        print1ToN(count+1, n);
    }
    //print n to 1 using recursion
    static void printNto1(int n){
        if(n == 0) return;
        System.out.println(n);
        printNto1(n-1);
    }
    //print array using recursion
    static void printArray(int[] arr, int index){
        if(index == arr.length) return;
        System.out.println(arr[index]);
        printArray(arr, index+1);
    }
    //max element using recursion
    static void maxElement(int[] arr, int index, int max) {
        if (index == arr.length) {
            System.out.println("Max Element: " + max);
            return;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        maxElement(arr, index+1, max);
    }
    //min element using recursion
    static void minElement(int[] arr, int index, int min) {
        if (index == arr.length) {
            System.out.println("Max Element: " + min);
            return;
        }
        if (arr[index] < min) {
            min = arr[index];
        }
        minElement(arr, index+1, min);
    }
    //search element using recursion
    static int searchElement(int[] arr, int index, int element){
        if(index == arr.length) return -1;
        if(arr[index] == element) return index;
        int ans = searchElement(arr, index+1, element);
        return ans;
    }
    //count element in array using recusion
    static int countElement(int[] arr, int index, int count, int element){
        if(index == arr.length) return count;
        if(arr[index] == element) count++;
        int ans = countElement(arr, index+1, count, element);
        return ans;
    }
    //print digits using recursion
    static void printDigit(int n){
        if(n == 0) return;

        printDigit(n/10);
        System.out.println(n % 10);
    }

    static void main(String[] args) {
        //myName(10);
        //print1ToN(0, 10);
        //printNto1(10);
        //printArray(new int[]{1, 2, 3}, 0);
        //maxElement(new int[]{1, 2, 3, 4}, 0, 0);
        //minElement(new int[]{1, 2, 3, 4}, 0, 999);
        //System.out.println(searchElement(new int[]{1, 2, 3, 4}, 0, 4));
        //System.out.println(countElement(new int[]{1, 2, 3, 3, 4}, 0, 0, 3));
        printDigit(12);


    }
}
