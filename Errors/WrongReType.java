//Day-8 (01-oct-2026)

package Errors;

public class WrongReType 
{    
    static int add() // instead of int replace to string 
    {
         // wrong return type
        //fix 1
        return 110;
    }

     public static void main(String[] args) 
    {

     // wrong return type
        System.out.println(add());
    }
}
