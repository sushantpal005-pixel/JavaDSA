public class Loops {
    static void main() {

        //for loop
        for(int i = 1; i <= 5; i++){
            System.out.println("value of i: " + i );
        }
        for(int i = 1; i <= 10; i++){
            System.out.println("Sushant");
        }
        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 3 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 3 ; j++) {
                System.out.println("i = " + i + ",j = " + j);
            }
        }
        for (int i = 1; i <= 10; i++){
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++){
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        //while loop
        int i = 1;
        while(i<=5){
            System.out.println("sushant");
            i++;
        }

        int j = 1;
        while(j <= 2){
            int k = 1;
            while(k <= 3){
                System.out.println("j = " + j + ", k = " + k);
                k++;
            }
            j++;
        }

        //do while loop
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k <= 1);


    }
}
