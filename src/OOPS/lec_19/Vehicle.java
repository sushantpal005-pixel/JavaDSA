package OOPS.lec_19;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;


    public Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.println("Engine is starting of " +  name + " : " + model);
    }


    void stopEngine(){
        System.out.println("Engine is stopping of " +  name + " : " + model);
    }
}
