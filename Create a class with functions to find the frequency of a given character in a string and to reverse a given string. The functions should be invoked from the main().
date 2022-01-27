import java.util.*;

class str_fun
{
    public static void main(String args[])
    {  
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String wrd=data.nextLine();
        System.out.println("Enter the character whose frequency needs to be found : ");
        char chr=data.next().charAt(0);
        int len=wrd.length();

        wrd=wrd.toLowerCase();
        char arr[]=wrd.toCharArray();
        str_fun input=new str_fun();
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
