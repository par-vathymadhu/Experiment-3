/**Java program to concatenate two numbers and strings using method overloading concept.**/

import java.util.*;

class Cycle_3_qn_6
{
    void con(int x,int y)
    {
        System.out.println("Concatenated Integers: "+x+y);
    }

    void con(String x, String y)
    {
        System.out.println("Concatenated Strings: "+x+" "+y);
    }
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        Cycle_3_qn_6 fun=new Cycle_3_qn_6();
        
        System.out.print("Enter the first no : ");
        int a=read.nextInt();
        System.out.print("Enter the second no : ");
        int b=read.nextInt();
        fun.con(a,b);
            
        System.out.print("Enter the first string : ");
        String str1=read.next();
        System.out.print("Enter the second string : ");
        String str2=read.next();
        fun.con(str1,str2);
            
    }
}

/**
Output:
 
Enter the first no : 10
Enter the second no : 20
Concatenated Integers: 1020
Enter the first string : Always
Enter the second string : you
Concatenated Strings: Always you
**/