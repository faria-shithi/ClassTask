class Sum {
    public int sumEvenForLoop() {
        int sum = 0;
        for (int i = 2; i <= 20; i += 2)
             sum += i;
      return sum;
    }
    public int sumEvenWhileLoop() {
        int sum = 0, i = 2;
        while (i <= 20)  { 
                sum += i; i += 2;
             }
        return sum;
    }

    public int sumEvenDoWhileLoop() {
        int sum = 0, i = 2;
        do {
             sum += i; i += 2; 
            } 
            while (i <= 20);
        return sum;
    }
    public int sumOddForLoop() {
        int sum = 0;
        for (int i = 1; i <= 19; i += 2)
             sum += i;
        return sum;
    }

    public int sumOddWhileLoop() {
        int sum = 0, i = 1;
        while (i <= 19) {
             sum += i; i += 2;
             }
        return sum;
    }
    public int sumOddDoWhileLoop() {
        int sum = 0, i = 1;
        do {
             sum += i; i += 2;
             }
              while (i <= 19);
        return sum;
    }
}

public class OddEvenSum {
    public static void main(String[] args) {
    Sum s1 = new Sum();
        System.out.println("even sum");
        System.out.println("For Loop   : " + s1.sumEvenForLoop());
        System.out.println("While Loop : " + s1.sumEvenWhileLoop());
        System.out.println("Do-While   : " + s1.sumEvenDoWhileLoop());

        System.out.println("\n odd sum");
        System.out.println("For Loop: " + s1.sumOddForLoop());
        System.out.println("While Loop: " + s1.sumOddWhileLoop());
        System.out.println("Do-While: " + s1.sumOddDoWhileLoop());
   
    }
}
