// Program 1: Encapsulation - Student Information
class Student {
    private String name;   // private data is hidden
    private int marks;

    public void setData(String n, int m) { name = n; marks = m; }  // setter
    public String getResult() { return name + " scored " + marks; }  // getter
}

public class Encapsulation01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Ali", 88);
        System.out.println(s.getResult());
    }
}
