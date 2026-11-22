package Methods;

import java.util.*;
//Instance + void
public class Even_odd_Inst 
{
    public void evenoddinst(int number) 
    {
        if (number % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        Even_odd_Inst obj = new Even_odd_Inst();

        obj.evenoddinst(number);

        sc.close();

    }
    
}
