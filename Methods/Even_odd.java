package Methods;

import java.util.Scanner;

public class Even_odd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = sc.nextInt();

        evenOdd1(number);

        sc.close();
    }
    
    public static void evenOdd1(int number) 
    {
        if (number % 2 == 0)
        {
            System.out.println("Even");
        }
        else 
        {
            System.out.println("Odd");
        }
    }
    
}
