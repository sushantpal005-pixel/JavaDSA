public class DataTypes {
    static void main() {

        long value1 = 123456789;
        int value2 = (int)value1;
        System.out.println(value2);






        // Numeric DT - short, byte, int, long
        byte num1 = 50;
        long newNum = num1;
        System.out.println("new num: " + newNum);
        System.out.println(num1);

        short num2 = 500;
        System.out.println(num2);

        int num3 = 50000;
        System.out.println(num3);

        long num4 = 522543245;
        System.out.println(num4);



        // floating DTs
        float num5 = 3.142434f;
        System.out.println(num5);

        double num6 = 3.1434321321465;
        System.out.println(num6);

        //other - char, boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'a';
        System.out.println("My first character is " + (char)(firstCharacter+1));




    }
}
