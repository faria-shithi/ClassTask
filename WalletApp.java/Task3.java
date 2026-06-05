public class Task3 {
    private double balance;
    private final int id;
    private static int counter = 0;
    Task3() {
        this.id = ++counter;
        this.balance = 0;
    }
    Task3(double balance) {
        this.id = ++counter;
        this.balance = balance;
    }
    void deposit(double amount)  { balance += amount; }
    void withdraw(double amount) { balance -= amount; }
    void print() {
        System.out.println("ID: " + id + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        Task3 w1 = new Task3();
        Task3 w2 = new Task3(700);
        w1.deposit(1000);
        w2.withdraw(550);
        w1.print();
        w2.print();
    }
}
