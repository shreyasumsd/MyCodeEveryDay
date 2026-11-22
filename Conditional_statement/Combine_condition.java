package Conditional_statement;

import java.util.Scanner;

public class Combine_condition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter height: ");
        int height = sc.nextInt();

        System.out.println("Enter percentage: ");
        int percentage = sc.nextInt();

        System.out.println("Are you medically fit: ");
        Boolean medicalFit = sc.nextBoolean();

        System.out.println("\n======AND(&&)=======");

        //All condition must be true

        if (age >= 18 && height >= 170 && medicalFit)
        {
            System.out.println("Eligible for INDIAN ARMY");
        }
        else
        {
            System.out.println("Not Eligible for INDIAN ARMY");
        }
        
        //OR 

        System.out.println("\n======OR(||)=======");
        System.out.println("|| --> Atleast one condition must be true");

        if(percentage >= 90 || medicalFit)
        {
            System.out.println("Special Consideration");
        }
        else
        {
            System.out.println("No Special Consideration");
        }

        System.out.println();

        // Reverse boolean

        System.out.println("Reverse Boolean");

        if(!medicalFit)
        {
            System.out.println("Medical test failed");
        }
        else
        {
            System.out.println("Passed");
        }

        System.out.println();

        //Combine all operators

        System.out.println("Combine all operators");
        if ((height >= 170 || age >= 20) && (percentage >= 60 || medicalFit))
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }

        sc.close();
    }
}
