public class Task5 {
    private double balance;
    private final int id;
    private static int counter = 0;
    Task5(double balance) {
        this.id = ++counter;
        this.balance = balance;
    }
    static void addBonus(Task5 w, double amount) {
        w.balance += amount;
    }

    static void swap(Task5 a, Task5 b) {
        double temp = a.balance;
        a.balance = b.balance;
        b.balance = temp;
    }

    void print() {
        System.out.println("ID  " + id + "  balance " + balance);
    }

    public static void main(String[] args) {
        Task5 w1 = new Task5(1600);
        Task5 w2 = new Task5(460);

        Task5.addBonus(w1,134);
        System.out.println("After bonus:");
        w1.print();

        System.out.println("\nbefore swap");
        w1.print();
        w2.print();
        Task5.swap(w1, w2);
        System.out.println("after swap ");
        w1.print();   
        w2.print();   
    }
}
