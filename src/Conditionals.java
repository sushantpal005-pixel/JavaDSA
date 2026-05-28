import java.util.Scanner;

public class Conditionals {
    static void main() {
        int age = 19;
        if(age > 18) {
            System.out.println("Eligible to vote");
        }
        int marks = 33;
        if(marks > 33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }


        int day = 10;
        if(day == 1){
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
        else if (day == 4) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
        }


        int age1 = 12;
        char gender = 'F';

        if(gender == 'M'){
            System.out.println("you are a male");
            if(age1 > 18){
                System.out.println("you are male and age > 18");
            }
            else{
                System.out.println("you are male and age <= 18");
            }
        }
        else {
            System.out.println("you are not a male");
            if(age1 > 18){
                System.out.println("you are not a male and age > 18");
            }
            else{
                System.out.println("you are not a male and age <= 18");
            }
        }

        int streak = 30;
        String status = (streak >= 30) ? "Consistent": "Irregular";
        System.out.println(status);

        System.out.println("Enter roll no.");
        Scanner sc = new Scanner(System.in);
        int rollNo = sc.nextInt();
        switch (rollNo) {
            case 1:
                System.out.println("Sushant");
                break;
            case 2:
                System.out.println("Abhay");
                break;
            case 3:
                System.out.println("Ankit");
                break;
            case 4:
                System.out.println("Shashikant");
                break;
            case 5:
                System.out.println("Nishant");
                break;
            default:
                System.out.println("Enter roll no. between 1 to 5");
        }

    }
}
