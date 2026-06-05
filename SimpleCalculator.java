import java.util.Scanner;
class Calcu {
    private int a,b;
    private char operator;
    public Calcu(int a, int b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }
 public String calculate() {
        if (operator == '+') {
            return a + " + " + b + " = " + (a + b);
        } 
        else if (operator == '-')
            return a + " - " + b + " = " + (a - b);
         else if (operator == '*')
            return a + " * " + b + " = " + (a * b);
         else if (operator == '/') 
            {
            if (b == 0) {
                return "error";
            }
            return a + " / " + b + " = " + (a / b);
        } 
        else {
            return "Invalid ";
        }
    }


}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Integer a: ");
        int a = scan.nextInt();
        System.out.print("Integer b: ");
        int b = scan.nextInt();
        System.out.print("operator (+, -, *, /): ");
        char ch = scan.next().charAt(0);
        Calcu calc = new Calcu(a, b, ch);
        System.out.println(calc.calculate());
        scan.close();
        
    }
}
 /* 
 import java.util.Scanner;
class Calculator {
    public int a;
    public int b;
    public char operator;
    public Calculator(int a, int b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public String calculate() {
        if (operator == '+') {
            return a + " + " + b + " = " + (a + b);
        } else if (operator == '-') {
            return a + " - " + b + " = " + (a - b);
        } else if (operator == '*') {
            return a + " * " + b + " = " + (a * b);
        } else if (operator == '/') {
            if (b == 0) {
                return "error";
            }
            return a + " / " + b + " = " + (a / b);
        } else {
            return "invalid";
        }
    }


}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Integer a: ");
        int a = scan.nextInt();

        System.out.print(" Integer b: ");
        int b = scan.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = scan.next().charAt(0);
        Calculator calc = new Calculator(a, b, ch);


        // public gula directly access kora jay private gulay encapsulation lage

        System.out.println("a = " + calc.a);
        System.out.println("b = " + calc.b);
        System.out.println("operator = " + calc.operator);
        System.out.println(calc.calculate());
        scan.close();
    }
}
 
 
 */