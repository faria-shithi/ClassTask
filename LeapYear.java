import java.util.Scanner;
class Checker {
    private int year;
    public Checker(int year) {
        this.year = year;

    }
    public boolean isLeapYear() {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public String getResult() {
        if (isLeapYear()) {
            return year + " leap year";
        } else {
            return year + " not leap year.";
        }
    }

}
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        Checker ch = new Checker(year);
        System.out.println(ch.getResult());
        scan.close();
    }
}