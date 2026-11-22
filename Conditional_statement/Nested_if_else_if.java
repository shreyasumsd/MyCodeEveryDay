package Conditional_statement;

import java.util.Scanner;

public class Nested_if_else_if 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter age: ");
        int age = sc.nextInt(); // String to int

        System.out.println("enter percentage: ");
        int percentage = sc.nextInt();

        if(age >= 18)
        {
            if(percentage >= 90)
            {
                System.out.println("Officer");
            }
            else if (percentage >= 75)
            {
                System.out.println("Technical");
            }
            else if (percentage >= 60)
            {
                System.out.println("GD");
            }
            else
            {
                System.out.println("Not Qualified");
            }
        }
        else
        {
        System.out.println("Age not Eligible");
        }

        sc.close();
    }
}
