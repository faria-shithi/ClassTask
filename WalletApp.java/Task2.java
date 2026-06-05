public class Task2 {
    private double balance;

    Task2(double balance) {
        this.balance = balance;
    }
    void deposit(double amount) {
        this.balance += amount;
    }
    
    void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("invalid");
            return;
        }
        this.balance -= amount;
    }
    void print() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Task2 w1 = new Task2(1200);
        w1.deposit(100);
        w1.print();
        Task2 w2 = new Task2(1400);
        w2.withdraw(200);
        w2.print();
    }
}
