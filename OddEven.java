import java.util.Scanner;
class Checker {
    private int number;

    public Checker(int number) {
        this.number = number;

    }
  public boolean isEven() {
        return (number % 2 == 0);

    }
   public String getResult() {
        if (isEven())
             {
            return number + " even ";
        } 
        else 
            {
            return number + " odd ";
        }
    }

}
public class OddEven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        Checker ch = new Checker(userInput);
        System.out.println(ch.getResult());
        scanner.close();
    }

}