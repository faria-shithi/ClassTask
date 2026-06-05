 class Calculator {
    double[] values;
    Calculator(double[] values) {
        this.values = values;
    }
    double findAverage() {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
public class Averagee {
    public static void main(String[] args) {
        double[] numbers = {11.4,66,87,8.8,12,50};
        Calculator calc = new Calculator(numbers);
        System.out.println("Average: " + calc.findAverage());
    }
}
 
 
 
 


 
 
 /*public class Averagee {
    private double[] values;
    public Averagee(double[] values) {
        this.values = values;
    }
    public double calculate() {
        double sum = 0;
        for (int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return sum / values.length;
    }
    public static void main(String[] args) {
        double[] numbers = {34,55.6,66,78,80.93};
        Averagee calc = new Averagee(numbers);
        System.out.println("Average: " + calc.calculate());
    }
}
*/
