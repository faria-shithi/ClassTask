class Converter {
    double celsius;
    Converter(double celsius) {
        this.celsius = celsius;

    }
  double Fahrenheit() {
        return (celsius * 9 / 5) + 32;

    }

}

public class Temperature {
    public static void main(String[] args) {
        Converter c1 = new Converter(108);
        System.out.println(c1.celsius + "°C = " + c1.Fahrenheit() + "°F");
    }
}