// Program 4: Encapsulation - Employee Information
class Employee {
    private int id;            // private data is hidden
    private String name;
    private double salary;

    public void setInfo(int i, String n) { id = i; name = n; salary = 20000; }   // setter
    public void raiseSalary(double amount) {                                     // rule kept inside
        if (amount > 0) { salary = salary + amount; }
    }
    public void show() { System.out.println(id + " " + name + " Salary: " + salary); }  // getter
}

public class Encapsulation04 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setInfo(101, "Bilal");
        e.raiseSalary(5000);
        e.show();
    }
}
