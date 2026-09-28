// Program 3: Encapsulation - Mobile Phone
class MobilePhone {
    private String model;   // private = hidden from outside the class
    private int battery;

    public void setDetails(String m, int b) { model = m; battery = b; }        // setter
    public void charge(int extra) { battery = battery + extra; }               // public method
    public String getInfo() { return model + " Battery: " + battery + "%"; }  // getter
}

public class Encapsulation03 {
    public static void main(String[] args) {
        MobilePhone p = new MobilePhone();
        p.setDetails("Samsung A55", 40);
        p.charge(25);
        System.out.println(p.getInfo());
    }
}
