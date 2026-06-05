class Triangle {
    double arm;
    Triangle(double arm) {
        this.arm = arm;

    }
  double findArea() {
        return (Math.sqrt(3) / 4) * Math.pow(arm, 2);
  
    }

}
public class EquilateralTriangle {
    public static void main(String[] args) {
         Triangle t1 = new Triangle(6);
        System.out.println("Area : " + t1.findArea());
    }
    
}