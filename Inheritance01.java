// Program 1: Inheritance - Person is the parent of Student
class Person {                                   // parent class
    String name;
    Person(String n) { name = n; }
    void introduce() { System.out.println("My name is " + name); }
}

class Student extends Person {                    // child class inherits Person
    int semester;
    Student(String n, int s) { super(n); semester = s; }
    void showStudy() { System.out.println(name + " is in semester " + semester); }
}

public class Inheritance01 {
    public static void main(String[] args) {
        Student s = new Student("Usman", 3);
        s.introduce();   // method of parent class
        s.showStudy();   // method of child class
    }
}
