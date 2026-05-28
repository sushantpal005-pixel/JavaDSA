import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for firstNum: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for secondNum: ");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is " + ans);

        System.out.println("Enter the value for bg: ");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("Enter the value for flag:");
        boolean flag = sc.nextBoolean();

        System.out.println("Enter the value for shortVal: ");
        short shortVal = sc.nextShort();

        System.out.println("Enter the value for floatValue: ");
        float floatValue = sc.nextFloat();

        System.out.println("Biginteger: " + bg);
        System.out.println("flag is: " + flag);
        System.out.println("shortVal is: " + shortVal);
        System.out.println("floatValue is: " + floatValue);

        sc.close();


    }
}
