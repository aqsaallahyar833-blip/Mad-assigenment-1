// Program 1: Polymorphism - Animal Sounds (Dog / Cat)
class Animal {
    public void sound() { System.out.println("Animal makes a sound"); }
}

class Dog extends Animal {                        // overriding sound()
    public void sound() { System.out.println("Dog barks: Woof Woof"); }
}

class Cat extends Animal {                        // overriding sound()
    public void sound() { System.out.println("Cat meows: Meow Meow"); }
}

public class Polymorphism01 {
    public static void main(String[] args) {
        Animal[] list = { new Dog(), new Cat() };
        for (Animal a : list) {
            a.sound();   // same call, different output = polymorphism
        }
    }
}
