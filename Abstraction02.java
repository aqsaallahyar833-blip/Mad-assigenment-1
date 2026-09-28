// Program 2: Abstraction - Shape (Circle / Rectangle)
abstract class Shape {
    abstract double area();                       // abstract method, no body
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double area() { return 3.14 * radius * radius; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    double area() { return length * width; }
}

public class Abstraction02 {
    public static void main(String[] args) {
        Shape s = new Circle(2);
        System.out.println("Circle area: " + s.area());
        s = new Rectangle(4, 5);
        System.out.println("Rectangle area: " + s.area());
    }
}
