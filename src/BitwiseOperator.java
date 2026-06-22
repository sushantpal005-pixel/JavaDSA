public class BitwiseOperator {
    static void main() {
//        int a = 5;
//        int b = 6;
//        System.out.println(a & b);       //Bitwise and
//        System.out.println(a | b);       //Bitwise or
//        System.out.println(a ^ b);       //Bitwise xor
//        System.out.println(~a);


//        int n = 1;
//        for (int i = 1; i<=34; i++){
//            n = n << 1;
//            System.out.println(n);
//            System.out.println();
//        }

//        int n = 100;
//        for (int i = 1; i<=10; i++){
//            n = n >> 1;
//            System.out.println(n);
//            System.out.println();
//        }

//        int n = 12;
//        if((n&1) == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }


        //Power of 2
//        int n = 2;
//        int count = 0;
//        while(n != 0){
//            if((n&1) != 0){
//                count++;
//            }
//            n = n >> 1;
//        }
//        System.out.println("Set bit count: "+ count);

//        Alternate method
//        int n = 16;
//        if((n&(n-1)) == 0){
//            System.out.println("Power of 2");
//        }
//        else{
//            System.out.println("Not a power of 2");
//        }

//        System.out.println(3 << 2);
//        System.out.println(16 >> 2);

         int n = 10;
//        System.out.println((n&(n-1)));
        System.out.println((n&(-n)));


    }
}
