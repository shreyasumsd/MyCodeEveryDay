import java.util.*;

public class Scanner_class 
{
    public static void main(String[] args) 
    {
        /* Scanner sc = new Scanner(System.in); // sc -->[  ]
        int a, b, c; // place to store values
        
        System.out.print("Enter the first number: "); // "25"
        a = sc.nextInt(); // this is now 25
        
        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        c = a + b;

        System.out.println("Sum: " + c); */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int name = sc.nextInt();
        System.out.println("Entered number is: " + name);
        

        sc.close();
    }
}