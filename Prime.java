import java.util.Scanner;

public class Prime 
{
    public static void main (String args[])
    {
        soln obj=new soln();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked.");
        int num=sc.nextInt();
        System.out.println("the number is"+" " + obj.check(num) );
        sc.close();
    }
}
class soln
{
    String check(int num)
    {
        if (num<=1)
        {
            return ("not prime.");
        }
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            return("prime");
        }
        else
        {
            return("not prime.");
        }
    }
}
