import java.util.Scanner;

public class Fibonacci  
{
    public static void main(String args[])
{
    Scanner sc=new Scanner (System.in);
    int first=0;
    int sec=1;
    System.out.println("Enter the number of terms of fibonacci series.");
    int n= sc.nextInt();
    if (n==0)
    {
        System.out.println("Enter a positive number.");
    }
    else if (n==2)
    {
        System.out.println("Fibonacci Series:" + first + " " + sec);
    }
    else if (n==1)
    {
        System.out.println("Fibonacci Series:" + first);
    }
    else
    {
        for  (int i=1; i<=n; i++)
        {
            int next= first + sec;
            System.out.print(first + " ");
            first = sec;
            sec= next;
        }
        
    }
    sc.close();
}
}
