import java.util.Scanner;
import static java.lang.Math.*;
public class multi
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a= scan.nextInt();
        System.out.println("\nEnter second number : ");
        int b=scan.nextInt();
        int c=0;
        for(int i=0; i<b; i++)
        {
            c=c+a;
        }
        System.out.println("\nMultiplication of a and b is = " + c);
    }
}