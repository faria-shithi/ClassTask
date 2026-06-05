import java.util.Scanner;
class Checker {
    private double input;
    public Checker(double input) {
        this.input = input;

    }
    public boolean isPositive() {
        return (input > 0) && (input % 1 == 0);

    }
    public String getResult() {
        if (isPositive()) {
            return input + " is positive";
        } 
        else {
            return input + " is not positive";

        }
    }


}
public class PositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double userInput = scanner.nextDouble();
       Checker ch = new Checker(userInput);
        System.out.println(ch.getResult());
        scanner.close();

    }
}