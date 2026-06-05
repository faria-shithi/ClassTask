class Reverser {
    private int[] series;
    public Reverser(int[] series) {
        this.series = series;
    }
    public int[] reverse() {
        int n = series.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = series[n - 1 - i];
         }
        return reversed;

    }
    public void display() {
        System.out.print("original ");
        for (int num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("reversed : ");
        for (int num : reverse()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
public class Reverse{
    public static void main(String[] args) {
        int[] series = {5,15,30,55,60};
          Reverser sr = new Reverser(series);
        sr.display();
    }
}
