public class Pattern_Printing {
    static void main() {
        // Pattern 1
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 5 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 3
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

        // Pattern 4
//        for (int i = 4; i >= 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
        // Pattern 5
//        for (int i = 4; i >= 0 ; i--) {
//            for (int j = 0; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 6
//        int n = 5;
//        for (int i = 1; i <= n; i++){
//            for (int k = 1; k <= n-i; k++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 7
//        int n = 5;
//        for (int i = n; i >= 1 ; i--) {
//            for (int k = 1; k <= n-i ; k++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1; j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        // Pattern 8
//        int n = 4;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= 6; j++) {
//                if (i == 1 || i == n) {
//                    System.out.print("* ");
//                }
//                else {
//                    if (j == 1 || j == 6) {
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }

        // Pattern 9
//        int n = 10;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++){
//                if(i == 1 || i == 2 || i == n){
//                    System.out.print("* ");
//                }
//                else {
//                    if(j == 1 || j == i){
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }

        //Pattern 10
//        int n = 10;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print("  ");
//            }
//            if (i == 1 || i == n){
//                for (int k = 1; k <= 2*i-1 ; k++) {
//                    System.out.print("* ");
//                }
//            }
//            else{
//                System.out.print("* ");
//                for (int j = 1; j <= 2*i-3; j++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 11
        //upper half
//        for (int i = 1; i <= 4 ; i++) {
//            for (int j = 1; j <= 4-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= 2*i-1; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //lower half
//        for(int i = 3; i >= 1; i--){
//            for (int j = 0; j <= 3-i; j++){
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= 2*i-1; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 12
        //upper half

//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= 5-i ; j++) {
//                System.out.print("  ");
//            }
//            if(i == 1){
//                System.out.print("* ");
//            }
//            else{
//                System.out.print("* ");
//                for (int j = 1; j <= 2*i-3; j++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // lower half
//
//        for (int i = 4; i >= 1 ; i--) {
//            for (int j = 0; j <= 4 - i; j++) {
//                System.out.print("  ");
//            }
//            if (i == 1) {
//                System.out.print("* ");
//            }
//            else{
//                System.out.print("* ");
//                for (int j = 1; j <= 2*i-3 ; j++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        
        // Pattern 13
//        int n = 4;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2*(n-i) ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n-i+1 ; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2*(i-1); j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= n-i+1 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 14
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Pattern 15
//        int count = 1;
//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(count);
//                count = count + 1;
//            }
//            System.out.println();
//        }

        // Pattern 16
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print((char)((int)j + 64));
//            }
//            System.out.println();
//        }

        // Pattern 17
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char)(70 - (int)j));
//            }
//            System.out.println();
//        }

        // Pattern 18
//        int n = 5;
//        for (int i = n; i >= 1 ; i--) {
//            for (int k = 1; k <= n-i ; k++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1; j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        for (int i = 2; i <= n; i++){
//        for (int k = 1; k <= n-i; k++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1; j++){
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 19
//        int n = 4;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+ " ");
//            }
//            int rowValue = i;
//            int decRowValue = rowValue - 1;
//            for (int j = 1; j <= i-1; j++) {
//                System.out.print(decRowValue + " ");
//                decRowValue--;
//            }
//            System.out.println();
//        }

        // Pattern 20
//        int n = 4;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*i-1 ; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // Pattern 21
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char)(64+ (int)j) + " ");
//            }
//            char toPrint = (char)(i + 'A' -2);
//            for (int j = 1; j <= i-1 ; j++) {
//                System.out.print(toPrint + " ");
//                toPrint--;
//            }
//            System.out.println();
//        }






    }
}
