// Program 4: Inheritance - Employee is the parent of Manager
class Employee {
    String name;
    int salary;
    Employee(String n, int s) { name = n; salary = s; }
    void work() { System.out.println(name + " is working as an employee."); }
}

class Manager extends Employee {                 // Manager inherits Employee
    int teamSize;
    Manager(String n, int s, int t) { super(n, s); teamSize = t; }
    void lead() { System.out.println(name + " leads " + teamSize + " members."); }
}

public class Inheritance04 {
    public static void main(String[] args) {
        Manager m = new Manager("Kashif", 90000, 5);
        m.work();   // inherited method from Employee
        m.lead();   // method of Manager
    }
}
