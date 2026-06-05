class Checker {
    private int number;
    public Checker(int number) {
        this.number = number;
    }
    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  
            }
        }
        return true; 
    }

    public void display() {
        System.out.println("Number: " + number);
        if (isPrime()) {
            System.out.println( + number + " is prime");
        } else {
            System.out.println(+ number + " not prime");
        }
    }

}
public class PrimeNumber {
    public static void main(String[] args) {
        int[] Numbers = {55,12,2,7,10,13,25,67};

        for (int i=0;i<Numbers.length;i++ ) {
            Checker pc = new Checker(i);
            pc.display();
            System.out.println("   ");
        }
    }
}