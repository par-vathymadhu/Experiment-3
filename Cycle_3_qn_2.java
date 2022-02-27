/**Program with functions included within the main() class to find factorial and sum of digits of the number.**/


import java.util.*;

class Cycle_3_qn_2
{
  public static void main(String args[])
  {
    Scanner rd=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num=rd.nextInt();
    Cycle_3_qn_2 data=new Cycle_3_qn_2();
    data.fact(num);
    data.sum(num);
  }
  void fact(int num)
  {
    int tp=1;
    if(num==0)
      System.out.println("Factorial: 0");
    if(num==1)
      System.out.println("Factorial: 1");
    else
    {
      for(int i=1;i<=num;i++)
        tp=tp*i;
      System.out.println("Factorial: "+tp);
    }
    
  }

  void sum(int n)
  {
    int d,sum=0;
    while(n!=0)
    {
      d=n%10;
      sum=sum+d;
      n=n/10;
    }
    System.out.println("Sum of digits : "+sum);
  }
} 

/**

Output:


**/