class Numbers {
    private int[] numbers;
    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }
    public void Count() {
        int odd = 0, even = 0;
        for (int n : numbers) {
            if (n % 2 == 0)
                 even++;
            else
                 odd++;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) 
                System.out.print(", ");
        }
        System.out.println(" ");
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}

public class OddEvenCount {
    public static void main(String[] args) {
        int[] nums = {1,11,32,4,5,53,6,67,15};
        Numbers n1 = new Numbers(nums);
        n1.Count();
    }
}
