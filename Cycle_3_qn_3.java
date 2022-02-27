/**Create a class with functions to find the frequency of a given character in a string and to reverse a given string. The functions should be invoked from the main().**/

import java.util.*;

class Cycle_3_qn_3
{
    public static void main(String args[])
    {  
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String wrd=data.nextLine();
        System.out.print("Enter the character whose frequency needs to be found : ");
        char chr=data.next().charAt(0);
        int len=wrd.length();

        wrd=wrd.toLowerCase();
        char arr[]=wrd.toCharArray();
        Cycle_3_qn_3 input=new Cycle_3_qn_3();
        input.freq(arr,len,chr);
        input.rev(arr,len);
    }

    void freq(char arr[],int len,char fq)
    {
        int a=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==fq)
                a++;
        }
        if(a!=0)
        System.out.println("The character occurs "+ a +" times");
        else
        System.out.println("The character isn't found");
    }

    void rev(char arr[],int len)
    {
        char rv[]=new char[len];
        for(int i=0;i<len;i++)
            rv[i]=arr[len-i-1];
        String b=new String(rv);
        System.out.println("Reversed String: "+b);
    }
}


/**
Output:
Enter the string : Hey there
Enter the character whose frequency needs to be found : y
The character occurs 1 times
Reversed String: ereht yeh

 **/