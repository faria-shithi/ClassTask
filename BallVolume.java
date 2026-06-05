import java.util.Scanner;
class Ball{
    double radius;
    Ball (double radius){
        this.radius=radius;
    }
    double findVolume(){
        return (4.0/3)*Math.PI*Math.pow(radius,3);

    }
}

public class BallVolume {
    public static void main(String[] args) {
         Scanner s1 =new Scanner(System.in);
            System.out.print("radius");
            double radius=s1.nextDouble();
            Ball b1=new Ball(radius);
            System.out.println("volume:"+b1.findVolume());
            s1.close();
    }
}
