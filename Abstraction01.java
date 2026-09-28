// Program 1: Abstraction - Vehicle (Car / Bike)
abstract class Vehicle {                          // abstract class
    abstract void start();                        // abstract method, no body
}

class Car extends Vehicle {
    void start() { System.out.println("Car started with key."); }
}

class Bike extends Vehicle {
    void start() { System.out.println("Bike started with self start."); }
}

public class Abstraction01 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v = new Bike();
        v.start();
    }
}
