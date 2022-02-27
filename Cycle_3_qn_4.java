/**Write a Java program to calculate the area of different shapes namely circle, rectangle, and triangle using the concept of method overloading.**/

import java.util.*;

class Cycle_3_qn_4
{
  public static void main(String args[])
  {
    Scanner dt=new Scanner(System.in);
    System.out.println("-----MENU-----");
    System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
    System.out.print("Choose a shape from the above menu whose area needs to be found: ");
    int sh=dt.nextInt();
    Cycle_3_qn_4 shape=new Cycle_3_qn_4();
    switch(sh)
    {
    case 1:
      System.out.print("Enter the radius : ");
      float r=dt.nextFloat();
      shape.area(r);
      break;
    case 2:
      System.out.print("Enter the length : ");
      float l=dt.nextFloat();
      System.out.print("Enter the breadth : ");
      float b=dt.nextFloat();
      shape.area(l,b);
      break;
    case 3:
      System.out.print("Enter the height: ");
      int len=dt.nextInt();
      System.out.print("Enter the base: ");
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


/**

Output:

-----MENU-----
1.Circle
2.Rectangle
3.Triangle
Choose a shape from the above menu whose area needs to be found: 1   
Enter the radius : 10
Area of the circle: 314.2857

-----MENU-----
1.Circle
2.Rectangle
3.Triangle
Choose a shape from the above menu whose area needs to be found: 2   
Enter the length : 2
Enter the breadth : 5
Area of the rectangle: 10.0

-----MENU-----
1.Circle
2.Rectangle
3.Triangle
Choose a shape from the above menu whose area needs to be found: 3   
Enter the height: 3
Enter the base: 2
Area of the triangle: 3
**/