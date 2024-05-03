class Circle
{
    final double pi=3.14;
    double radius;
     Circle(double radius)
    {
        this.radius=radius;
        System.out.println("Value of PI: "+pi);
        System.out.println("Value of Radius: "+ radius);
    }
    public void calculate()
    {
        System.out.println("Area of Circle: "+(pi*radius*radius));
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        c.calculate();
    }
}
