import java.util.*;

class sum_fact
{
  public static void main(String args[])
  {
    Scanner rd=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=rd.nextInt();
    sum_fact data=new sum_fact();
    data.fact(num);
    data.sum(num);
  }
  void fact(int f)
  {
    int tp=1;
    if(f==0)
      System.out.println("Factorial: 0");
    if(f==1)
      System.out.println("Factorial: 1");
    else
    {
      for(int i=0;i<=f;i++)
      {
        tp=tp*f;
        f--;
      }
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
