// Program 4: Abstraction - Appliance (Fan / TV)
abstract class Appliance {
    String name;
    Appliance(String n) { name = n; }
    abstract void turnOn();                       // abstract method, no body
    void show() { System.out.println("Appliance: " + name); }   // normal method
}

class Fan extends Appliance {
    Fan() { super("Fan"); }
    void turnOn() { System.out.println("Fan is running at speed 3."); }
}

class TV extends Appliance {
    TV() { super("TV"); }
    void turnOn() { System.out.println("TV is showing a movie."); }
}

public class Abstraction04 {
    public static void main(String[] args) {
        Appliance a = new Fan();
        a.turnOn();
        a.show();
        a = new TV();
        a.turnOn();
    }
}
