import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("string ");
        String str = s1.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");
    }
}
