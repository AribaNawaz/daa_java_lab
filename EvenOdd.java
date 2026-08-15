import java.util.Scanner;

class EvenOdd
{
public static void main(String args[])
{
soln obj=new soln();
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");
int num= sc.nextInt();

System.out.println("the number is" + obj.check(num));

sc.close();
}
}
class soln
{
    String check(int num)
    {
        if (num%2==0)
        {
            return(num+" is an even number");
        }
        else
        {
            return(num+ " is not an even number");
        }
    }
}