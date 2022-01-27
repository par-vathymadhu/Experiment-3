import java.util.*;

class area
{
  public static void main(String args[])
  {
    Scanner dt=new Scanner(System.in);
    System.out.println("-----MENU-----");
    System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
    System.out.println("Choose a shape from the above menu whose area needs to be found.");
    int sh=dt.nextInt();
    area shape=new area();
    switch(sh)
    {
    case 1:
      System.out.println("Enter the radius : ");
      float r=dt.nextFloat();
      shape.area(r);
      break;
    case 2:
      System.out.println("Enter the length : ");
      float l=dt.nextFloat();
      System.out.println("Enter the breadth : ");
      float b=dt.nextFloat();
      shape.area(l,b);
      break;
    case 3:
      System.out.println("Enter the height: ");
      int len=dt.nextInt();
      System.out.println("Enter the base: ");
      int base=dt.nextInt();
      shape.area(len,base);
    default:
      System.out.println("Invalid Entry!");
    }
  }

  void area(float r)
  {
    float a= (22*r*r)/7;
    System.out.println("Area of the circle: "+a);
  }
  void area(float l,float b)
  {
    float a=l*b;
    System.out.println("Area of the rectangle: "+a);
  }
  void area(int l,int b)
  {
    int a=(l*b)/2;
    System.out.println("Area of the triangle: "+a);
  }
}
