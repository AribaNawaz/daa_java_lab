import java.util.Scanner;

public class SwappingNo {
    public static void main(String args[])
    {
        soln obj=new soln();
        Scanner sc=new Scanner(System.in);

    System.out.println("Enter the two numbers to be swapped");
    System.out.println("a=?");
    int a= sc.nextInt();
    System.out.println("b=?");
    int b= sc.nextInt();
System.out.println("a="+a);
System.out.println("b="+b);

        System.out.println("if the swapping is to be done using a third variable enter 0 if not then enter 1");
        int choice=sc.nextInt();

        if(choice==0)
        {
         obj.with_third_variable(a,b);
        }
        else if(choice==1)
        {
        obj.without_third_variable(a,b);
        }
        else
        {
         System.out.println("enter only 0 or 1 for results.");
        }
        sc.close();
    }
}
class soln
{
    int c;

    void with_third_variable(int a,int b)
    {
    c= a;
    a= b;
    b= c;
    System.out.println("now a= " + a + "and b=" + b);
    }

    void without_third_variable(int a,int b)
    {
    a = a + b; // a becomes 30
    b = a - b; // b becomes 10 (original a)
    a = a - b; // a becomes 20 (original b)
    System.out.println("now a= " + a + "and b=" + b);
    }
    }
