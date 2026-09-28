// Program 3: Polymorphism - Payment Method (Cash / Card)
class Payment {
    double amount;
    Payment(double a) { amount = a; }
    public void pay() { System.out.println("Payment of " + amount + " processed."); }
}

class Cash extends Payment {                      // overriding pay()
    Cash(double a) { super(a); }
    public void pay() { System.out.println(amount + " paid in cash."); }
}

class Card extends Payment {                      // overriding pay()
    Card(double a) { super(a); }
    public void pay() { System.out.println(amount + " paid by card."); }
}

public class Polymorphism03 {
    public static void main(String[] args) {
        Payment p = new Cash(1500);
        p.pay();                     // Cash version runs
        p = new Card(1500);
        p.pay();                     // Card version runs
    }
}
