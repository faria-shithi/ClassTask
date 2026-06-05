class Printer {
    public void EvenForLoop() {
        System.out.print("For Loop: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + (i < 20 ? ", " : "\n"));
       
        }

    }
public void OddForLoop() {
        System.out.print("For Loop: ");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + (i < 19 ? ", " : "\n"));
        }
    }
    public void EvenWhileLoop() {
        System.out.print("While Loop : ");
        int i = 2;
        while (i <= 20) {
            System.out.print(i + (i < 20 ? ", " : "\n"));
            i += 2;
        }
    }
     public void OddWhileLoop() {
        System.out.print("While Loop: ");
        int i = 1;
        while (i <= 19) {
            System.out.print(i + (i < 19 ? ", " : "\n"));
            i += 2;
        }
    }
    public void EvenDoWhileLoop() {
        System.out.print("Do-While: ");
        int i = 2;
        do {
            System.out.print(i + (i < 20 ? ", " : "\n"));
            i += 2;
        } while (i <= 20);
}
 
      public void OddDoWhileLoop() {
        System.out.print("Do-While: ");
        int i = 1;
        do {
            System.out.print(i + (i < 19 ? ", " : "\n"));
            i += 2;
        } while (i <= 19);
    }
}

public class OddEvenPrint{
    public static void main(String[] args) {
        Printer p1 = new Printer();

        System.out.println("even");
        p1.EvenForLoop();
        p1.EvenWhileLoop();
        p1.EvenDoWhileLoop();

        System.out.println("odd");
        p1.OddForLoop();
        p1.OddWhileLoop();
        p1.OddDoWhileLoop();
    }
}
