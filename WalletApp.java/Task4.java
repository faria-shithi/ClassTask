public class Task4 {

    private double balance;
    private final int id;
    private static int counter = 0;
    private String lastWithdrawMode = "NONE";
    Task4(double balance) {
        this.id = ++counter;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) 
            { System.out.println("insufficient");
         return; 
        }
        balance -= amount;
        lastWithdrawMode = "NORMAL";
    }

    void withdraw(double amount, String mode) {
        if (amount > balance) 
            {
                 System.out.println("Insufficient funds!");
                  return;
                 }
        balance -= amount;
        lastWithdrawMode = mode;
    }

    void print() {
        System.out.println("ID: " + id + "  balance: " + balance + " last mode " + lastWithdrawMode);
    }

    public static void main(String[] args) {
        Task4 w1 = new Task4(1500);
        w1.withdraw(200);
        w1.withdraw(430, "ONLINE");
        w1.withdraw(80, "ATM");
        w1.print();
    }
}
