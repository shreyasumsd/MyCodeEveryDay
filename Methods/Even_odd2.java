package Methods;

import java.util.Scanner;

//Static + Return

public class Even_odd2 
{
    public static int evenOdd(int number)
    {
        if(number % 2 == 0)
        {
             return 0 ;
        }

        else
            {
                return 1;
            }
    }
    


    
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = sc.nextInt();

        evenOdd(number);

        sc.close();
    }   
}
