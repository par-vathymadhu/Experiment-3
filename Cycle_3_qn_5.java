/**Write a Java program to calculate the perimeter of different shapes namely circle and rectangle using the concept of constructor overloading.**/

import java.util.*;

class Cycle_3_qn_5
{
    Cycle_3_qn_5(float r)
    {
        float p=(2*22*r)/7;
        System.out.println("Perimeter: "+p);
    }
    Cycle_3_qn_5(float l,float b)
    {
        float p=2*(l+b);
        System.out.println("Perimeter:"+p);
    }
    Cycle_3_qn_5(double w)
    {}
}

class perimeter
{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.print("1.Circle\n2.Rectangle\nChoose the shape whose perimeter needs to be found: ");
        int sh=read.nextInt();
        Cycle_3_qn_5 find=new Cycle_3_qn_5(4.93);
        switch(sh)
        {
            case 1:
                System.out.print("Enter the radius : ");
                float r=read.nextFloat();
                find=new Cycle_3_qn_5(r);
                break;
            case 2:
                System.out.print("Enter the length : ");
                float l=read.nextFloat();
                System.out.print("Enter the breadth : ");
                float b=read.nextFloat();
                find=new Cycle_3_qn_5(l,b);
                break;
            default :
                System.out.println("Invalid Entry!");
        }
    }
}


/**

Output:

-----MENU-----
1.Circle
2.Rectangle
Choose the shape whose perimeter needs to be found: 1
Enter the radius : 100
Perimeter: 628.5714

-----MENU-----
1.Circle
2.Rectangle
Choose the shape whose perimeter needs to be found: 2
Enter the length : 4
Enter the breadth : 6
Perimeter:20.0

**/