public class Task1 {

    static double deposit(double balance, double amount) {
        return balance + amount;
    }
    static double withdraw(double balance, double amount) {
        if (amount > balance) {
            System.out.println("Invalid");
            return balance;
        }
        return balance - amount;
    }
    public static void main(String[] args) {
        double balance_1 = 800;
        double balance_2 = 400;
        balance_1 = deposit(balance_1, 200);
        System.out.println("Balance 1: " + balance_1);
        balance_2 = withdraw(balance_2, 300);
        System.out.println("Balance 2: " + balance_2);
    }
}
