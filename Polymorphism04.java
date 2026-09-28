// Program 4: Polymorphism - Notification (SMS / Email)
class Notification {
    public void send(String text) { System.out.println("Notification: " + text); }
}

class SMS extends Notification {                  // overriding send()
    public void send(String text) { System.out.println("SMS sent: " + text); }
}

class Email extends Notification {                // overriding send()
    public void send(String text) { System.out.println("Email sent: " + text); }
}

public class Polymorphism04 {
    public static void main(String[] args) {
        Notification n1 = new SMS();      // parent type holding child object
        Notification n2 = new Email();
        n1.send("Your result is declared");
        n2.send("Your result is declared");
    }
}
