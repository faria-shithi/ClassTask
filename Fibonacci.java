class Fib {
    int count;
    Fib(int count) {
        this.count = count;
    }
    void generate() {
        int a = 0, b = 1;
        System.out.print("series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a);
            if (i < count - 1) System.out.print(", ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        System.out.println("numbers printed: " + count);
    }

}
public class Fibonacci {
    public static void main(String[] args) {
        Fib f1= new Fib(12);
        f1.generate();
    }
}











 /* 
 //array
class Fib {
    int count;
    int[] series;
    Fib(int count) {
        this.count = count;
        this.series = new int[count];
    }
    void generate() {
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < count; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
    }

    void print() {
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(series[i]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Total numbers: " + count);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        Fib f1 = new Fib(12);
        f1.generate();
        f1.print();
    }
}
    */