package OOPS.AbstractDesign;

//abstract class Bird {
//    abstract  void fly();
//    abstract void eat();
//
//    public void sleep(){
//        System.out.println("Bird sleeping");
//    }
//}
//
//
//
//class Sparrow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("sparrow flying krti hai.");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("sparrow eating.");
//    }
//}
//
//
//
//class Crow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Crow flying.");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eat krta h akg way se.");
//    }
//}
//
//public class Main {
//    public static void doBirdStuff(Bird b){
//        b.eat();
//        b.fly();
//        b.sleep();
//    }
//    public static void main() {
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//
//    }
//}

//Interface

interface Bird {
    void fly();
    void eat();

    default void sleep(){
        System.out.println("Bird sleep");
    }
}
interface Walk{
    int legs = 4;
    void walking();
}

class Sparrow implements Bird, Walk{
    @Override
    public void fly(){
        System.out.println("Sparrow flying.");
    }
    public void eat(){
        System.out.println("Sparrow eating.");
    }
    public void walking(){
        int a = Walk.legs;
        System.out.println("Sparrow Walks");
    }
}

class Crow implements Bird{
    @Override
    public void fly() {
        System.out.println("Crow flying.");
    }

    @Override
    public void eat() {
        System.out.println("Crow eat krta h alg way se.");
    }

}

public class Main {
    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
        b.sleep();
    }
    public static void main() {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

    }
}
