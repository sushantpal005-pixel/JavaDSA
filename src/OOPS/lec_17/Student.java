package OOPS.lec_17;

public class Student {
    //Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 100){
            this.age = age;
        }
        return;
    }

    public int getId() {
        return this.id;
    }

    public int getNos() {
        return this.nos;
    }

    public String getGf() {
        return this.gf;
    }

    //Default ctor
    public Student(){
        System.out.println("Student default ctor Called");
    }

    //Parameterised ctor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("Student Parameterised ctor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    //Copy ctor
    public Student(Student srcobj){
        System.out.println("Student Parameterised ctor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    //Methods
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }
    private void gfChatting(){
        System.out.println("gfChatting");
    }
}
