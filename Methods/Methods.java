package Methods;

public class Methods 
{
    //Static Methods
    public static void greet() //no args, no return method
    {
        System.out.println("Hello");
    }

    public static void printSum(int x, int y) //args, no return
    {
        System.out.println(x+y);
    }

    public static int getNumber() //no args, but returns
    {
        return 1;
    }

    public static int max(int a, int b) //args and returns
    {
        if(a < b)
            return a;
        else
            return b;   
    }

    public static void main(String[] args) 
    {
        int a = 20, b = 30;
        greet();
        printSum(15,10);

        int d = getNumber();
        System.out.println(d);
        
        int c = max(a,b);
        System.out.println(c);
    }
}
