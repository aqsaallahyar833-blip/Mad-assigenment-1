// Program 2: Polymorphism - Shape Area (Circle / Rectangle)
class Shape {
    public void area() { System.out.println("Area not known"); }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    public void area() { System.out.println("Circle area: " + (3.14 * radius * radius)); }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    public void area() { System.out.println("Rectangle area: " + (length * width)); }
}

public class Polymorphism02 {
    public static void main(String[] args) {
        Shape s = new Circle(2);
        s.area();                      // Circle version runs
        s = new Rectangle(4, 5);
        s.area();                      // Rectangle version runs
    }
}
