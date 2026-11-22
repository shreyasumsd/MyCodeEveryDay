package Methods;

import java.util.Scanner;

//Static + boolean 

public class Even_odd3  
{
    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = sc.nextInt();

        boolean result = isEven(number);

        //printing
        if (result)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

        sc.close();

    }
    
}
