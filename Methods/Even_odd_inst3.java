package Methods;

import java.util.Scanner;
//Instance + boolean
public class Even_odd_inst3 
{
    public boolean evenoddinst(int number) 
    {
        if (number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        Even_odd_inst3 obj = new Even_odd_inst3();

        boolean result = obj.evenoddinst(number);

        //printing
        if(result)
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
