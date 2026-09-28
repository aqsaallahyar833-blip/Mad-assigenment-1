// Program 2: Inheritance - Vehicle is the parent of Car
class Vehicle {
    int wheels;
    Vehicle(int w) { wheels = w; }
    void showWheels() { System.out.println("Number of wheels: " + wheels); }
}

class Car extends Vehicle {                      // Car inherits Vehicle
    String brand;
    Car(String b) { super(4); brand = b; }        // super() calls the parent constructor
    void showCar() { System.out.println("Car brand: " + brand); }
}

public class Inheritance02 {
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        c.showWheels();   // inherited method from Vehicle
        c.showCar();      // method of Car
    }
}
