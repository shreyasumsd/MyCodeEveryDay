package Methods;

import java.util.Scanner;

//Instance return

public class Even_odd_inst1 
{

    public int evenoddinst1(int number) 
    {
        if(number % 2 == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
        
    } 
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        Even_odd_inst1 obj = new Even_odd_inst1();

        int result = obj.evenoddinst1(number);

        if(result == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");;
        }
        
        sc.close();


        
    }
    
}
