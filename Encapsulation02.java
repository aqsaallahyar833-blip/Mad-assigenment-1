// Program 2: Encapsulation - Bank Account
class BankAccount {
    private final String holder;   // private data is hidden
    private double balance;

    public BankAccount(String h) { holder = h; balance = 0; }
    public void deposit(double amount) { balance = balance + amount; }   // safe change
    public double getBalance() { return balance; }                       // getter only
}

public class Encapsulation02 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ahmed");
        acc.deposit(5000);
        System.out.println("Balance of " + acc.getBalance());
    }
}
