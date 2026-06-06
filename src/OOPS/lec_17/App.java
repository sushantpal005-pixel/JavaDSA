package OOPS.lec_17;

public class App {
    static void main() {
//        Student A = new Student();
//        A.id = 1;
//        A.age = 21;
//        A.name = "Sushant";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        //Parameterised Ctor
        Student A = new Student(1, 21, "Sushant", 6);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        A.bunk();
        A.study();
        A.sleep();

        //copy Ctor
//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.sleep();
    }
}
