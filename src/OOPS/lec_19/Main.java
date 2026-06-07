package OOPS.lec_19;

public class Main {
    static void main() {
//        Car c = new Car("maruti", "700", 4, 5, "Auto");
//        c.startEngine();
//        c.startAc();
//        c.stopEngine();

        MotorCycle m = new MotorCycle("Splendor", "XLine", 2, "U", "Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
