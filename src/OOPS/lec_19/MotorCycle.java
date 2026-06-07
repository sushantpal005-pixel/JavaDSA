package OOPS.lec_19;

public class MotorCycle extends Vehicle{
    public String handleBarStyle;
    public String transmissionType;

    MotorCycle(String name, String model, int noOfTyres, String handleBarStyle, String transmissionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.transmissionType = transmissionType;
    }
    public void wheelie(){
        System.out.println("MototCycle is doing wheelieeee!" + name);
    }
}
