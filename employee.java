/**Java program to create a class employee with details such as empno, name and phone number. Read details of at least 5employees and print**/

import java.util.*;

class Employee
{
    int emp_no;
    String name;
    int mob_no;

    void read(int i)
    {
        Scanner read=new Scanner(System.in);
        System.out.println("---Employee "+(i+1)+"---");
        System.out.print("Employee no : ");
        emp_no=read.nextInt();
        System.out.print("Name : ");
        name=read.next();
        System.out.print("Mobile number : ");
        mob_no=read.nextInt();
    }

    void display()
    {
        System.out.println("Employee id : "+emp_no);
        System.out.println("Name : "+name);
        System.out.println("Phone no : "+mob_no);
    }
    public static void main(String args[])
    {
        Employee emp[]=new Employee[5];
        int i;
        System.out.println("Enter the following details: ");
        for(i=0;i<5;i++)
        {
            emp[i]=new Employee();
            emp[i].read(i);
        }
        System.out.println("\n\n---Employee Details---\n");
        for(i=0;i<5;i++)
            emp[i].display();
    }
}

/**
Output:


**/