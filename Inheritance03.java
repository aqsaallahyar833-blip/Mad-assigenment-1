// Program 3: Inheritance - Animal is the parent of Dog
class Animal {
    String name;
    Animal(String n) { name = n; }
    void eat() { System.out.println(name + " is eating."); }
}

class Dog extends Animal {                       // Dog inherits Animal
    String breed;
    Dog(String n, String b) { super(n); breed = b; }
    void bark() { System.out.println(name + " the " + breed + " is barking."); }
}

public class Inheritance03 {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", "German Shepherd");
        d.eat();    // inherited method from Animal
        d.bark();   // method of Dog
    }
}
