public class Methods {

    static void print2KaTable(){
        for (int i = 1; i <= 10; i++) {
        int ans = 2*i;
            System.out.println(ans);
        }
    }
    static void printSum(int x, int y){
        System.out.println(x+y);
    }

    static void printMultiplication(int a, int b){
        int ans = a * b;
        System.out.println("Result "+ ans);
    }

    static int add(int x, int y){
        int sum = x + y;
        return sum;
    }

    static int add(int x, int y, int z){
        int ans = x + y + z;
        return ans;
    }

    static void solve(int num){
        System.out.println("Inside solve: " + num);
        num = num + 10;
        System.out.println("Inside solve: " + num);
    }
    
    static void printMultiples(){
        int value = 20;
        for (int i = 1; i <= 10; i++) {
            System.out.println(20*i);
        }
    }
    static void main() {
        printMultiples();
//        int num = 5;
//        System.out.println("Inside main: " + num);
//        solve(num);
//        System.out.println("Inside main: " + num);
//        int res = add(4, 5);
//        System.out.println(res);
//        int res2 = add(1, 2, 3);
//        System.out.println(res2);
//        printMultiplication(4, 5);
//        printSum(2, 3);
//        System.out.println("hi");
//        print2KaTable();
//        System.out.println("bye");
    }
}
