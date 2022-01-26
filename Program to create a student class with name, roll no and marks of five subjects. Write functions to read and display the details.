import java.util.*;

class student
{
    String name;
    int roll_no,i;
    int mrk[]=new int[5];

    void getdata()
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Roll No : ");
        roll_no=read.nextInt();
        System.out.print("Name : ");
        name=read.next();
        System.out.println("Enter the marks scored: ");
        for(i=0;i<5;i++)
        {
            System.out.print("Subject "+(i+1)+" : ");
            mrk[i]=read.nextInt();
        }
    }

    void putdata()
    {
        System.out.println("Roll NO. : "+roll_no);
        System.out.println("Name : "+name);
        System.out.println("Marks scored : ");
        for(i=0;i<5;i++)
            System.out.println("Subject "+(i+1)+" : "+mrk[i]);
    }
    public static void main(String args[])
    {
        student dtl=new student();
        System.out.println("Enter the following details: ");
        dtl.getdata();
        System.out.println("-----Student Details-----");
        dtl.putdata();
    }
}
