package Methods;

public class MethodCallingMethod 
{
    public static void greet() 
    {
        System.out.println("hello");
    }

    public static void welcome() 
    {
        System.out.println("welcome");
        greet();
        System.out.println("Welcome method ends");
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Main starts");
        welcome();

        System.out.println("Main ends");
        
    }
}
