import java.util.Scanner;
class Circle {
  double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double findArea() {
        return Math.PI * Math.pow(radius, 2);
  
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Circle c1 = new Circle(radius);
        System.out.println("Area of Circle: " + c1.findArea());
        scanner.close();
    }

}