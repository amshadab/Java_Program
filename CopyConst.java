class Rectangle{
    int length, breadth;
    Rectangle(int length,int breadth)
    {
      this.length=length;
      this.breadth=breadth;
  
    }
    Rectangle(Rectangle obj)
    {
      System.out.println(obj.length*obj.breadth);
    }
  }
  public class CopyConst {
  
    public static void main(String[] args) {
      Rectangle r1 = new Rectangle(5,6);
      Rectangle r2 = new Rectangle(r1);
    }
  }