
class Find {
    private int[] series;

    public Find(int[] series) {
        this.series = series;
    }
    public int Greatest() {
        int greatest = series[0]; 
        for (int i = 1; i < series.length; i++) {
            if (series[i] > greatest) {
                greatest = series[i];
            }
        }
        return greatest;
    }
    public void display() {
        System.out.print("Series  : ");
        for (int num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Greatest Number: " + Greatest());
    }


}
public class GreatestNumber {
    public static void main(String[] args) {
        int[] series = {11,56,45,73,69,88,33};
      Find f1 = new Find(series);
        f1.display();
    }
}
