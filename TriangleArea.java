class Triangle{
  double base,height;
  Triangle(double base,double height)
   {      
this.base=base;
this.height=height; 
     }
double findArea(){
return .5*base*height;
}

}
public class TriangleArea {
    public static void main(String[] args) {
        Triangle t=new Triangle(5,15);
        System.out.println("area"+t.findArea());
    }
}