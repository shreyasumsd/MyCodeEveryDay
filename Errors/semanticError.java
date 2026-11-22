//Day-8 (01-oct-2026)

package Errors;

public class semanticError {
   public static void main(String[] args) 
    {
        //Syntax error 
        
        // Semantic error -----> logical error - code will compile and run but out is not as expected - JVM gives this error 
        int a = 12;
        int b = 13;

        int area = 2*(a+b); //logical error
        //fix the formula of area

        System.out.println(area);
    }
    
}
