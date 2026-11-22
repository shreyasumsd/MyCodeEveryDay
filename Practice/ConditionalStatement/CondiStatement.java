package Practice.ConditionalStatement;

import java.util.Scanner;

public class CondiStatement 
{
    public static void findEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Number is even");
        }
        if(num % 2 == 1)
        {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        findEvenOdd(num);

        sc.close();
    }
    
}
