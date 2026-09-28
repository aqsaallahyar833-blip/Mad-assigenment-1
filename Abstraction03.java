// Program 3: Abstraction - Payment (Cash / Card)
abstract class Payment {
    abstract void pay(double amount);             // abstract method, no body
}

class Cash extends Payment {
    void pay(double amount) { System.out.println(amount + " paid in cash."); }
}

class Card extends Payment {
    void pay(double amount) { System.out.println(amount + " paid by card."); }
}

public class Abstraction03 {
    public static void main(String[] args) {
        Payment p = new Cash();
        p.pay(2000);
        p = new Card();
        p.pay(2000);
    }
}
