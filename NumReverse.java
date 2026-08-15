import java.util.Scanner;

public class NumReverse 
{
    public static void main(String[] args) 
    {
        soln obj=new soln();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be reversed.");
        int num=sc.nextInt();
        obj.reverse(num);//143 ;  3 /14  ; 4 = 34 / 1 ; 1 = 341 / null
        sc.close();
    }
}
class soln
{
    void reverse(int num)
    {    
    int rev=0;
    while (num>0) //143;14
    {
        int rem=num%10; //3;4
        rev=rev*10 + rem;//34
        num=num/10; //14;1
    }
    System.out.println("The reversed number is " + rev );
    }
}
