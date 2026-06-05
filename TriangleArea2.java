class Triangle {
    double a, b, c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
   double findArea() {
        double s = (a + b + c) / 3;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
   
    }

}
public class TriangleArea2  {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 6, 7);
        System.out.println("area " + t1.findArea());
   
    }
}
