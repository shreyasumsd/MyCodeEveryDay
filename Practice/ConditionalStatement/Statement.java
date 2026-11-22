package Practice.ConditionalStatement;

import java.util.Scanner;

public class Statement 
{
    /* public void conditionalStatements(int salary)
    {
        System.out.println("Your new salary is: " );
        if (salary <= 250000)
        {
            System.out.println(salary + 2500);
        }
        else
        {
            System.out.println(salary + 3500);
        }
    } */

    public void getMaximum(int a, int b, int c)
    {
        int max = a;

        if (b > max)
        {
            max = b;
        }
        if (c > max)
        {
            max = c;
        }
        System.out.println("Max is " +max);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        // int salary = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        Statement obj = new Statement();
        // obj.conditionalStatements(salary);

        obj.getMaximum(a, b, c);



    }    
}
