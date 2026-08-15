import java.util.Scanner;

class palindrome
{
public static void main(String args[])
{
    soln obj= new soln();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number.");
    int num=sc.nextInt();
    System.out.println("the number entered is "+ obj.pal(num));
    sc.close();
}
}
class soln
{
    String pal(int num)
    {
        int rev=0;
        int num1=num;
        while (num>0)
        {
        int rem=num%10;
        rev=rev*10 + rem;
        num=num/10;
        }
        if ( rev==num1)
        {
            return(" palindrome.");
        }
        else
        {
            return(" not palindrome.");
        }
    }
}
